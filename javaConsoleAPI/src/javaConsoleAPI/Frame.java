package javaConsoleAPI;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public final class Frame {
	
	public Frame() {}

	@SuppressWarnings("deprecation")
	public static void setFrame(JFrame frame, String name, int width, int height, int cursorType, JLabel setLabel, String text, boolean resizable, KeyListener keyListener) {
		frame = new JFrame(name);
		JLabel label = new JLabel(text, JLabel.CENTER);
		
		frame.addKeyListener(keyListener);
		frame.setSize(width, height);
		frame.setCursor(cursorType);
		frame.getContentPane().add(label);
		frame.setResizable(resizable);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void setMenuBar(JFrame frame, String nameMenu, String nameMenuItem, ActionListener actionMenuItem) {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(true);
		menuBar.setVisible(true);
		
		JMenu menu = new JMenu();
		menu.setText(nameMenu);
		menu.setEnabled(true);
		menu.setVisible(true);
		
		JMenuItem menuItem = new JMenuItem();
		menuItem.setText(nameMenuItem);
		menuItem.setEnabled(true);
		menuItem.setVisible(true);
		menuItem.addActionListener(actionMenuItem);
		
		menuBar.add(menu);
		menu.add(menuItem);
		frame.setJMenuBar(menuBar);
	}

}
