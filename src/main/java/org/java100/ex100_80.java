package org.java100;

public class ex100_80 {

	public static void main(String[] args) {
		//������ ��ȣ
		//���� ��ȣ�� ���ĺ��� 3���ھ� �з��� ���鼭
		//������ �������
//��ȣ - A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
//�� - X Y Z A B C D E F G H I J K L M N O P Q R S T U V W 
		//�Է°�: qhyhu wuxvw euxwxv
		//��°�: never trust brutus
		String password = "qhyhu wuxvw euxwxv";
		for(int i=0; i<password.length(); i++) {
			char c = password.charAt(i);
			
			if(c >= 'd' && c <= 'z' ) {
				System.out.print( (char)(c - 3) );
			}
			else if(c >= 'a' && c <= 'c') {
				System.out.println( (char)(c + 23) );
			}
			else { //������ ���
				System.out.print(c);
			}
		}
	}

}
