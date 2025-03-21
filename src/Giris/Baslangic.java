package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Mathematics, Physics, Chemistry, Turkish, History, Music;
        System.out.print("Enter Mathematics: ");
        Mathematics = input.nextDouble();
        System.out.print("Enter Physics: ");
        Physics = input.nextDouble();
        System.out.print("Enter Chemistry: ");
        Chemistry = input.nextDouble();
        System.out.print("Enter Turkish: ");
        Turkish = input.nextDouble();
        System.out.print("Enter History: ");
        History = input.nextDouble();
        System.out.print("Enter Music: ");
        Music= input.nextDouble();
        double total = (Mathematics+Physics+Chemistry+Turkish+History+Music);
        double average = total/6;
        System.out.print("The GPA is : " + average);
        boolean condition1 = average>=60;
        boolean condition2 = average<=60;
        boolean result = condition1 || condition2;
        String failorpass = (result) ? "Pass" : "Fail" ;
        System.out.println(" " + failorpass);


    }
}

