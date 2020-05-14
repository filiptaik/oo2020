//import java.io.FileNotFoundException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Example
 */
public class Example {
    
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;

        try {
            fh = new FileHandler("mylog.xml");
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("shouldnt arrive here");
        } 



        try {
            int divide = 5 / 0;
        } catch (ArithmeticException e)  {
            logger.warning(e.getMessage());
            logger.info("msg");
        } 
         
       

        try {
            getArrayElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            logger.warning(e.getMessage());
        }
        
        System.out.println("ÄAÄÄA");
    }
    
    public static int getArrayElement(){
        int[] intArray = new int[]{1, 2, 3};
        return intArray[3];
    }
}