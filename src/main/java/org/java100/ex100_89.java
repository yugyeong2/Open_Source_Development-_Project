package org.java100;

public class ex100_89 {

	public static void main(String[] args) {
		// �� �ֻ����� ��
		// �ֻ����� �ΰ� ������ ���� ������ ���
		// 5
		// 1, 4
		// 2, 3
		// 3, 2
		// 4, 1
		int sum = 12;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == sum) {
					System.out.println(i+","+j);
				}
			}
		}
		
	}

}
