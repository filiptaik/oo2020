

public class ESTCode implements PersonalCodeBehavior {
    private String gender;
    private String yearNumber = null;
    private String millenium = null;
    private String yearNum;
    private Character first1;
    private String birthDay;
    private String birthMonth;


    
    public void getGender(String estCode) {
        Character first = estCode.charAt(0);
        gender = null;
        if(first.equals('1') || first.equals('3') || first.equals('5') || first.equals('7')){
            gender = "mees";
            System.out.println("Sugu on " + gender );
        } else {
            gender = "naine";
            System.out.println("Sugu on " + gender );
        }

    }

    
    public void getBirthday(String estCode) {
        birthDay = estCode.substring(5, 7);
        birthMonth = estCode.substring(3, 5);
        System.out.println("Sünnipäev on " + birthDay + "." + birthMonth);
    }

    
    public void getYear(String estCode) {
   
        first1 = estCode.charAt(0);
        yearNum = estCode.substring(1, 3);

        


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

    }

	@Override
	public void getGender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBirthday() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getYear() {
		// TODO Auto-generated method stub
		
	}










    
}