package fr.alba0404.astuce.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class for requests to Astuce's server.
 * @author Alba0404
 *
 */
class HTTPRequester {
	
	private final static String URL = "https://www.reseau-astuce.fr/fr/horaires-a-larret/28/StopTimeTable/NextDeparture";
	private final static String USER_AGENT = "Mozilla/5.0";
	private final static String CONTENT_TYPE = "application/x-www-form-urlencoded";
	private final static String ACCEPT_LANGUAGE = "fr-FR,fr;q=0.9,en;q=0.8";
	
	private static URL url;
	private static HttpURLConnection con;
	private static OutputStreamWriter writer;
	private static BufferedReader in;
	private static String inputLine;
	

	/**
	 * Return the time result of the request.
	 * @param request The request to send to the server for the time.
	 * @return The time in result of the request.
	 * @throws IOException F*ck errors ! I'm the boss ! (Errors manage in next step).
	 */
	static int requestTime(String request) throws IOException {
		int time = -1;
		
		url = new URL(URL);
		con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.addRequestProperty("Content-type", CONTENT_TYPE);
		con.setRequestProperty("Accept-Language", ACCEPT_LANGUAGE);
		con.setDoOutput(true);
		
		writer = new OutputStreamWriter(con.getOutputStream());
		writer.write(request);
		writer.close();
		con.connect();
		
		in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
        	if(inputLine.contains("dans")) {
        		int i = inputLine.indexOf("dans");
        		try {
        			time = Integer.valueOf(inputLine.substring(i+11, i+13));
        		}catch(Exception e) {
        			time = Integer.valueOf(inputLine.substring(i+11, i+12));
        		}
        		break;
        	}
        }
        
        in.close();
        con.disconnect();
		
        return time;
	}

}
