public class q2
{
    public static int check(int arr[] , int val)
    {
        int k = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] != val)
            {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }



    public static void main(String[] args) {
        int arr[] = {3,2,2,3};

        int val = 3;

        int result = check(arr,val);

        System.out.println("output :"+result);
        // print the modified array

        System.out.println("the modified array is");
        for(int i=0 ; i<result ; i++)
        {
            System.out.print(arr[i]+" ");
        }


        for(int i=result ; i<arr.length ;i++)
        {
            System.out.print("_*");
        }

    }



}
