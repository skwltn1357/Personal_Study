package review;

public class C11_ChangeValue {
	public static void main(String[] args) {
		// 두 변수의 값을 서로 바꾸는 방법
		int a = 10;
		int b = 20;
		
		int temp = a;	// temp : 임시
		a = b;
		b = a;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}
