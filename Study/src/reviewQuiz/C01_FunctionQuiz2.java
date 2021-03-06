package reviewQuiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	 
	 	1. 최대값을 매개변수로 전달받으면
	 	   0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range 함수를 만들어보세요
	 	   (ex : range(10)의 결과 -> [0,1,2,3,4,5,6,7,8,9]
	 	   
	 	2. 최소값과 최대값을 매개변수로 전달받으면
	 	      최소값 부터 최대값 미만의 모든 정수값을 포함하는 int 배열을 생성하여 반환하는
	 	   range 함수를 만들어 보세요
	 	   (ex : range(5,10)의 결과 -> [5,6,7,8,9]
	 	   
	 	3. 최소값과 최대값과 증가값을 매개변수로 전달받으면
	 	      최소값부터 최대값 미만까지 증가값만큼 증가하는 int배열을 생성하여 반환하는
	 	   range 함수를 만들어 보세요 	   
	 	   (ex : range(40, 50, 3)의 결과 -> [40,43,46,49]
	 	   		 range(40, 45, 5)의 결과 -> [40] 
	 */

	// 1번
	public static int[] range(int num) {
		int [] arr = new int[num];
		
		for(int i = 0; i < num; ++i) {
			arr[i] = i;
			
		}
		return arr;
	}

	// 2번 (ex : range(5,10)의 결과 -> [5,6,7,8,9]
//	public static int[] range(int start, int end) {
//		
//		int increase = start > end ? -1 : 1;
//		int[] arr = new int[increase < 0 ? start - end : end - start];
//		
//		for(int i = start, index = 0; i != end; i += increase) {
//			arr[index++] = i;		
//		}
//		return arr;
//	}
	
	public static int[] range(int start, int end) {
		
		int increase = start < end ? 1 : -1;
		int[] arr = new int[increase > 0 ? end - start : start - end];
		
		for(int i = start, index = 0; i != end; i += increase) {
			arr[index++] = i;		
		}
		return arr;
	}
	
	public static int[] method1(int start, int end) {
		int increase = start < end ? 1 : -1;
		int[] arr = new int[increase > 0 ? end - start : start - end];
		
		for(int i=start, index=0; i != end; i+=increase) {
			arr[index++] = i;
		}
		return arr;
	}
	
	// 3번
	/**
	  	문서화 주석(이 기능에 대한 설명을 할 수 있다)
	  	
	 	@start
	 		시작하는 값을 넣으세요
	 	@end
	 		끝나는 값을 넣으세요
	 	@return
	 		잘못된 값을 입력하면 null이 나오고, 제대로 넣으면 int[]가 나옵니다.
	 */

	// (ex : range(40, 50, 3)의 결과 -> [40,43,46,49]
	public static int[] range(int start, int end, int increase) {
		if(increase < 0 && start <= end) {
			return null;
		}else if (increase > 0 && start >= end) {
			return null;
		}else if (increase == 0) {
			return null;
		}
		
		// (100  - 70) / 4
		// 100 96 92 88 84 80 76 72
		
		// (100 - 92) / 4
		// 100 96
		
		int size;
				
		if(increase > 0) {
			int range = end - start;
			size = range % increase == 0 ? range / increase : range / increase + 1;
		}else {
			int range = start - end;
			size = range % (increase * -1) == 0 ? 
					range / (increase * -1) : range / (increase *-1) + 1;
		}
		
		System.out.println("size :" + size);		
		int[] arr = new int[size];
		
		for(int value = start, index = 0; 
				increase > 0 ? value < end : value > end; value += increase) {                        

			arr[index++] = value;
			System.out.printf("arr[%d] : %d\n", index - 1, value);
		}
		return arr;
		
	}
	
	
	/*
 	# 함수 오버로딩(overloading)
  	 - 매개변수의 개수 또는 타입이 다르면 똑같은 함수명을 사용할 수 있다
 */
	public static int[] range(float num) {
		// println()에는 다양한 타입들의 오버로딩이 존재한다
		System.out.println();
		System.out.println(123);
		System.out.println("123");
		System.out.println('A');
	
		return null;
	}


	
	
	public static void main(String[] args) {
		//2번 결과
		System.out.println("2번 결과" + Arrays.toString(range(5,10)));
		
		//3번 결과
		System.out.println("3번 결과" + Arrays.toString(range(40,50,3)));
	}
	
}
