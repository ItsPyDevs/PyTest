package fr.itspydevs.org;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Main {
	
	static int width = 400;
	static int height = 300;

	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    
	    URL image_url = Main.class.getResource("/icone.png");
	    Image image = new ImageIcon(image_url).getImage();
	    frame.setIconImage(image);
	    
	    
	    frame.setSize(width, height);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    List<String> liste = new ArrayList<>();
	    liste.add("J'ai");
	    liste.add("réussit !");
	    liste.add("je");
	    liste.add("suis");
	    liste.add("trop");
	    liste.add("fort");
	    liste.add("lvrt !");
	    
	    frame.setVisible(true);
	    
	    System.out.println(liste);
	    
	    while (true) {
		    for (int i = 0; i < liste.size(); i++) {
		        frame.setTitle(liste.get(i));
		    	try {
		    	 	TimeUnit.SECONDS.sleep(1);
		    	} catch (InterruptedException e) {
		    	 	e.printStackTrace();
		    	}
		    }
	    }
  
  }
}

