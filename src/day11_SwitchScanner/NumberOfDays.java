package day11_SwitchScanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int number = 463839;
        if (number >= 1 && number <= 12) {
        switch (number) {
            case 2:
                if (year % 4 == 0){
                    System.out.println(number + ". month has 29 days.");
                }
                else {
                    System.out.println(number + ". month has 28 days.");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(number + ". month has 30 days.");
                break;
            default:
                System.out.println(number + ". month has 31 days.");
        }

        } else {
            System.out.println("Invalid");
        }


    }

}

/*
	4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */