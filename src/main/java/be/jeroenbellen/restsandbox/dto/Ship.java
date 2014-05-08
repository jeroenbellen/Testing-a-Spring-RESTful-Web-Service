package be.jeroenbellen.restsandbox.dto;

public class Ship {

    private final String name;
    private final String type;
    private final String captain;

    private Ship(String name, String type, String captain) {
        this.name = name;
        this.type = type;
        this.captain = captain;
    }

    public static Ship of(String name, String type, String captain) {
        return new Ship(name, type, captain);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCaptain() {
        return captain;
    }
}
