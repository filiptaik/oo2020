import java.io.IOException;

public class Thread_example {


    public static void main(String[] args) throws IOException {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 11; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i<11; i++){
                    System.out.println(10-i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }                
                }
            }
        });
        //Character.toString ((char) i);
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i<11; i++){
                    System.out.println(Character.toString ((char) (i + 97)));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }                
                }
            }
        });
        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i<11; i++){
                    System.out.println(Character.toString ((char) (107 - i)));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }                
                }
            }
        });
        t1.start(); 
        t2.start();
        t3.start();
        t4.start();
    }
}