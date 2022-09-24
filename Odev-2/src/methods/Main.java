package methods;

public class Main {
    public static void main(String[] args) {
        String message="Bu gun hava cok guzel";
        String newMessage=returnCity();
        System.out.println(newMessage);
        System.out.println(sum(5,7));
        System.out.println(sum2(5,7,2,3,5));
    }
    public static void add(){
        System.out.println("Added");
    }
    public static void delete(){
        System.out.println("Deleted");
    }
    public static void update(){
        System.out.println("Updated");
    }
    public static int sum(int number1,int number2){
        return number1+number2;
    }
    public static int sum2(int... numbers){
        int count=0;
        for(int number:numbers){
            count+=number;
        }
        return count;
    }
    public static String returnCity(){
        return "Ankara";
    }

}
