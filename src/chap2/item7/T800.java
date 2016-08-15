package chap2.item7;

public class T800 {

    private boolean isTerminated = false;

    @Override
    public void finalize() {
        // 1. No guarantee of promptness of execution
        // 2. No guarantee of execution
        // 3. performance penalty in O(100)
    }

    public void terminate() {
        try {
            System.out.println("Trying foo()...");
        } catch (Exception e) {
            System.out.println(e + " log error if termination fails");
        } finally {
            isTerminated = true;
        }
    }

    public void callSkynet() {
        if (isTerminated) {
            throw new IllegalStateException(getClass().getSimpleName() + " has been terminated.");
        }

        System.out.println("Skynet is self-aware");
    }
}
