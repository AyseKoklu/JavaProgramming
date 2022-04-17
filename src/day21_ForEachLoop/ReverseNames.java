package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String names [] = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) { // this line is needed to repeat the action for each string
            String reversed = ""; // next three lines are needed to reverse a string

            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);
            }

            System.out.println(reversed);

        }

    }
}
