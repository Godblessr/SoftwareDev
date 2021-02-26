package be.kuleuven.groept.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import be.kuleuven.groept.application.BracketParser;
import be.kuleuven.groept.application.BracketParserIntf;

@SuppressWarnings("serial")
public class BracketsView extends JFrame {

	private JPanel contentPane;
	private JTextField inputField;
	private BracketParserIntf myParser;
	private JLabel lblAccepted;
	private boolean firstStroke = false;

	/**
	 * Create the frame.
	 */
	public BracketsView() {
		this.myParser = new BracketParser();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);

		JMenuItem mniChangeParser = new JMenuItem("Change Parser");
		mniChangeParser.setEnabled(false);
		mnFile.add(mniChangeParser);

		JMenuItem mniExit = new JMenuItem("Exit");
		mniExit.setMnemonic('X');
		mnFile.add(mniExit);
		mniExit.addActionListener(e -> System.exit(EXIT_ON_CLOSE));

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic('H');
		menuBar.add(mnHelp);

		JMenuItem mniAbout = new JMenuItem("About");
		mniAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mnHelp.add(mniAbout);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 10));

		JLabel lblInputAFormula = new JLabel(
				"<html>Input a formula and hit <b>enter</b> <br />The brackets will then be parsed</html>");
		this.contentPane.add(lblInputAFormula, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		this.contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

		JLabel lblFormula = new JLabel("Formula :");
		panel.add(lblFormula);

		this.inputField = new JTextField();
		panel.add(this.inputField);
		this.inputField.setColumns(20);
		this.inputField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean accepted = BracketsView.this.myParser.checkBrackets(BracketsView.this.inputField.getText());
				String output = accepted ? "Accepted" : "Not Accepted";
				BracketsView.this.lblAccepted.setText(output);
				setBGcolor(accepted);
				firstStroke = true;
			}
		});

		inputField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() != '\n' && firstStroke) {
					inputField.setBackground(Color.WHITE);
					firstStroke = false;
				}
			}
		});

		this.lblAccepted = new JLabel("");
		panel.add(this.lblAccepted);

	}

	public void setBGcolor(boolean accepted) {
		inputField.setBackground(accepted ? Color.GREEN : Color.RED);
	}

}
