package dev.me;

import java.util.*;

public class Challenge {

    /**
     * Will output the coordinates of the National Parks and Rivers.
     *
     * Sample output:
     *   Render Grand Canyon National Park as POINT ([40.1021, -75.4231])
     *   Render Mississipi River as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])
     */
    public static void main (String... args) {

	// List of Tourist Traps
	List<Park> parks = new ArrayList<>(3);
	List<River> rivers = new ArrayList<>(4);
	
	// Parks
	parks.add(new Park("Yellow Stone", new double [] {44.4882, -110.5916}));
	parks.add(new Park("Grand Canyon",
			   new double [] { 40.1021, -75.4231 }));
	parks.add(new Park("Yosemite", new double [] {37.855, -119.5360}));

	// Rivers
	rivers.add(new River("Mississippi",
				new double [][] {
				    {47.216, -95.2348},
				    {29.1566, -89.2495},
				    {35.1556, -90.0659}
				}));
	rivers.add(new River("Missouri",
			     new double [][] {
				 {44.89832, -100.09637},
				 {38.8146, -90.1218}}));
	rivers.add(new River("Dunn's River Falls",
			     new double [][] {
				 {18.41499595390759, -77.1348679631563}}));
	rivers.add(new River("Rio Cobre",
			     new double [][] {{18.03347689322876, -76.95216696428072}}));
		   
	Layer<Park> listOfParks = new Layer<>(parks);
	listOfParks.renderLayer();

	Layer<River> listOfRivers = new Layer<>(rivers);
	listOfRivers.renderLayer();
	
	System.exit(0);
    }
}
