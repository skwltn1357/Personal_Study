package reviewQuiz.maple;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
굴리기! 버튼을 누르면 옵션이 랜덤으로 3개 결정되는 프로그램을 만들어보세요.

힘 증가    : +1 ~ +7
지능 증가  : +1 ~ +7
민첩 증가  : +1 ~ +7
행운 증가  : +1 ~ +7
공격력 증가 : +1 ~ +3
*/
public class Maple_jisu extends JFrame{
	public Maple_jisu() {
		super("단풍이야기");
		setLayout(new BorderLayout());
		
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	

	class MButton extends JButton{				// ex) 힘 : 3
		void setText(String st, int value) {
			setText(st + value);
		}
		
	class RButton extends JButton{
		ArrayList<MButton> list = new ArrayList<>();
		Random ran;
		String[] str = {"힘","지능","민첩","행운","공격력"};
		
		public RButton() {
			super("굴리기!");
			ran = new Random();
			
			for(int i=0; i<3; ++i) {
				list.add(new MButton());
			}
			
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					for(int i=0; i<3; ++i) {
						String st = str[ran.nextInt(str.length)];
						if(st.equals("공격력")) {
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
