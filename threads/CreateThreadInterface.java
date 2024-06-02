package threads;

class Myclass implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("My child Thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Handle interrupted exception
            e.printStackTrace();
        }
    }
}

public class CreateThreadInterface {
    public static void main(String[] args) {
        Myclass obj = new Myclass();

        Thread t = new Thread(obj);

        t.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Handle interrupted exception
            e.printStackTrace();
        }
    }
}
