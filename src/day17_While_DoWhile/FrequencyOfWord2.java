package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog cAt CAT cat";
        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) { // i: 0, 1, 2, 3 (because this is a word) >> substract what you add

            String eachSubstring = str.substring(i, i+3);

            if (eachSubstring.equalsIgnoreCase("Cat")) {
                frequency += 1;
            }
        }
        System.out.println("Frequency = " + frequency);
    }
}
