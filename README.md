# Astuce-API
API pour le r�seau Astuce, r�seau de transports en commun de la M�tropole Rouen Normandie.

## Installation
Ajouter le fichier jar � votre projet en tant que biblioth�que li�e. <br/>
### Eclipse :
Clic-droit sur le projet => *Properties* => *Java Build Path* => *Libraries* => *Add External JARs* => Choisir le .jar de l'API

<br/>

## Usage
Javadoc disponible ici : [https://alba0404.github.io/Astuce-API/](https://alba0404.github.io/Astuce-API/)

```java
import fr.alba0404.astuce.api.*;

Astuce_API api = new Astuce_API();
int next = api.getNext(Line.METRO, Station.VOLTAIRE, 2);	// Retourne le temps en minute avant le prochain transport
								// sur la ligne de m�tro � l'arr�t Voltaire en direction de Boulingrin (2).
								// peut lever l'exception StationNotOnLineException si la station indiqu�e
								// ne se trouve pas sur la ligne.

List<Station> stations = api.getStations(Line.METRO); // Retourne une liste des stations se trouvant sur la ligne de m�tro.

Station s = Station.BOULINGRIN
List<Line> lines = s.getLines();		// Retourne une liste des lignes passant par cette station.
String name = s.getName();			// Retourne le nom de la station tel qu'utilis� par le r�seau Astuce.
int id = s.getId();				// Retourne un entier repr�sentant l'id unique de la station sur le r�seau.
String destination = s.getDestination();	// Retourne la destination de la ligne de la station.

```

<br/>

## En cours... / In dev...
- Finalisation de l'ajout des lignes et stations
- Ajouter les lignes scolaires.

<br/>

## Licence / License
Le terme *programme* repr�sente le fichier .jar ainsi que ses sources, fichiers binaires et ressources attach�es. <br/>
- Ce programme est distribu� sans aucune garantie.
- Ce programme est la propri�t� intellectuelle de son d�veloppeur : [Alba0404](mailto:alba0404@orange.fr).
- Il est autoris� de t�l�charger et ex�cuter ce programme � des fins commerciales ou non du moment que celles-ci sont l�gales.
- Il est autoris� de faire de la r�tro-ing�ni�rie.
- Il est interdit de vendre ce programme sous une quelconque forme, modifi� ou non.
- **Si le programme est utilis� dans un projet, quelque soit la forme de celui-ci, la citation du d�veloppeur est obligatoire**. De plus ce projet doit respecter les lois en vigueurs.
