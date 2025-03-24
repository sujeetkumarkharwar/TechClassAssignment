package workingwithnumber;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=sc.nextInt();
        double red=3.14*r*r;
        System.out.println(red);
    }
    
}
