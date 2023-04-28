package dev.me;

enum UtilityType { ELECTRICAL, FIBRE_OPTIC, WATER, SEWAGE }
public class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;

    public UtilityLine (String location, UtilityType type) {
	name = location;
	this.type = type;
    }

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
	return Geometry.LINE;
    }
}
