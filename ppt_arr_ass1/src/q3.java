public class q3 {


    public static int findIndex(int arr[] , int target)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 5;


        int result = findIndex(arr,target);

        if(result!= 0){
            System.out.println("the element is present at the index : "+result);
        }else
        {

            System.out.println("the element is not found");
        }

    }
}
