# Astuce-API
API pour le réseau Astuce, réseau de transports en commun de la Métropole Rouen Normandie.

## Installation
Ajouter le fichier jar à votre projet en tant que bibliothèque liée. <br/>
### Eclipse :
Clic-droit sur le projet => *Properties* => *Java Build Path* => *Libraries* => *Add External JARs* => Choisir le .jar de l'API

<br/>

## Usage
Javadoc disponible ici : [https://alba0404.github.io/Astuce-API/](https://alba0404.github.io/Astuce-API/)

```java
import fr.alba0404.astuce.api.*;

Astuce_API api = new Astuce_API();
int next = api.getNext(Line.METRO, Station.VOLTAIRE, 2);	// Retourne le temps en minute avant le prochain transport
								// sur la ligne de métro à l'arrêt Voltaire en direction de Boulingrin (2).
								// peut lever l'exception StationNotOnLineException si la station indiquée
								// ne se trouve pas sur la ligne.

List<Station> stations = api.getStations(Line.METRO); // Retourne une liste des stations se trouvant sur la ligne de métro.

Station s = Station.BOULINGRIN
List<Line> lines = s.getLines();		// Retourne une liste des lignes passant par cette station.
String name = s.getName();			// Retourne le nom de la station tel qu'utilisé par le réseau Astuce.
int id = s.getId();				// Retourne un entier représentant l'id unique de la station sur le réseau.
String destination = s.getDestination();	// Retourne la destination de la ligne de la station.

```

<br/>

## En cours... / In dev...
- Finalisation de l'ajout des lignes et stations
- Ajouter les lignes scolaires.

<br/>

## Licence / License
Le terme *programme* représente le fichier .jar ainsi que ses sources, fichiers binaires et ressources attachées. <br/>
- Ce programme est distribué sans aucune garantie.
- Ce programme est la propriété intellectuelle de son développeur : [Alba0404](mailto:alba0404@orange.fr).
- Il est autorisé de télécharger et exécuter ce programme à des fins commerciales ou non du moment que celles-ci sont légales.
- Il est autorisé de faire de la rétro-ingéniérie.
- Il est interdit de vendre ce programme sous une quelconque forme, modifié ou non.
- **Si le programme est utilisé dans un projet, quelque soit la forme de celui-ci, la citation du développeur est obligatoire**. De plus ce projet doit respecter les lois en vigueurs.
