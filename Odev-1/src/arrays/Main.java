package arrays;

public class Main {
    public static void main(String[] args) {
        String[] students=new String[4];
        students[0]="Engin";
        students[1]="Derin";
        students[2]="Salih";
        students[3]="Ahmet";
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        for(String student:students){
            System.out.println(student);
        }

        String[][] cities=new String[3][3];
        cities[0][0]="Istanbul";
        cities[0][1]="Bursa";
        cities[0][2]="Bilecik";
        cities[1][0]="Ankara";
        cities[1][1]="Konya";
        cities[1][2]="Kayseri";
        cities[2][0]="Diyarbakir";
        cities[2][1]="Sakarya";
        cities[2][2]="Gaziantep";

        for(int i=0;i<cities.length;i++){
            for(int j=0;j<cities[0].length;j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}
