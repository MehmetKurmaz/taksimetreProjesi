import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double tarife,acilis,total,minimum;

        System.out.print("Mesafe Giriniz :");
        Scanner input=new Scanner(System.in);
        km=input.nextInt();
        tarife=km*2.20;
        acilis=10;
        total=tarife+acilis;
        if (total<20){
            total=20;
        }
       System.out.print("Total Ucreti :"+total);

    }
}