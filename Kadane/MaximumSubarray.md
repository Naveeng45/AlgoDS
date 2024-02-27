# Maximum Subarray Sum

**Problem Statement:** Given an integer array `nums`, find the subarray with the largest sum and return its sum.

## Examples

### Example 1:

- **Input:** `nums = [-2,1,-3,4,-1,2,1,-5,4]`
- **Output:** `6`
- **Explanation:** The subarray `[4,-1,2,1]` has the largest sum `6`.

### Example 2:

- **Input:** `nums = [1]`
- **Output:** `1`
- **Explanation:** The subarray `[1]` has the largest sum `1`.

### Example 3:

- **Input:** `nums = [5,4,-1,7,8]`
- **Output:** `23`
- **Explanation:** The subarray `[5,4,-1,7,8]` has the largest sum `23`.

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

## Approach

An efficient way to solve this problem is by using Kadane's algorithm, which scans the entire array and at each position finds the maximum sum of the subarray ending there. This is achieved by keeping a running count of the current subarray sum and updating the maximum sum found so far.

### Kadane's Algorithm

1. Initialize two integer variables: `maxSoFar` and `maxEndingHere` with the first element of the array.
2. Iterate through the array starting from the second element:
    - Update `maxEndingHere` by adding the current element to it.
    - If `maxEndingHere` is less than the current element, reset `maxEndingHere` to the current element.
    - Update `maxSoFar` if `maxEndingHere` is greater than `maxSoFar`.
3. Return `maxSoFar` as the largest sum.

## Java Solution

```java
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
```
Dry Run
Example 1: nums = [-2,1,-3,4,-1,2,1,-5,4]
Iteration 1: maxEndingHere = -2, maxSoFar = -2
Iteration 2: maxEndingHere = 1, maxSoFar = 1
Iteration 3: maxEndingHere = -2, maxSoFar = 1
Iteration 4: maxEndingHere = 4, maxSoFar = 4
Iteration 5: maxEndingHere = 3, maxSoFar = 4
Iteration 6: maxEndingHere = 5, maxSoFar = 5
Iteration 7: maxEndingHere = 6, maxSoFar = 6
Iteration 8: maxEndingHere = 1, maxSoFar = 6
Iteration 9: maxEndingHere = 5, maxSoFar = 6
The largest sum of the subarray is 6, achieved by the subarray [4,-1,2,1].
