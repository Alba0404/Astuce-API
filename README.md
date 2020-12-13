# Astuce-API
API pour le réseau Astuce, réseau de transports en commun de la MÃ©tropole Rouen Normandie.

## Installation
Ajouter le fichier jar à votre projet en tant que bibliothèque lié. <br/>
### Eclipse :
Clic-droit sur le projet => Properties => Java Build Path => Libraries => Add External JARs => Choisir le .jar de l'API

<br/>

## Usage
```java
import fr.alba0404.astuce.api.Astuce_API;
import fr.alba0404.astuce.api.enums.Line;
import fr.alba0404.astuce.api.enums.Station;
import fr.alba0404.astuce.api.errors.StationNotOnLineException;

List<Station> stations = Astuce_API.getStations(Line.METRO); //Retourne une liste des stations se trouvant sur la ligne de métro

Station s = stations.get(0);
List<Line> lines = s.getLines();		// Retourne une liste des lignes passant par cette station.
int sens = s.getSens();				// Retourne le sens de la station sur la ligne sélectionnée (1 ou 2)
int id = s.getid();				// Retourne un entier représentant l'id unique de la station sur le réseau
String destination = s.getDestination();	// Retourne la destination de la ligne de la station.

```

<br/>

## En cours... / In dev...
- Ajout des stations autres que celles du métro.
- ...



