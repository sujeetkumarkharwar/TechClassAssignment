import java.util.Scanner;

public class perfactNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int  n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=1;
            }
        }
        if(sum==n){
            System.out.println("is perfact no"+n);
        }else{
            System.out.println("is not perfcat no"+n);
        }
    }
    
}
