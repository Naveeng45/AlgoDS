# Maximum Sum Circular Subarray

**Problem Statement:** Given a circular integer array `nums` of length `n`, return the maximum possible sum of a non-empty subarray of `nums`. A circular array means the end of the array connects to the beginning of the array.

## Examples

### Example 1:

- **Input:** `nums = [1,-2,3,-2]`
- **Output:** `3`
- **Explanation:** Subarray `[3]` has maximum sum `3`.

### Example 2:

- **Input:** `nums = [5,-3,5]`
- **Output:** `10`
- **Explanation:** Subarray `[5,5]` has maximum sum `5 + 5 = 10`.

### Example 3:

- **Input:** `nums = [-3,-2,-3]`
- **Output:** `-2`
- **Explanation:** Subarray `[-2]` has maximum sum `-2`.

## Constraints

- `n == nums.length`
- `1 <= n <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`

## Approach

To solve this problem, we consider two cases:
1. The maximum sum subarray is non-circular.
2. The maximum sum subarray is circular.

We can find the non-circular maximum sum subarray using Kadane's algorithm. To find the circular maximum sum subarray, we calculate the total sum of the array minus the minimum sum subarray (found by inverting the signs of the elements and then applying Kadane's algorithm).

### Algorithm Steps

1. Use Kadane's algorithm to find the maximum non-circular subarray sum.
2. Find the total sum of the array.
3. Invert the signs of the elements in the array and use Kadane's algorithm again to find the minimum subarray sum.
4. Subtract the minimum subarray sum from the total sum to get the maximum circular subarray sum.
5. The maximum sum is the larger of the non-circular maximum sum and the circular maximum sum.

## Java Solution

```java
public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMax = 0;
        int currMin = 0;

        for (int num : nums) {
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
            totalSum += num;
        }

        // If all numbers are negative, maxSum is the maximum
        if (totalSum == minSum) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
```
Dry Run
For a dry run, consider the input nums = [1,-2,3,-2]:

Kadane's algorithm for non-circular max sum: Finds 3 from [3].
Total sum calculation: 1 - 2 + 3 - 2 = 0.

Inverted array for minimum sum: Kadane's algorithm on [-1, 2, -3, 2] gives -3, indicating the original array's minimum subarray sum is 3.

Maximum circular sum calculation: 0 - 3 = -3. However, this is not used since the non-circular max sum 3 is greater.

Final Answer: The maximum sum circular subarray is 3.
