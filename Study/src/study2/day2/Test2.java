package study2.day2;

public class Test2 {
	/*
	 	문자판독기
	 	one23four -> 1234
	 	3five6nine -> 3569
	 	3zerosix -> 306
	 	3zeorsix -> 잘못입력하셨습니다
	 */
	String text;
	
	public Test2(String text) {
		this.text = text;
		Check3();
		Check1();	
		Check2();
		
	}
	
	void Check3() {
		//대문자가 있을 경우에 소문자로 바꿔주는 함수 
		for(int i=0; i<text.length(); ++i) {
			Check1();
			char ch = text.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				text = text.toLowerCase();
			}
		}
		System.out.println(text);
	}
	
	
	void Check1() {
		String[] st = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for(int i=0; i<st.length; ++i) {
			text = text.replaceAll(st[i], ""+i);
		}
		
		System.out.println(text); 
	}
	
	void Check2() {
		for(int i=0; i<text.length(); ++i) {
			char ch = text.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Test2("ONE23four");
	}
}
