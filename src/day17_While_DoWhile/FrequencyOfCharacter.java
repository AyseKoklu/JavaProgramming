package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBASADSDASAAASKALAKAABC";
        char ch = 'A';
        int frequency = 0 ;

        for (int i = 0; i <= str.length()-1; i++) { // i is the indexes of str
            char eachChar = str.charAt(i); // this will give me each character of the str

            // 'A' == 'A' then the frequency will be +1
            if (ch == eachChar) { // if given char is matching with each char, the frequency increases by one
                frequency++; // or we can also use frequency += 1;
            }

        }

        System.out.println("Frequency = " + frequency);

    }
}

/*
Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */