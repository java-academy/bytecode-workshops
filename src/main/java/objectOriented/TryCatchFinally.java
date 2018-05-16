package objectOriented;

public class TryCatchFinally {
    public void tryCatchCatchFinally(int i) {
        try {
            i = 2;
        } catch (RuntimeException e) {
            i = 3;
        } finally {
            i = 4;
        }
    }
}
