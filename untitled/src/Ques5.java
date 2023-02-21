import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[5];
        System.out.println("Enter the array1:");
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr=new int[5];
        System.out.println("Enter the array2:");
        for(int j=0;j<5;j++){
            arr[j]=sc.nextInt();
        }
        boolean ans= true;
        for(int x=0;x<5;x++){
            if(arr1[x]!=arr[x]){
                ans=false;


            }
        }
        System.out.println(ans);
    }
}
