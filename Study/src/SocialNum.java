
public class SocialNum {
	
	public static void checkNum(char[] socialNum) {
		boolean check = true;
		
		for(int i=0; i<socialNum.length; ++i) {
			if(!checkDigit(socialNum)) {
				check = false;
				System.out.println("���ڸ� �Է� �����մϴ�.");
			}
		}
		
		if(socialNum.length != 14) {
			check = false;
			System.out.println("���̰� �˸��� �ʽ��ϴ�.");
		}else if(socialNum[6] != '-') {
			System.out.println("7��° �ڸ��� '-'�� ���� �ʾҽ��ϴ�.");
			check = false;
		}else if((socialNum[7] != 1) || (socialNum[7] != 2) || (socialNum[7] != 3) || (socialNum[7] != 4)) {
			System.out.println("8��° �ڸ��� ������ ���ڰ� �ƴմϴ�.");
		}else if(socialNum[2] != 0 || socialNum[2] != 1) {
			System.out.println("�ش����� �ʴ� ���Դϴ�.");
		}
	}
	
	
	public static boolean checkDigit(char[] socialNum) {
		for(int i=0; i<socialNum.length; ++i) {
			if(socialNum[6] == '-') {
				continue;
			}else if(Character.isDigit(socialNum[i])) { //isDigit:�������� �Ǵ��ؼ� true,false ��ȯ
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}
