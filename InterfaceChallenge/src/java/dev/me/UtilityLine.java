package dev.me;

enum UtilityType { ELECTRICAL, FIBRE_OPTIC, WATER, SEWAGE }
public class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;
}
