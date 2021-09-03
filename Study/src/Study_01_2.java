import java.util.ArrayList;

public class Study_01_2 {
	/*
 	클래스 변수
 	1. String 타입의 ArrayList 변수명 : dic
 	
 	1번 함수 : 하나의 문장을 입력 받으면 해당 문장에 존재하는 영단어들을 배열에 저장해 반환
 	ex) I never dreamed about success, I worked for it. [2012~2021] -> ["i","never","dreamed","about","success]
 	
 	2번 함수 : 하나의 단어를 입력 받으면 dic에 단어가 추가되고 true를 반환 / 이미 있는 단어이면 추가하지 않고 false를 반환
 	ex) never 입력 : [] -> ["never"] true / success 입력 : [] -> ["never","success"] true / never 입력 : false
 	
 	3번 함수 : method01에서 나온 배열과 dic을 비교해서 같은 단어의 갯수를 반환
 */
	static ArrayList<String> dic = new ArrayList();
	
	public static String[] method1(String str) {
		String[] word = str.split(" ");
		return word;
	}
	
	public static boolean method2(String str) {
		for(int i=0; i<dic.size(); ++i) {
			if(str.equals(dic.get(i))) {
				return false;
			}
		}
		dic.add(str);
		return true;
	}
	
	public static int method3(String word[]) {
		int count = 0;
		
		for(int i=0; i<dic.size(); ++i) {
			for(int j=0; j<word.length; ++j) {
				if(dic.get(i).equals(word[j])) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		/*
	 	method02를 이용해 dic에 never, never, success, about을 추가한다 (boolean값 확인)
	 	String[] word에 method01로 I never dreamed about success, I worked for it. [2012~2021] 쪼개서 받는다
	 	word와 dic를 이용해 method03으로 갯수를 확인한다.
	 */
		System.out.println(method2("never"));
		System.out.println(method2("never"));
		System.out.println(method2("success"));
		System.out.println(method2("about"));

		System.out.println(method3(method1("I never dreamed about success, I worked for it.")));

	}
}
