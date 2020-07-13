package com.lilyandlucy.algorithm;

/**
 * 1512. 好数对的数目
 * 给你一个整数数组 nums 。
 * <p>
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * <p>
 * 返回好数对的数目。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 * 示例 3：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class NumIdenticalPairs {

    public static int numIdenticalPairs(int[] nums) {
        int[] pivots = new int[101];

        for (int num : nums) {
            pivots[num]++;
        }

        int count = 0;
        for (int i = 0; i < pivots.length; i++) {
            if (pivots[i] > 1) {
                count += pivots[i] * (pivots[i] - 1) / 2;
            }
        }
        return count;
    }
}
