import java.util.Arrays;
import java.util.HashMap;

public class q1_two_sum
{
    public static int[] check(int arr[] , int target)
    {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i<arr.length ;i++)
        {
            hm.put(arr[i],i);
        }

        int result[] = new int[2];


        for(int i = 0 ; i< arr.length ; i++)
        {
            if (hm.containsKey(target) && hm.containsKey(0)) {
                result[0] = hm.get(0);
                result[1] = hm.get(target);

            } else {
                if (hm.containsKey(target - arr[i]))
                {
                    result[0] = hm.get(target - arr[i]);
                    result[1] = i;
                }
            }
        }

        return result;
    }


    public static void main(String[] args)
    {
        int arr[] = {2,7,11,15};

        int target = 9;

        int[] result = check(arr,target);

        System.out.println(Arrays.toString(result));

    }
}
