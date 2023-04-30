package dev.me;

enum BuildingType { BUSINESS, ENTERTAINMENT, GOVERNMENT }

public class Building implements Mappable {

    Geometry geoType = Geometry.POINT;
    
    private String name;
    private BuildingType type;

    public Building (String name, BuildingType type) {
	this.name = name;
	this.type = type;
    }

    @Override
    public String toJSON() {

	return Mappable.super.toJSON() + """
	    , "name": "%s", "usage": "%s" """
	    .formatted(name, type);
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
	    case BUSINESS -> Color.BLACK + " " + PointMarkers.CIRCLE;
	    case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.DIAMOND;
	    case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
	    default -> Color.BLUE + " " + PointMarkers.PIN;	    
	};
	
    }

    /**
     * @return A POINT or LINE, which is what the object will look like
     *         on the map
     */
    @Override
    public Geometry getShape () {
	return Geometry.POINT;
    }
}
