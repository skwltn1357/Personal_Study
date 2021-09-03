package reviewQuiz.maple;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
������! ��ư�� ������ �ɼ��� �������� 3�� �����Ǵ� ���α׷��� ��������.

�� ����    : +1 ~ +7
���� ����  : +1 ~ +7
��ø ����  : +1 ~ +7
��� ����  : +1 ~ +7
���ݷ� ���� : +1 ~ +3
*/
public class Maple_jisu extends JFrame{
	public Maple_jisu() {
		super("��ǳ�̾߱�");
		setLayout(new BorderLayout());
		
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	

	class MButton extends JButton{				// ex) �� : 3
		void setText(String st, int value) {
			setText(st + value);
		}
		
	class RButton extends JButton{
		ArrayList<MButton> list = new ArrayList<>();
		Random ran;
		String[] str = {"��","����","��ø","���","���ݷ�"};
		
		public RButton() {
			super("������!");
			ran = new Random();
			
			for(int i=0; i<3; ++i) {
				list.add(new MButton());
			}
			
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					for(int i=0; i<3; ++i) {
						String st = str[ran.nextInt(str.length)];
						if(st.equals("���ݷ�")) {
							list.get(i).setText(st, (ran.nextInt(3) + 1));
						}else {
							list.get(i).setText(st, (ran.nextInt(7) + 1));
						}
					}
				}
			});
		}
	}
	}
	}
	
	
	
	public static void main(String[] args) {
		MapleStory m = new MapleStory();
	}
}
