package problems.Array;

/**
 * Given an arrayAof non-negative integers, return an array consisting of all the even elements ofA, followed by all the odd elements ofA.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortEvenOdd {
    public static void main(String args[]){
        int[] givenArray = {1,2,3,4};
        sortEvenOdd(givenArray);

    }
    private static void sortEvenOdd(int[] array){
        if(array.length==0 || array==null){
            System.out.println("Given array is null");
        }
        int left =0;
        int right = array.length-1;
        while(left<right){
            if(array[left]%2 == 0){
                left++;
            }else{
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                right--;
            }
        }
        for(int val : array){
            System.out.println(val);
        }
    }
}
