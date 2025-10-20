package fr.itspydevs.org;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONObject;
import java.net.*;
import java.net.http.*;

public class Main {	
	
	public static void main(String[] args) throws Exception{
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
		
		ArrayList<String> liste_url = new ArrayList<String>();
		
		liste_url.add("https://dog.ceo/api/breeds/image/random");
		liste_url.add("https://api.thecatapi.com/v1/images/search");
		liste_url.add("https://randomfox.ca/floof/");
		liste_url.add("https://random-d.uk/api/random");
		
		int liste_size = liste_url.size();
		
		Random rand = new Random();
		
		
		/*
		 *   X Y Z SYS
		 */
		int fetch_button_x = 105 ;      // W
		int fetch_button_y = 551;       // H
	
		int save_button_x = 0;          // W
		int save_button_y = 551;        // H
		
		int setting_button_x = 699;     // W
		int setting_button_y = 551;     // H 
		
		int back_button_x = 5;          // W
		int back_button_y = 310;        // H
		
		int label_menu_x = 98;          // W
		int label_menu_y = 50;          // H
		
		/*
		 *   SIZE
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
		JLabel img_label = new JLabel();
		
		
		/*
		 *    BOUTONS
		 */
		JButton save_bouton = new JButton("save");
		JButton fetch_bouton = new JButton("Fetch");
		JButton setting_bouton = new JButton("Exit");
		JButton back_bouton = new JButton("Back");
		
		
		/*
		 *    MODIF MAIN FRAME
		 */
		main_frame.getContentPane().setBackground(bg_color);
		main_frame.setLayout(null);
		main_frame.setIconImage(new ImageIcon(Main.class.getResource("/icone.png")).getImage());
		main_frame.setSize(main_width, main_height);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setTitle("RAnimals");
		main_frame.setVisible(true);
		main_frame.setResizable(false);
		main_frame.add(img_label);
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
		img_label.setVerticalAlignment(SwingConstants.TOP);
		img_label.setForeground(Color.white);
		img_label.setFont(label_font);
		
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
			int rand_index = rand.nextInt(liste_size);
			String url_random = liste_url.get(rand_index);
			// String url_random = "https://api.thecatapi.com/v1/images/search";
			
			String json_path = "";
			
			if (url_random == "https://dog.ceo/api/breeds/image/random") {
				json_path = "message";
			}	
			
			if (url_random == "https://api.thecatapi.com/v1/images/search") {
				json_path = "url";
			}
			
			if (url_random == "https://randomfox.ca/floof/") {
				json_path = "image";
			}
			
			if (url_random == "https://random-d.uk/api/random") {
				json_path = "url";
			}

			try {
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url_random)).build();
				HttpResponse<String> response;
				response = client.send(request, HttpResponse.BodyHandlers.ofString());
				
				JSONObject json_resp = new JSONObject(response.body().replace("[", "").replace("]", ""));
				String image_url = json_resp.getString(json_path);
				
				System.out.println(image_url);
				
				if (url_random == "https://random-d.uk/api/random") {
					image_url = image_url.replace("http://", "https://");
				}
				
				
				Image image = new ImageIcon(new URL(image_url)).getImage();
				
				Image newImage = image.getScaledInstance(600, 450, Image.SCALE_DEFAULT);
				
				img_label.setBounds(label_menu_x, label_menu_y, 600, 600);
				
				String size = 600 + "," + 600;
				
				System.out.println(size);
				
				img_label.setIcon(new ImageIcon(newImage));
				
				
			} catch (IOException | InterruptedException e1) {
				
			} finally {
				
			}
		    
			
			
		
        });
		
		save_bouton.addActionListener(e -> {
			//   TODO Get & Save the Image
			System.out.println("save_bouton bouton pressé !");
        });
		
		
		
		
		setting_bouton.addActionListener(e -> {
			setting_frame.setLocation(main_frame.getLocation());
			setting_frame.setVisible(true);
			main_frame.setVisible(false);
			System.out.println("exit_bouton bouton pressé!");
			
        });
		
		back_bouton.addActionListener(e -> {
            setting_frame.setVisible(false);
            main_frame.setVisible(true);
            System.out.println("back_bouton bouton pressé!");
            
        });
		
	}
}

