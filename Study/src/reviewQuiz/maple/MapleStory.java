package reviewQuiz.maple;
/*
������! ��ư�� ������ �ɼ��� �������� 3�� �����Ǵ� ���α׷��� ��������.

�� ����     +1 ~ +7
���� ����  +1 ~ +7
��ø ����  +1 ~ +7
��� ����  +1 ~ +7
���ݷ� ���� +1 ~ +3
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
		super("��ǳ�̾߱�");
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
			String[] stats = {"��","��ø","���","����","���ݷ�"};
			
			public RandomButton() {
				super("������!");
				ran = new Random();
				
				for(int i=0; i<3; ++i) {
					list.add(new MButton());
				}
				
				addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {
						for(int i=0; i<3; ++i) {
							String stat = stats[ran.nextInt(stats.length)];
							if(stat.equals("���ݷ�")) {
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
