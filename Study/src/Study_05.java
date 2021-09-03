import java.util.ArrayList;

public class Study_05 {
	
	//최대값을 매개변수로 전달받으면 0부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는 함수
	//ex)range(10) -> [0,1,2,3,4,5,6,7,8,9]
	public static ArrayList<Integer> method1(int num) {
		ArrayList<Integer> arr = new ArrayList(); 
		for(int i=0; i<num; ++i) {
			arr.add(i);
		}
		return arr;
	}
	
	public static int[] method4(int num) {
		int[] num2 = new int[num];
		
		for(int i=0; i<num; ++i) {
			num2[i] = i;
		}
		return num2;
	}
	
	//최소값과 최대값을 매개변수로 전달받으면 최소값부터 최대값 미만의 모든 정수값을 포함하는 int배열을 생성하여 반환하는 함수
	//ex)range(5,10) -> [5,6,7,8,9]
	
	public static ArrayList<Integer> method2(int num1, int num2){
		ArrayList<Integer> arr = new ArrayList();
		for(int i=num1; i<num2; ++i) {
			arr.add(i);
		}
		
		return arr;
	}
	
	public static int[] method5(int num1, int num2) {
		int[] number = new int[num2 - num1];
		for(int i=num1; i<num2; ++i) {
			number[i-num1] = i;
		}
		return number;
	}
	//최소값과 최대값과 증가값을 매개변수로 전달받으면 최소값부터 최대값 미만까지 증가값만큼 증가하는 int배열을 생성하여 반환하는 함수
	//ex) range(40,50,3) -> [40,43,46,49] / range(40,45,5) -> [40]
	public static ArrayList<Integer> method3(int num1, int num2, int num3){
		ArrayList<Integer> arr = new ArrayList();
		for(int i=num1; i<num2;){
				arr.add(i);
				i += num3;
				
				
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(method1(10));
		System.out.println(method2(5,10));
		System.out.println(method3(40,50,3));
		
		System.out.println((method4(10)));
		System.out.println(method5(5,10));
	}
}
