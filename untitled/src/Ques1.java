//Given an unsorted array arr[] of size N having both negative and positive integers, place
//all negative elements at the end of array without changing the order of positive elements
//and negative elements

import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Ques1 v=new Ques1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int j=0;
        int[] arr1=new int[n];
        for(int i=0;i< a.length;i++){
            if(a[i]>=0){
                arr1[j]=a[i];
                j++;
            }
        }
        for(int i=0;i< a.length;i++){
            if(a[i]<0){
                arr1[j]=a[i];
                j++;
            }
        }
        for (int i=0;i< n;i++){
            System.out.println(arr1[i]+" ");

        }
    }

}