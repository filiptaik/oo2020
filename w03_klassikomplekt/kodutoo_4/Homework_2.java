import java.util.Random;

/**
 * Homework_2
 *  Olemasolevast stringist luua uus string, kus muudad suvaliselt olemasolevad tähed kas suureks või väikseks
 */
public class Homework_2 {
   public String input = "mulle meeldib apelsin";
   private String[] chars;
   char charUpper;
   /*
    public Homework_2(String input){
        this.input = input;
    }
    */

    public void randomCases(){
        
        final int length = input.length();
        final StringBuilder output = new StringBuilder(input);
        final Random rand = new Random();
        //char[] chars;
        for (int i = 0; i < length; i++) {

            int position = rand.nextInt(length);
            chars = input.split("(?!^)");
            //charUpper = Character.toUpperCase(chars[position]);

            //output.append(Character.toUpperCase(character));
        }
        System.out.println(chars);

        //System.out.println(output.toString());
    }
}
