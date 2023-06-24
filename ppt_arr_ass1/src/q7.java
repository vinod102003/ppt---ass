public class q7
{
    public static void move(int arr[])
    {
        int nz = 0;
        int z = 0;
        while(nz < arr.length)
        {
            if(arr[nz] != 0)
            {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }else
            {
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        move(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



}
