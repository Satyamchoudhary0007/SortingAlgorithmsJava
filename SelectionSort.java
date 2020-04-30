/*Satyam Choudhary*/
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
     //   SelectionSort st=new SelectionSort();  if my function was non-static i can use this to access.
     //   st.selectionSort(arr);
     //   st.display(arr);
        selectionSort(arr);
        display(arr);
    }
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int mIndex=i;
            for(int j=i+1;j<=arr.length-1;j++)
            {
               if(arr[j]<arr[i])
               {
                   mIndex=j;
               }
            }
            int temp=arr[mIndex];
            arr[mIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
