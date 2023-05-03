package dev.me;

import java.util.*;

public class InterfaceChallenge {

    public static void main (String... args) {

	List<Mappable> maps = new ArrayList<>();

	// Buildings
	maps.add(new Building("Sydney Town Hall", BuildingType.GOVERNMENT));
	maps.add(new Building("Odeon Theatre", BuildingType.ENTERTAINMENT));
	maps.add(new Building("Seymour Park", BuildingType.BUSINESS));

	// Utility Lines
	maps.add(new UtilityLine("Knutsford Blvd", UtilityType.FIBRE_OPTIC));
	maps.add(new UtilityLine("Mona", UtilityType.WATER));
	
	// Print maps
	for (var map : maps) {
	    Mappable.mapIt(map);
	}
		
    }
}
