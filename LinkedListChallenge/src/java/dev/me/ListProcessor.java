package dev.me;

import java.util.LinkedList;

/**
 * A type that has a town or place name, and a field
 * for storing the distance from the start
 */
record Itinerary (String place, double distance) {

    public Itinerary (String place, double distance) {
	this.place = place;
	this.distance = distance;
    }

    public String getPlace () {
	return place;
    }

    public double getDistance () {
	return distance;
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
	
	for (Itinerary i : towns) {
	    if ( i.getPlace().equals(name) ) {
		townExists = true;
	    }
	}

	if (!townExists) {
	    towns.add(newTown);
	}
    }

    public String toString () {

	StringBuilder sb = new StringBuilder("List of Itinerary:- \n");

	for (Itinerary i : towns) {
	    sb.append(i.getDistance() + " km from Sydney to " +
		      i.getPlace() + '\n');
	}

	return sb.toString();
    } // toString :: String

}
