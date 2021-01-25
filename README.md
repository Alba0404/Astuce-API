# Astuce-API
API pour le réseau Astuce, réseau de transports en commun de la Métropole Rouen Normandie.

## Installation
Ajouter le fichier jar à votre projet en tant que bibliothèque liée. <br/>
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
									// sur la ligne de métro à l'arrêt Voltaire en direction de Boulingrin.
									// peut lever l'exception StationNotOnLineException

List<Station> stations = Astuce_API.getStations(Line.METRO); // Retourne une liste des stations se trouvant sur la ligne de métro.

Station s = stations.get(0);
List<Line> lines = s.getLines();		// Retourne une liste des lignes passant par cette station.
int sens = s.getSens();				// Retourne le sens de la station sur la ligne sÃ©lectionnÃ©e (1 ou 2).
int id = s.getid();				// Retourne un entier représentant l'id unique de la station sur le réseau.
String destination = s.getDestination();	// Retourne la destination de la ligne de la station.

```

<br/>

## En cours... / In dev...
- Ajout des stations autres que celles du métro.
- ...

<br/>

## Licence / License
Le terme *programme* représente le fichier .jar ainsi que ses sources, fichiers binaires et ressources attachées. <br/>
- Ce programme est distribué sans aucune garantie.
- Ce programme est la propriété intellectuelle de son développeur : [Alba0404](mailto:alba0404@orange.fr).
- Il est autorisé de télécharger et exécuter ce programme à des fins commerciales ou non du moment que celles-ci sont légales.
- Il est autorisé de faire de la rétro-ingéniérie.
- Il est interdit de vendre ce programme sous une quelconque forme, modifié ou non.
- **Si le programme est utilisé dans un projet, quelque soit la forme de celui-ci, la citation du développeur est obligatoire**. De plus ce projet doit respecter les lois en vigueurs.
