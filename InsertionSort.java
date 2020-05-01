/*Satyam Choudhary*/
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        insertion(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertion(int arr[])
    {
        //Best Case -0(n)
        //worst case-0(n^2)
        for(int i=1;i<arr.length;++i)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}
