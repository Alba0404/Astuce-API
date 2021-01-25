# Astuce-API
API pour le r�seau Astuce, r�seau de transports en commun de la M�tropole Rouen Normandie.

## Installation
Ajouter le fichier jar � votre projet en tant que biblioth�que li�e. <br/>
### Eclipse :
Clic-droit sur le projet => *Properties* => *Java Build Path* => *Libraries* => *Add External JARs* => Choisir le .jar de l'API

<br/>

## Usage
```java
import fr.alba0404.astuce.api.Astuce_API;
import fr.alba0404.astuce.api.enums.Line;
import fr.alba0404.astuce.api.enums.Station;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

int next = Astuce_API.getNext(Line.METRO, Station.VOLTAIRE_BOULINGRIN);	// Retourne le temps en minute avant le prochain transport
									// sur la ligne de m�tro � l'arr�t Voltaire en direction de Boulingrin.
									// peut lever l'exception StationNotOnLineException

List<Station> stations = Astuce_API.getStations(Line.METRO); // Retourne une liste des stations se trouvant sur la ligne de m�tro.

Station s = stations.get(0);
List<Line> lines = s.getLines();		// Retourne une liste des lignes passant par cette station.
int sens = s.getSens();				// Retourne le sens de la station sur la ligne sélectionnée (1 ou 2).
int id = s.getid();				// Retourne un entier repr�sentant l'id unique de la station sur le r�seau.
String destination = s.getDestination();	// Retourne la destination de la ligne de la station.

```

<br/>

## En cours... / In dev...
- Ajout des stations autres que celles du m�tro.
- ...

<br/>

## Licence / License
Le terme *programme* repr�sente le fichier .jar ainsi que ses sources, fichiers binaires et ressources attach�es. <br/>
- Ce programme est distribu� sans aucune garantie.
- Ce programme est la propri�t� intellectuelle de son d�veloppeur : [Alba0404](mailto:alba0404@orange.fr).
- Il est autoris� de t�l�charger et ex�cuter ce programme � des fins commerciales ou non du moment que celles-ci sont l�gales.
- Il est autoris� de faire de la r�tro-ing�ni�rie.
- Il est interdit de vendre ce programme sous une quelconque forme, modifi� ou non.
- **Si le programme est utilis� dans un projet, quelque soit la forme de celui-ci, la citation du d�veloppeur est obligatoire**. De plus ce projet doit respecter les lois en vigueurs.
