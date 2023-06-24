public class q4 {


    public static void maxIncri(int arr[])
    {
        int max = 0;

        for(int i= 1 ; i<arr.length ;i++)
        {
            if(arr[i] > arr[max])
            {
                max = i;
            }
        }

        arr[max]+=1;

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3};

        maxIncri(arr);

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
