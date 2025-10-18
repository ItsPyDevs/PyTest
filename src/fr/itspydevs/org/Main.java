package fr.itspydevs.org;

import java.awt.*;
import javax.swing.*;

public class Main {	
	
	public static void main(String[] args) {
		JFrame main_frame = new JFrame();
		JFrame setting_frame = new JFrame();
		
		
		/*
		 *  FRAME SIZE
		 */
		int main_width = 815;           // →
		int main_height = 640;          // ↓
		
		int setting_frame_width = 350;  // →
		int setting_frame_height = 400; // ↓ 
	
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
		
		int back_button_x = 5;    // W
		int back_button_y = 310;     // H
		/*
		 *   BUTTON SIZE
		 */
		int fetch_button_height = 589;
		int fetch_button_width = 50;
		
		int save_button_height = 100;
		int save_button_width = 50;
		
		int setting_button_height = 100;
		int setting_button_width = 50;
		
		int back_button_height = 324;
		int back_button_width = 50;
		
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
		JButton back_bouton = new JButton("Back");
		
		
		/*
		 *    MODIF MAIN FRAME
		 */
		main_frame.getContentPane().setBackground(bg_color);
		main_frame.setLayout(null);
		main_frame.setIconImage(new ImageIcon(Main.class.getResource("/icone.png")).getImage());
		main_frame.setSize(main_width, main_height);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setTitle("NSFWapp");
		main_frame.setVisible(true);
		main_frame.setResizable(false);
		main_frame.add(label);
		main_frame.add(save_bouton);
		main_frame.add(fetch_bouton);
		main_frame.add(setting_bouton);

		/*
		 *   MODIF SETTING FRAME
		 */
		setting_frame.setIconImage(new ImageIcon(Main.class.getResource("/icone.png")).getImage());
		setting_frame.setSize(setting_frame_width, setting_frame_height);
		setting_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setting_frame.setTitle("Paramètres");
		setting_frame.setLayout(null);
		setting_frame.getContentPane().setBackground(bg_color);
		setting_frame.add(back_bouton);
		setting_frame.setResizable(false);
		
		
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
		fetch_bouton.setFocusable(false);
		fetch_bouton.setBackground(blurple);
		fetch_bouton.setBorderPainted(true);
		fetch_bouton.setFont(fetch_font);
		fetch_bouton.setForeground(Color.white);
		fetch_bouton.setBounds(fetch_button_x, fetch_button_y, fetch_button_height, fetch_button_width);
		
		save_bouton.setSize(save_button_height, save_button_width);
		save_bouton.setBounds(save_button_x, save_button_y, save_button_height, save_button_width);
		save_bouton.setFont(save_font);
		save_bouton.setFocusable(false);
		save_bouton.setForeground(Color.white);
		save_bouton.setBorderPainted(true);
		save_bouton.setBackground(blurple);
		
		setting_bouton.setSize(setting_button_height, setting_button_width);
		setting_bouton.setBounds(setting_button_x, setting_button_y, setting_button_height, setting_button_width);
		setting_bouton.setFont(setting_font);
		setting_bouton.setFocusable(false);
		setting_bouton.setForeground(Color.white);
		setting_bouton.setBorderPainted(true);
		setting_bouton.setBackground(blurple);
		
		back_bouton.setBounds(back_button_x, back_button_y, back_button_height, back_button_width);
		back_bouton.setSize(back_button_height, back_button_width);
		back_bouton.setFocusable(false);
		back_bouton.setBackground(blurple);
		back_bouton.setBorderPainted(true);
		back_bouton.setForeground(Color.white);
		
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
			//   TODO Open the setting panel
			setting_frame.setVisible(true);
			main_frame.setVisible(false);
			
			System.out.println("setting_bouton fetch pressé!");
			
        });
		
		back_bouton.addActionListener(e -> {
			//   TODO Close the setting panel and open the main frame
            setting_frame.setVisible(false);
            main_frame.setVisible(true);
            
            System.out.println("back_bouton fetch pressé!");
            
        });
		
	}
}

