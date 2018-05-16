package objectOriented;

public class SynchronizedBlock {

    public void synchronizedBlock(int i) {
        synchronized (this) {
            i = 1;
        }
    }
}
