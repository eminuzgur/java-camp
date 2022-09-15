package asalMi;

public class AsalMi {
    public static void main(String[] args) {
        int number=7;
        int remainder=number%2;
        System.out.println(remainder);
        boolean isPrime=true;

        for (int i=2;i<number;i++){
            if (number%2==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayi Asaldir");
        }else {
            System.out.println("Sayi Asal Degilder");
        }
    }
}
