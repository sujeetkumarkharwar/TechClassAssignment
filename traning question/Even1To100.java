import java.util.Scanner;

public class Even1To100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<100;i++){
            if(n%2==0){
                // System.out.println("even"+i);
                continue;
            }else System.out.println("odd"+i);
        }
    }
    
}
