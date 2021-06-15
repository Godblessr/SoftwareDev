package softdev.Part8_refactoring_and_clean_code.part8en.demoen;

import javax.swing.*;
import java.awt.*;

/**
 * 
 */

/**
 * @author koen
 *
 */
public class RefactorAnonymousClass extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel_L = null;
	private JPanel jPanel_R = null;

	/**
	 * This method initializes jPanel_L	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_L() {
		if (jPanel_L == null) {
			jPanel_L = new JPanel();
			jPanel_L.setLayout(new GridBagLayout());
			jPanel_L.setPreferredSize(new Dimension(100, 0));
			jPanel_L.setName("Left");
			jPanel_L.setBackground(Color.red);
			jPanel_L.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"+((JPanel)e.getSource()).getName()); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jPanel_L;
	}

	/**
	 * This method initializes jPanel_R	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_R() {
		if (jPanel_R == null) {
			jPanel_R = new JPanel();
			jPanel_R.setLayout(new GridBagLayout());
			jPanel_R.setPreferredSize(new Dimension(100, 0));
			jPanel_R.setName("Right");
			jPanel_R.setBackground(Color.green);
			jPanel_R.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.out.println("mouseClicked()"+((JPanel)e.getSource()).getName()); // TODO Auto-generated Event stub mouseClicked()
				}
			});
		}
		return jPanel_R;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RefactorAnonymousClass thisClass = new RefactorAnonymousClass();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public RefactorAnonymousClass() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel_L(), BorderLayout.WEST);
			jContentPane.add(getJPanel_R(), BorderLayout.EAST);
		}
		return jContentPane;
	}

}
