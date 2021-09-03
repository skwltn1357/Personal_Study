package reviewQuiz.maple;
/*
굴리기! 버튼을 누르면 옵션이 랜덤으로 3개 결정되는 프로그램을 만들어보세요.

힘 증가     +1 ~ +7
지능 증가  +1 ~ +7
민첩 증가  +1 ~ +7
행운 증가  +1 ~ +7
공격력 증가 +1 ~ +3
*/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MapleStory extends JFrame{
	
	public MapleStory() {
		super("단풍이야기");
		setLayout(new BorderLayout());
		
		RandomButton rb = new RandomButton();
		add(rb, "Center");
		add(rb.list.get(0), "North");
		add(rb.list.get(1), "East");
		add(rb.list.get(2), "West");
		
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		class MButton extends JButton{
			void setText(String stat, int value) {
				setText(stat + " : " + value);
			}

		}
		
		
		class RandomButton extends JButton{
			
			ArrayList<MButton> list = new ArrayList<>();
			Random ran;
			String[] stats = {"힘","민첩","행운","지능","공격력"};
			
			public RandomButton() {
				super("굴리기!");
				ran = new Random();
				
				for(int i=0; i<3; ++i) {
					list.add(new MButton());
				}
				
				addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {
						for(int i=0; i<3; ++i) {
							String stat = stats[ran.nextInt(stats.length)];
							if(stat.equals("공격력")) {
								list.get(i).setText(stat, (ran.nextInt(3) + 1));
							}else {
								list.get(i).setText(stat, (ran.nextInt(7) + 1));
							}
						}
						
					}
				});				
				
			}

		}

	}
	public static void main(String[] args) {
		MapleStory m = new MapleStory();
	}
}
