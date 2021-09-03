package reviewQuiz;

import java.util.Arrays;

public class B12_ArrayQuiz {
	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,},
			{1,1},
			{1,1,1,1},			
		};
		
		/*
		 	1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸����
		 	2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ��� (�Ҽ��� ��°�ڸ�)�� ���ؼ� ����غ�����
		 	3. numArr�� �� ��(row)�� ���� ��� ���ؼ� ����غ�����
		 	4. numArr�� �� ��(column)�� ���� ��� ���ؼ� ����غ�����
		 */
		
		// 1��
		for(int row = 0; row < numArr.length; ++row) {
			for(int column = 0; column < numArr[row].length; ++column) {
				numArr[row][column] = (int)(Math.random()*101);			
			}
		}
		
		
		// 2��
		int sum = 0;
		int count = 0;
		
		for(int row = 0; row < numArr.length; ++row) {
			
			int len = numArr[row].length;
			count += len;

			for(int column = 0; column < len; ++column) {
				System.out.println(numArr[row][column]+"\t");	
				sum += numArr[row][column];
				
			}
			System.out.println();
		
		}
		System.out.printf("����: %d, ��� : %.2f\n", sum, sum/(double)count);
		
		
		// 3��
		int[] rowSum = new int[numArr.length];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int column = 0; column < numArr[row].length; ++column) {
				rowSum[row] += numArr[row][column];
			}
		}
		
		// 4��
		int max_len = 0;
		
		for(int row = 0; row < numArr.length; ++row) {
			max_len = Math.max(max_len, numArr[row].length);
		}
		
		int[] colSum = new int[max_len];
		
		for(int row = 0; row < numArr.length; ++row) {
			for(int column = 0; column < numArr[row].length; ++column) {
				colSum[column] += numArr[row][column];
			}
		}
		// �迭�� ���ϰ� ����ϴ� ���
		System.out.println("���� �� : " + Arrays.toString(rowSum));
		System.out.println("���� �� : " + Arrays.toString(colSum));
		
		
		
		
		
		
		// 1�� , 2�� ����Ǯ��
//		int sum = 0;
//		double average = 0;
//		
//		for(int i = 0; i < numArr.length; ++i) {
//			for(int j = 0; j < numArr[i].length; ++j ) {
//				int random_number = (int)(Math.random()*100);
//				numArr[i][j] = random_number;
//				System.out.printf("numArr[%d][%d]:%d\n",i,j,numArr[i][j]);
//				sum += numArr[i][j];
//				average = sum / numArr.length;
//			}
//		}
//		System.out.println("�� �� : " + sum);
//		System.out.printf("��� : %.2f", average);
//		

	

	}

}
