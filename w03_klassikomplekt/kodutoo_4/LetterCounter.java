import java.util.Scanner;

public class LetterCounter {
    static final int ascii = 256; 
  
    static void getLetter(String str) {

        str = str.replaceAll("\\s","");
        int count[] = new int[ascii]; 
        int len = str.length();

        // loeb kokku kui palju on mis tähte
        for (int i = 0; i < len; i++){
            count[str.charAt(i)]++; 
        }

        //teeb massiivi kõikide tähtedega
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
                // kui on vaste leitud
                if (str.charAt(i) == ch[j]){  
                    find++;
                }                 
            } 
  
            if (find == 1){
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
            }             
        } 
    } 


    public static void main(String[] args){
        System.out.println("Sisesta lause");  
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        getLetter(str);
        sc.close(); 
    } 
} 
