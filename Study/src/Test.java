import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[4];
		int[] user = new int[4];
		boolean boo = true;
		int count = 0;
		
		while(boo) {
			int ball = 0;
			int strike = 0;
			
			for(int i=0; i<user.length; ++i) {
				System.out.print((i+1)+"��° ��: ");
				user[i] = sc.nextInt();
				if(user[i] <= 0 || user[i] > 9) {
					System.out.println("���� ������ 1~9 �Դϴ�.");
				}
			}
			
	        for(int i=0; i<com.length; i++){
	        	com[i] = (int)(Math.random()*9)+1;
	        	for(int j=0; j<user.length; j++) {
		            if(com[i] == user[j]){
		                if(i == j){
		                    strike++;
		                }else{
		                    ball++;
		                }
		            }
				}
	        	System.out.println("��������" + " " + (i+1) + "��° ��:" + com[i] + " ");
	        	
        		}
	        System.out.println("\n" + "��strike : " + strike + " ��ball : " + ball);
	        
	        count++;
	        if(count == 8) {
	        	boo = false;
	        	}
			}
		
		}
}


