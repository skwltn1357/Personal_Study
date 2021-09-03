package reviewQuiz.maple;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class RandomButton extends JButton{
	
	ArrayList<MButton> list = new ArrayList<>();
	Random ran;
	String[] stats = {"Èû","¹ÎÃ¸","Çà¿î","Áö´É","°ø°Ý·Â"};
	
	public RandomButton() {
		super("±¼¸®±â!");
		ran = new Random();
		
		for(int i=0; i<3; ++i) {
			list.add(new MButton());
		}
		
		addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<3; ++i) {
					String stat = stats[ran.nextInt(stats.length)];
					if(stat.equals("°ø°Ý·Â")) {
						list.get(i).setText(stat, (ran.nextInt(3) + 1));
					}else {
						list.get(i).setText(stat, (ran.nextInt(7) + 1));
					}
				}
				
			}
		});
		
		
	}
	public static void main(String[] args) {
		RandomButton r = new RandomButton();
	}


}
