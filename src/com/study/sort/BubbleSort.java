package com.study.sort;

/**
 * ð���㷨
 * @author LMG
 * ð���㷨��˼·�ǣ�
 * �Ƚ����ڵ�Ԫ�أ����ǰһ�����ں�һ���򽻻�λ�ã���С��������
 */
public class BubbleSort {

	public static void main(String[] args) {
		//����һ��int����
		int[] nums = {7,62,13,52,64,29,217,49};
		//����һ����ʱ���������ڴ洢��Ҫ�л���Ԫ��
		int temp;
		//ѭ��ȡ�������е�Ԫ��
		for (int i = 0; i < nums.length; i++) {
			//ѭ��ȡ��nums[i]Ԫ�ص���һ��Ԫ��
			for (int j = i + 1; j < nums.length; j++) {
				//�Ƚ�����Ԫ�ش�С
				if (nums[i] > nums[j]) {
					//���nums[i]����nums[j]����nums[i]��ŵ�temp��
					temp = nums[i];
					//��nums[j]��ֵ�ŵ�nums[i]��λ��
					nums[i] = nums[j];
					//����ٽ�temp��ʵ������nums[i]��ֵ���ŵ�nums[j]��λ��
					nums[j] = temp;
				}
			}
		}
		for (int num :nums) {
			System.out.println(num);
		}
	}

}
