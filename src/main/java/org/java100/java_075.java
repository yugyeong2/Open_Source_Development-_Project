package org.java100;
import java.util.Scanner;
public class ex100_75 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("소수");
			System.out.println("약수 개수:"+count);
		}else {
			System.out.println("수수가 아니다");
			System.out.println("약수 개수:"+count);
		}
	}

}

/*
	2     ====> 소수 (왜냐하면 약수가 1 과 자기자신 2밖에 없기때문..)
	3     ====> 소수 (왜냐하면 약수가 1 과 자기자신 3밖에 없기때문..)
	4     ====> 소수가 아님 (왜냐하면 약수가 1 , 2 , 4 이기 때문..)
	10     ====> 소수가 아님 (왜냐하면 약수가 1 , 2 , 5 , 10 이기 때문..)
	11     ====> 소수 (왜냐하면 약수가 1 과 자기자신 11밖에 없기때문..)
	
	입력
	2이상의 자연수가 입력으로 주어진다.
	출력
	입력으로 주어진 수가 소수이면 "prime"을 출력, 소수가 아니면 "not prime"을 출력한다.
	
	입력 예시
	7
	출력 예시
	prime
*/
