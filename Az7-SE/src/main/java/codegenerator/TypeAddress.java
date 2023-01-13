package codegenerator;

public enum TypeAddress {
    Direct(""),
    Indirect("@"),
    Imidiate("#");

    public final String label;

    TypeAddress(String label) {
        this.label = label;
    }
}