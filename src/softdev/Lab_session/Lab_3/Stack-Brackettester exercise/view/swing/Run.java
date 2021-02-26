package be.kuleuven.groept.view.swing;

import java.awt.EventQueue;

/**
 * @author Jeroen Van Aken
 * 
 */
public class Run {

	/**
	 * Launch the be.kuleuven.groept.application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					BracketsView frame = new BracketsView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
