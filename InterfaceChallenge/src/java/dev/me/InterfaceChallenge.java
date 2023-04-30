package dev.me;

public class InterfaceChallenge {

    public static void main (String... args) {

	Mappable aBuilding = new Building ("Sydney Town Hall", BuildingType.GOVERNMENT);
	Mappable.mapIt(aBuilding);

	Mappable aLine = new UtilityLine("College St", UtilityType.FIBRE_OPTIC);
	Mappable.mapIt(aLine);
	
    }
}
