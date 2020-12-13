# Astuce-API
API pour le réseau Astuce, réseau de transports en commun de la Métropole Rouen Normandie.

## Installation
Ajouter le fichier jar à votre projet en tant que bibliothèque liée. <br/>
### Eclipse :
Clic-droit sur le projet => Properties => Java Build Path => Libraries => Add External JARs => Choisir le .jar de l'API

<br/>

## Usage
```java
import fr.alba0404.astuce.api.Astuce_API;
import fr.alba0404.astuce.api.enums.Line;
import fr.alba0404.astuce.api.enums.Station;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

int next = Astuce_API.getNext(Line.METRO, Station.VOLTAIRE_BOULINGRIN);	// Retourne le temps en minute avant le prochain transport
									// sur la ligne de métro à l'arrêt Voltaire en direction de Boulingrin.

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
Ce programme reste la propriété intellectuelle du développeur : [Alba0404](mailto:alba0404@orange.fr). <br/>
Il est autorisé de télécharger et exécuter ce programme à des fins privées ou commerciales du moment que celles-ci sont légales. <br/>
Il est interdit de vendre ce programme sous une quelconque forme, modifié ou non. <br/>
Si le programme est utilisé dans un projet, la citation du développeur est obligatoire. Ce projet doit respecter les conditions précédentes.
