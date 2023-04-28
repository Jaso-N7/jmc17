package dev.me;

enum BuildingType { BUSINESS, ENTERTAINMENT, GOVERNMENT }

public class Building implements Mappable {

    private String name;
    private BuildingType type;

    public Building (String name, BuildingType type) {
	this.name = name;
	this.type = type;
    }

    /*    static void mapIt (Mappable mappable) {
	System.out.println(mappable); 
	} */

    /**
     * Prints out the type, lable and marker to JSON format
     *
     * @return
     *
    public String toJSON () {

	return super.toJSON() + ", \"name\": \"" + name +
			   "\", \"usage\": \"" + type + '"';
    }
    */

    /**
     * How the item will be described on the map
     *
     * @return A description of an item
     */
    public String getLabel () {
	return "\"label\": \"" + name + "\" (" + type + ")\"";
    }

    /**
     * @return An item type or map marker
     */
    public String getMarker () {
	return "\"marker\": \"" + getShape() + '"';
    }

    /**
     * @return A POINT or LINE, which is what the object will look like
     *         on the map
     */
    public Geometry getShape () {
	return Geometry.POINT;
    }
}
