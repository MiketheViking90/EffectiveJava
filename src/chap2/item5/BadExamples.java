package chap2.item5;

public class BadExamples {

    void creatingStringInstances() {
        String val = new String("Dumb idea");
        String val1 = "Better idea. This String is guaranteed to be reused in the same VM [JLS]";
    }

    void sfmForInstanceControl() {
        Boolean instanceControlledBoolean = Boolean.valueOf("false");
        Boolean badPractice = new Boolean("false");
    }

}
