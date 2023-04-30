package dev.me;

import java.util.*;

public class InterfaceChallenge {

    public static void main (String... args) {

	List<Mappable> buildings = new ArrayList<>();

	buildings.add(new Building("Sydney Town Hall", BuildingType.GOVERNMENT));
	buildings.add(new Building("Odeon Theatre", BuildingType.ENTERTAINMENT));
	buildings.add(new Building("Seymour Park", BuildingType.BUSINESS));

	for (var building : buildings) {
	    Mappable.mapIt(building);
	}
	/*
	Mappable aLine = new UtilityLine("College St", UtilityType.FIBRE_OPTIC);
	Mappable.mapIt(aLine);
	*/
	
    }
}
