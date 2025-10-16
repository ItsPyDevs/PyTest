package fr.itspydevs.org;

import java.awt.*;
import java.net.*;
import javax.swing.*;

public class Main {
	static JFrame frame = new JFrame();
	static int width = 815;  // →
	static int height = 640; // ↓
	
	static int fetch_button_height = 100;
	static int fetch_button_width = 50;
	
	static URL icône = Main.class.getResource("/icone.png");
	static Image ico = new ImageIcon(icône).getImage();

	public static void main(String[] args) {
		frame.setIconImage(ico);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle("Gui trop stylé sm");

		JLabel label = new JLabel("Salut", SwingConstants.NORTH_EAST);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		Font text_font = new Font("Ubuntu", Font.PLAIN, 30);
		label.setFont(text_font);
		
		Font bouton_font = new Font("Ubuntu", Font.PLAIN, 20);
		JButton bouton = new JButton("Fetch");
		bouton.setSize(fetch_button_height, fetch_button_width);
		
		bouton.addActionListener(e -> {
			//   TODO Fetch & show the image
			System.out.println("test");
        });
		
		bouton.setBackground(Color.RED);
		bouton.setBorderPainted(true);
		
		bouton.setFont(bouton_font);
		
		bouton.setBounds((int) 407.5, 50, fetch_button_height, fetch_button_width);
		frame.add(bouton);
		frame.add(label);
		
		// frame.setAlwaysOnTop(true);
	}
}

