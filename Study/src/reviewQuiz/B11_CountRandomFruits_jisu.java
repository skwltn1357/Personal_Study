package reviewQuiz;

import java.util.Random;

/*
	사용자로부터 숫자를 입력받으면 해당 갯수만큼의 랜덤 과일을 선택한다
	(랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
	
	그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력
	
*/
public class B11_CountRandomFruits_jisu {

	public static int fruit(int num) {
		int fruit_num = 0;
		String[] fruits = {"apple","banana","kiwi","orange","grape","peach"};
		
		for(int i=0; i<num; ++i) {
			int random_num = (int)(Math.random() * fruits.length);
			System.out.println(fruits[random_num]);
			fruit_num++;
		}

		return fruit_num;
	}
	
	public static void main(String[] args) {
		System.out.println(fruit(4));
	}
}
