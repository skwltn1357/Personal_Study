package study2.BackJun;

public class Test1 {
	//https://www.acmicpc.net/problem/1712
	
	//ex) 1000 70 170 입력 -> 11 출력
	// 1000(고정) + 70(가변) * 10(생산) = 1700
	// 170 * 10(판매) = 1700
	// 최초로  총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
	
	public static long num(int a, int b, int c) {
		long count = 0;
		boolean boo = true;
		
		if( b > c ) {
			return -1;
		}
		
		while(boo) {
			++count;
			if(a + b * count < c * count) {
				boo = false;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(num(2100000000 , 9, 10));
	}
}
