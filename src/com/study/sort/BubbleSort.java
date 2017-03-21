package com.study.sort;

/**
 * 冒泡算法
 * @author LMG
 * 冒泡算法的思路是：
 * 比较相邻的元素，如果前一个大于后一个则交换位置（从小到大排序）
 */
public class BubbleSort {

	public static void main(String[] args) {
		//声明一个int数组
		int[] nums = {7,62,13,52,64,29,217,49};
		//声明一个临时变量，用于存储需要叫唤的元素
		int temp;
		//循环取出数组中的元素
		for (int i = 0; i < nums.length; i++) {
			//循环取出nums[i]元素的下一个元素
			for (int j = i + 1; j < nums.length; j++) {
				//比较两个元素大小
				if (nums[i] > nums[j]) {
					//如果nums[i]大于nums[j]，将nums[i]存放到temp中
					temp = nums[i];
					//将nums[j]的值放到nums[i]的位置
					nums[i] = nums[j];
					//最后再将temp（实际上是nums[i]的值）放到nums[j]的位置
					nums[j] = temp;
				}
			}
		}
		for (int num :nums) {
			System.out.println(num);
		}
	}

}
