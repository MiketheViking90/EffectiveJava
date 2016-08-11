package chap2.item1;

public enum ShirtSize {

    XS ("extra small"),
    S ("small"),
    M ("medium"),
    L ("large"),
    XL ("extra large");

    private final String name;

    private ShirtSize(String name) {
        this.name = name;
    }

}
