package reviewQuiz.maple;

import javax.swing.JButton;

public class MButton extends JButton{
	void setText(String stat, int value) {
		setText(stat + " : " + value);
	}

}
