package exercises;

public class Exercise5 {

    void anonymousImpl() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }


    void lambdaImpl() {
        Thread t2 = new Thread(() -> {

        });
    }
}
