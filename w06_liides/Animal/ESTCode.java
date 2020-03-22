

public class ESTCode implements PersonalCodeBehavior {
    String gender = "";
    String millenium = "";
    String yearNumber = "";

    public String getGender(String estCode) {
        
        Character first = estCode.charAt(0);
        //System.out.println(first);
        if(first.equals('1') || first.equals('3') || first.equals('5') || first.equals('7')){
            gender = "mees";
            System.out.println("Sugu on " + gender );
        } else {
            gender = "naine";
            System.out.println("Sugu on " + gender );
        }
        return gender;
    }




    public int getYear(String estCode) {
        String yearNum = estCode.substring(1, 3);

        Character first1 = estCode.charAt(0);


        if(first1.equals('1') || first1.equals('2')){
            millenium = "18";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(first1.equals('3') || first1.equals('4')) {
            millenium = "19";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(first1.equals('5') || first1.equals('6')) {
            millenium = "20";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else if(first1.equals('7') || first1.equals('8')) {
            millenium = "21";
            yearNumber = millenium + yearNum;
            System.out.println(yearNumber);
        } else {
            System.out.println("Sisesta korrektne isikukood");
        }
        return 0;
    }




    public String getBirthday(String estCode) {

        String birthDay = estCode.substring(5, 7);
        String birthMonth = estCode.substring(3, 5);
        System.out.println("Sünnipäev on " + birthDay + "." + birthMonth);

        return null;
    }







    
}