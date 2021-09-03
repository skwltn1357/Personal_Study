
public class SocialNum {
	
	public static void checkNum(char[] socialNum) {
		boolean check = true;
		
		for(int i=0; i<socialNum.length; ++i) {
			if(!checkDigit(socialNum)) {
				check = false;
				System.out.println("숫자만 입력 가능합니다.");
			}
		}
		
		if(socialNum.length != 14) {
			check = false;
			System.out.println("길이가 알맞지 않습니다.");
		}else if(socialNum[6] != '-') {
			System.out.println("7번째 자리에 '-'이 들어가지 않았습니다.");
			check = false;
		}else if((socialNum[7] != 1) || (socialNum[7] != 2) || (socialNum[7] != 3) || (socialNum[7] != 4)) {
			System.out.println("8번째 자리에 적합한 숫자가 아닙니다.");
		}else if(socialNum[2] != 0 || socialNum[2] != 1) {
			System.out.println("해당하지 않는 월입니다.");
		}
	}
	
	
	public static boolean checkDigit(char[] socialNum) {
		for(int i=0; i<socialNum.length; ++i) {
			if(socialNum[6] == '-') {
				continue;
			}else if(Character.isDigit(socialNum[i])) { //isDigit:숫자인지 판단해서 true,false 반환
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}
