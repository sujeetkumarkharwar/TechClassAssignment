package array;

import java.util.Scanner;

public class maximumNo {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number:");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("enter the elemnetr of the array");
        // for(int i=1;i<n;i++){
        //     arr[i]=Scanner.nextInt();
        // }
        // int max=arr[0];
        int arr[]={5,7,6,8,9};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
