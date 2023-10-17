package com.billingxpert.views;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Start {

	private JFrame frameStart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
				try {
					new Start();	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					new LoginPage();
				
			}
		
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws InterruptedException 
	 */
	private void initialize()  {
		frameStart = new JFrame();
		frameStart.setBounds(100, 100, 412, 353);
		frameStart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(144, 27, 203, 178);
		ImageIcon image_1 = new ImageIcon(ClassLoader.getSystemResource("res/images/billingXpert.png"));
		Image image_2 = image_1.getImage().getScaledInstance(405, 349, Image.SCALE_DEFAULT);
		imageLabel.setIcon(new ImageIcon(image_2));
		frameStart.getContentPane().add(imageLabel);
		frameStart.setVisible(true);
		
		try {
			Thread.sleep(3000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		finally {
			frameStart.dispose();
		}
//		new LoginPage();
//		frameStart.dispose();
	}

}
