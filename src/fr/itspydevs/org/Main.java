package fr.itspydevs.org;

import java.awt.*;
import java.net.*;
import javax.swing.*;

public class Main {
	static JFrame frame = new JFrame();
	static int width = 815;
	static int height = 640;
	
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
		bouton.setSize(100, 50);
		
		
		bouton.addActionListener(e -> {
			//   TODO Fetch & show the image
			
			System.out.println();
        });
		
		bouton.setBackground(Color.RED);
		bouton.setBorderPainted(true);
		
		bouton.setFont(bouton_font);
		
		frame.add(bouton);
		frame.add(label);
		
		// frame.setAlwaysOnTop(true); 
		
		System.out.println("code exec");

	}
}

