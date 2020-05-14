import java.io.IOException;

public class MyThreads {
    private static String[] threadnames = {"Kati", "Mati", "Jüri", "Ratas", "asdasd"};
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++){
            new Thread(getRunnable(5) , threadnames[i]).start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static Runnable getRunnable(int number){
        return () -> {
            for(int i = 0; i <5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}