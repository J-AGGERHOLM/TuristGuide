package tourism.model;


public enum Byer {
    KØBENHAVN("København"),
    ODENSE("Odense"),
    AARHUS("Aarhus"),
    NULL("null");


    private String displayName;


    Byer(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }
}






