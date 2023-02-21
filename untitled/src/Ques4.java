import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int a=sc.nextInt();
        System.out.println("enter a number to add as a sub array:");
        int b=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter the elements:");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=0;
        while (j<a){
            k=k+arr[j];
            if(k>b){
                while (k>b && i<j){
                    k=k-arr[i];
                    i++;
                }
            }
            if (k==b){
                System.out.println(i+" ");
                System.out.println(j);
                break;
            }
            j++;
        }
    }
}
