import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        bubbleSort(arr);
        display(arr);
    }
    public static void bubbleSort(int arr[])
    { //Optimized Algorithm of Bubble sort in best case its complexity -0(n)
        //its achieved with swap variable;
        int n=arr.length;
        boolean swap=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }

            }
            if(swap==false)
            {
                break;
            }
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
