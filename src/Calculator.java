import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	boolean isOperatedClicked=false;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton, eightButton, nineButton, divButton;
	JButton fourButton, fiveButton, sixButton, mulButton;
	JButton oneButton, twoButton, threeButton, subButton;
	JButton dotButton, zeroButton, equalButton, addButton;
	JButton clearButton;
	String oldValue;
	float result=0;
	char operator;
	
	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(385, 600);
		jf.setLocation(300, 100);
		
		displayLabel = new JLabel();
		displayLabel.setBounds(25, 40, 315, 60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(25, 120, 60, 60);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(110, 120, 60, 60);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(195, 120, 60, 60);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(nineButton);
		
		divButton = new JButton("/");
		divButton.setBounds(280, 120, 60, 60);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(divButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(25, 210, 60, 60);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(110, 210, 60, 60);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(195, 210, 60, 60);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(sixButton);
		
		mulButton = new JButton("*");
		mulButton.setBounds(280, 210, 60, 60);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(mulButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(25, 300, 60, 60);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(110, 300, 60, 60);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(195, 300, 60, 60);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(threeButton);
		
		subButton = new JButton("-");
		subButton.setBounds(280, 300, 60, 60);
		subButton.addActionListener(this);
		subButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(subButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(25, 390, 60, 60);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(110, 390, 60, 60);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(195, 390, 60, 60);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(equalButton);
		
		addButton = new JButton("+");
		addButton.setBounds(280, 390, 60, 60);
		addButton.addActionListener(this);
		addButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(addButton);
		
		clearButton = new JButton("CLEAR");
		clearButton.setBounds(25, 480, 315, 60);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isOperatedClicked) {
				displayLabel.setText("7");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		} else if(e.getSource()==eightButton){
			if(isOperatedClicked) {
				displayLabel.setText("8");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		} else if(e.getSource()==nineButton){
			if(isOperatedClicked) {
				displayLabel.setText("9");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		} else if(e.getSource()==fourButton){
			if(isOperatedClicked) {
				displayLabel.setText("4");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		} else if(e.getSource()==fiveButton){
			if(isOperatedClicked) {
				displayLabel.setText("5");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		} else if(e.getSource()==sixButton){
			if(isOperatedClicked) {
				displayLabel.setText("6");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		} else if(e.getSource()==oneButton){
			if(isOperatedClicked) {
				displayLabel.setText("1");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		} else if(e.getSource()==twoButton){
			if(isOperatedClicked) {
				displayLabel.setText("2");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		} else if(e.getSource()==threeButton){
			if(isOperatedClicked) {
				displayLabel.setText("3");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		} else if(e.getSource()==zeroButton){
			if(isOperatedClicked) {
				displayLabel.setText("0");
				isOperatedClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		} else if(e.getSource()==divButton){
			isOperatedClicked=true;
			oldValue=displayLabel.getText();
			operator='/';
			
		} else if(e.getSource()==mulButton){
			isOperatedClicked=true;
			oldValue=displayLabel.getText();
			operator='*';
			
		} else if(e.getSource()==subButton){
			isOperatedClicked=true;
			oldValue=displayLabel.getText();
			operator='-';
			
		} else if(e.getSource()==addButton){
			isOperatedClicked=true;
			oldValue=displayLabel.getText();
			operator='+';
			
		} else if(e.getSource()==dotButton){
			displayLabel.setText(displayLabel.getText()+".");
			
		} else if(e.getSource()==equalButton){
			String newvalue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newvalue);
			switch(operator) {
			case'+':
				result=oldValueF+newValueF;
				displayLabel.setText(result+"");
				break;
			case'-':
				result=oldValueF-newValueF;
				displayLabel.setText(result+"");
				break;
			case'/':
				result=oldValueF/newValueF;
				displayLabel.setText(result+"");
				break;
			case'*':
				result=oldValueF*newValueF;
				displayLabel.setText(result+"");
				break;	
			}
			
			
		} else if(e.getSource()==clearButton){
			displayLabel.setText("");
		}
		
	}
}	
