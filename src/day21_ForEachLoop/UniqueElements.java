package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String words []= {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        // when the outer loop is executed for the first time, the first element (e.g., "Layan") will be compared with
        // every single elements we have in the array. then the outer loop repeats the same action for the each element
        // one by one
        for (String each : words) { // each : "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
            int count = 0;

            for (String element : words) { // elements: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (element.equals(each)){
                    count ++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }
        }


    }
}
