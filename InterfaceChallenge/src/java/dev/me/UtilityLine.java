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
    @Override
    public String getLabel () {
	return name + " (" + type + ") ";
    }

    /**
     * @return An item type or map marker
     */
    @Override
    public String getMarker () {
	return switch (type) {
	    case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
	    case FIBRE_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
	    case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
	    case SEWAGE -> Color.BROWN + " " + LineMarkers.SOLID;
	    default -> Color.BLACK + " " + LineMarkers.SOLID;
	};
    }

    /**
     * @return A POINT or LINE, which is what the object will look like
     *         on the map
     */
    @Override
    public Geometry getShape () {
	return Geometry.LINE;
    }

    /**
     * Prints out the type, lable and marker to JSON format
     *
     * @return
     */
    @Override
    public String toJSON() {

	return Mappable.super.toJSON() + """
	    , "name": "%s", "utility": "%s" """
	    .formatted(name, type);
    }
}
