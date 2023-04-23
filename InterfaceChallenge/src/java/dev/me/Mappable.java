package dev.me;

/**
 * For exchanging data with a mapping application
 *
 */
public interface Mappable {

    String JSON_PROPERTY = """
	"property":{%s}""";

    /**
     * How the item will be described on the map
     *
     * @return A description of an item
     */
    String label ();

    /**
     * @return A POINT or LINE, which is what the object will look like
     *         on the map
     */
    String geometryType ();

    /**
     * @return An item type or map marker
     */
    String itemType ();

    /**
     * Prints out the type, lable and marker to JSON format
     *
     * @return
     */
    default void toJSON () {
	System.out.println();
    }

    /**
     * Prints the properties for each mappable type, but also any other
     * fields on the business classes.
     *
     */
    default void printTypes (Mappable map) {
	System.out.println(map.label() + map.geometryType() + map.itemType()); 
    }
    
}
