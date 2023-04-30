package dev.me;

/**
 * For exchanging data with a mapping application
 *
 */
public interface Mappable {

    String JSON_PROPERTY = """
	"property":{%s}""";

    /**
     * Prints the properties for each mappable type, but also any other
     * fields on the business classes.
     *
     */
    static void mapIt (Mappable mappable) {
	System.out.println(mappable.getLabel());
	System.out.println(mappable.getMarker());
	System.out.println(mappable.getShape());
    }

    /**
     * Prints out the type, lable and marker to JSON format
     *
     * @return
     */
    default String toJSON () {
	StringBuilder json = new StringBuilder("\"type\": \"" + getShape() + '"');
	json.append(", \"label\": \"" + getLabel() + '"');
	json.append(", \"marker\": \"" + getMarker() + '"');
	return String.format(JSON_PROPERTY, json.toString());
    }

    /**
     * How the item will be described on the map
     *
     * @return A description of an item
     */
    String getLabel ();

    /**
     * @return An item type or map marker
     */
    String getMarker ();

    /**
     * @return A POINT or LINE, which is what the object will look like
     *         on the map
     */
    Geometry getShape ();
  
}

enum Geometry { LINE, POINT, POLYGON }
