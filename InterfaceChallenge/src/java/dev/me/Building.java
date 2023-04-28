package dev.me;

enum BuildingType { BUSINESS, ENTERTAINMENT, GOVERNMENT }

public class Building implements Mappable {

    private String name;
    private BuildingType type;
}
