package chap6.item31;

public enum Ensemble {
    SOLO(1),
    DUET(2),
    TRIO(3),
    QUARTET(4);

    private final int numberOfMusicians;

    Ensemble(int numberOfMusicians) {
        this.numberOfMusicians = numberOfMusicians;
    }

}
