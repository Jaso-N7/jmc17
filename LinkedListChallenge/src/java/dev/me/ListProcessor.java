package dev.me;

import java.util.*;

/**
 * A type that has a town or place name, and a field
 * for storing the distance from the start
 */
record Itinerary (String place, double distance ){
  

    /*
    public int compareTo (Itinerary i) {
	return distance.comparingDouble(i.getDistance());
    }
    

*/
    public String toString () {
	return String.format("%s (%,.2f km)", place, distance);
    }
 
}

/**
 * Supporting class for Itinerary
 */
public class ListProcessor {

    private Itinerary town;
    private LinkedList<Itinerary> towns;

    public ListProcessor (Itinerary town) {
	this.town = town;
	this.towns = new LinkedList<Itinerary>();
	towns.add(town);
    }

    public void setTown(String name, double distance) {
	
	Itinerary newTown = new Itinerary(name, distance);
	boolean townExists = false;

	if(!towns.contains(newTown)) {
	    towns.add(newTown);
	}

	
    }

    public List<Itinerary> listOfTowns () {
	// sort towns
	/*
	DistanceCompare distanceCompare = new DistanceCompare();
		return towns.sort(distanceCompare);
	*/
	return towns;
    }
    
    public String toString () {

	StringBuilder sb = new StringBuilder("List of Itinerary:- \n");

	for (Itinerary i : towns) {
	    sb.append(i.place() + " is " + i.distance() +
		      " km from Sydney\n");
	}

	return sb.toString();
    } // toString :: String

}

/*
class DistanceCompare implements Comparator<Itinerary> {
    public int compare(Itinerary firstTown, Itinerary secondTown) {
	return firstTown.distance().compareTo(secondTown.distance());
    }
}
*/
