import java.util.Arrays;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth term:");
        int k=sc.nextInt();
        Arrays.sort(arr);
        if(k<n){
//            for(int i=0;i< arr.length;i++){
//                System.out.println(arr[i]);
//            }
            System.out.println("The smallest Kth number is:"+arr[k-1]);
        }
        else {
            System.out.println("the Kth term should be smaller then the size of the array");
        }

    }
}