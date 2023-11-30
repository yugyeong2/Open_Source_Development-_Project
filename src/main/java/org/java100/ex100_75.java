package org.java100;
import java.util.Scanner;
public class ex100_75 {

	public static void main(String[] args) {
//75. �Ҽ� �Ǻ�
//2 ====> �Ҽ� (�ֳ��ϸ� ����� 1 �� 
//      		�ڱ��ڽ� 2�ۿ� ���⶧��..)
//3 ====> �Ҽ� (�ֳ��ϸ� ����� 1 �� 
//				�ڱ��ڽ� 3�ۿ� ���⶧��..)
//4 ====> �Ҽ��� �ƴ� (�ֳ��ϸ� ����� 1 , 2 , 4 �̱�
//		����..)
// ���(������ �������� ��)�� ������ ���ϴ� ����.
// ����� 2���� �Ҽ�, 3���̻��̸� �Ҽ��� �ƴ�.		
//  2�� ����� ���ϴ� ���, 1 ������. 2������.
//  3�� ����� ���ϴ� ���, 1 ������ 2������ 3������		
//  4�� ��� : 1������ 2������ 3������ 4������
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0; //��� ī��Ʈ
		for(int i=1; i<=n; i++) {
			if(n % i == 0) { //������ ������.
				count++;
			}
		}
		if(count == 2) {
			System.out.println("�Ҽ���");
			System.out.println("�������:"+count);
		}else {
			System.out.println("�Ҽ��� �ƴ�");
			System.out.println("�������:"+count);
		}
	}

}
