package fr.itspydevs.org;

import java.awt.Font;
import java.awt.Image;
import java.io.InputStream;
import java.net.URL;
import javax.swing.*;

public class Main extends Thread {
	static int width = 400;
	static int height = 500;

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		URL image_url = Main.class.getResource("/icone.png");
		Image image = new ImageIcon(image_url).getImage();
		frame.setIconImage(image);

		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setResizable(false);


		frame.setTitle("Gui trop stylé sm");

		JLabel label = new JLabel("Salut", SwingConstants.NORTH_EAST);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		Font font = Font.createFont(Font.TRUETYPE_FONT, Main.class.getResource("/ubuntu.ttf").openStream());
		label.setFont(font);
		
		frame.add(label);
		
		System.out.println("code exec");

	}
}

