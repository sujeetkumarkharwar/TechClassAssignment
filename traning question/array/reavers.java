package array;

import java.util.Scanner;

public class reavers {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number:");
        int  arr[]={1,3,5,4,6};
        int s=0,e=arr.length-1;

        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            System.out.println("s"+arr[s]+",e"+arr[e]);
            s++;
            e--;
            
        }
    }
    
}
