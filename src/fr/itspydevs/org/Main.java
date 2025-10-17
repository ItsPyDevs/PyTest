package fr.itspydevs.org;

import java.awt.*;
import javax.swing.*;

public class Main {	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		/*
		 *  FRAME SIZE
		 */
		int width = 815;  // →
		int height = 640; // ↓
	
		/*
		 *   OTHER
		 */
		Color bg_color = new Color(28, 29, 34);
		Color blurple = new Color(85, 57, 204);
		
		
		/*
		 *   X Y Z SYS
		 */
		int fetch_button_x = 105 ;  // W
		int fetch_button_y = 551;   // H
	
		int save_button_x = 0;      // W
		int save_button_y = 551;    // H
		
		int setting_button_x = 699; // W
		int setting_button_y = 551; // H 
		
		/*
		 *   BUTTON SIZE
		 */
		int fetch_button_height = 590;
		int fetch_button_width = 50;
		
		int save_button_height = 100;
		int save_button_width = 50;
		
		int setting_button_height = 100;
		int setting_button_width = 50;
		
		/*
         *    LABEL
         */
		JLabel label = new JLabel("Salut", SwingConstants.NORTH_EAST);
		
		
		/*
		 *    BOUTONS
		 */
		JButton save_bouton = new JButton("save");
		JButton fetch_bouton = new JButton("Fetch");
		JButton setting_bouton = new JButton("Settings");
		
		
		/*
		 *    MODIF FRAME
		 */
		frame.getContentPane().setBackground(bg_color);
		frame.setLayout(null);
		frame.setIconImage(new ImageIcon(Main.class.getResource("/icone.png")).getImage());
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Gui trop stylé sm");
		frame.setVisible(true);
		frame.setResizable(true);
		frame.add(label);
		frame.add(save_bouton);
		frame.add(fetch_bouton);
		frame.add(setting_bouton);

		/*
		 *    FONT
		 */
		Font label_font = new Font("Ubuntu", Font.PLAIN, 30);
		Font fetch_font = new Font("Ubuntu", Font.PLAIN, 15);
		Font save_font = new Font("Ubuntu", Font.PLAIN, 15);
		Font setting_font = new Font("Ubuntu", Font.PLAIN, 15);
		
		
		/*
		 *   MODIF LABEL
		 */
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.white);
		label.setFont(label_font);
		
		
		/*
		 *   MODIF BOUTON
		 */
		fetch_bouton.setSize(fetch_button_height, fetch_button_width);
		fetch_bouton.setBackground(blurple);
		fetch_bouton.setBorderPainted(true);
		fetch_bouton.setFont(fetch_font);
		fetch_bouton.setBounds(fetch_button_x, fetch_button_y, fetch_button_height, fetch_button_width);
		
		save_bouton.setSize(save_button_height, save_button_width);
		save_bouton.setBounds(save_button_x, save_button_y, save_button_height, save_button_width);
		save_bouton.setFont(save_font);
		save_bouton.setBackground(blurple);
		
		setting_bouton.setSize(setting_button_height, setting_button_width);
		setting_bouton.setBounds(setting_button_x, setting_button_y, setting_button_height, setting_button_width);
		setting_bouton.setFont(setting_font);
		setting_bouton.setBackground(blurple);
		
		/*
		 *   MODIF ACTION BOUTON
		 */
		
		fetch_bouton.addActionListener(e -> {
			//   TODO Fetch & show the image
			System.out.println("fetch_bouton fetch pressé !");
        });
		
		save_bouton.addActionListener(e -> {
			//   TODO Get & Save the Image
			System.out.println("save_bouton fetch pressé !");
        });
		
		setting_bouton.addActionListener(e -> {
			//   TODO Get & Save the Image
			System.out.println("setting_bouton fetch pressé !");
        });
		
	}
}

