package conditions;

public class Conditions {
    public static void main(String[] args) {
        int number=24;

        if(number<20){
            System.out.println("Number is less than 20");
        } else if (number==20) {
            System.out.println("Number is equal to 20");
        }else {
            System.out.println("Number is greater than 20");
        }

        char grade='B';
        switch (grade){
            case 'A':
                System.out.println("Successful");
                break;
            case 'B':
                System.out.println("Successful");
                break;
            case 'C':
                System.out.println("Successful");
                break;
            default:
                System.out.println("You entered an invalid note");
        }
    }
}
