package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345S chool!@£%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoSchoolWoodenSpoon
        String specialChars = ""; //!@£$%

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str(0~last index)

            char ch = str.charAt(i); // ch: each character we have in str
            if (ch >= '0' && ch <= '9'){ // if the character is in this range it is a digit
                digits += ch;
            }
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { // if the character is in this range it is letter
                letters += ch;
            }
            else { // if the character is in this range it is a special character
                if (ch != ' ') { // if the character is not a space
                    specialChars += ch;
                }
            }


        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }

}
