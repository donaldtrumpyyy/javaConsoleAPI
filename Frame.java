package javaConsoleAPI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public final class Frame {
	
	public Frame() {}
	
	@SuppressWarnings("deprecation")
	public static void setFrame(String name, int width, int height, int cursorType, JLabel setLabel, String text, boolean resizable) {
		JFrame frame = new JFrame(name);
		JLabel label = new JLabel(text, JLabel.CENTER);
		
		frame.setSize(width, height);
		frame.setCursor(cursorType);
		frame.getContentPane().add(label);
		frame.setResizable(resizable);
		frame.setVisible(true);
	}
	
	public static void setEnabled(JFrame frame, boolean setOff) {
		if(setOff == true) {
			frame.setEnabled(false);
		}else{
			frame.setEnabled(true);
		}
	}

}
