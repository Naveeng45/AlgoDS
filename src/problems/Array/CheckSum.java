package problems.Array;

import java.util.HashMap;
import java.util.Map;

class CheckSum
{
    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];
        // write your code here
        Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int find = n-arr[i];
            if(temp.containsValue(find)){
                result[0]=find;
                result[1]=arr[i];
            }else{
                temp.put(find,arr[i]);
            }
        }
        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void main(String args[]){
        int givenArr[] = {1,21,3,14,5,60,7,6};
        int[] output = findSum(givenArr,27);
        for(int i =0;i<output.length;i++){
            System.out.print(output[i]);
        }
    }
}
