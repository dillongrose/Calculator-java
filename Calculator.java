import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener{

	Boolean isOperatorClicked=false;
	
	JFrame f;
	JLabel DisplayLabel,watermark;
	JButton sevenbutton,eightbutton,ninebutton,
	        plusbutton,fourbutton,fivebutton,sixbutton,
	        minbutton,onebutton,twobutton,threebutton,mulbutton
	        , dotbutton,zerobutton,equalbutton,subbutton,clearbutton;
	
	double newValue, oldValue;
	int calculation;
	
	public Calculator(){
		//frame
        f=new JFrame("calculator");
        f.setBounds(0, 0, 500, 550);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

		//display
        DisplayLabel=new JLabel();
        DisplayLabel.setBounds(20, 30, 440, 90);
        DisplayLabel.setBackground(Color.WHITE);
        DisplayLabel.setOpaque(true);
        DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayLabel.setForeground(Color.BLACK);
        DisplayLabel.setFont(new Font("arial", Font.PLAIN ,30));
        DisplayLabel.setVisible(true);
        f.add(DisplayLabel);

		//number buttons
		zerobutton=new JButton("0");
        zerobutton.setBounds(110, 420, 70, 70);
        zerobutton.setFont(new Font("arial", Font.PLAIN ,30));
        zerobutton.addActionListener(this);
        zerobutton.setBackground(Color.WHITE);
        zerobutton.setOpaque(true);
        f.add(zerobutton);

		onebutton=new JButton("1");
        onebutton.setBounds(20, 330, 70, 70);
        onebutton.setFont(new Font("arial", Font.PLAIN ,20));
        onebutton.addActionListener(this);
        onebutton.setBackground(Color.WHITE);
        onebutton.setOpaque(true);
        f.add(onebutton);

		twobutton=new JButton("2");
        twobutton.setBounds(110, 330, 70, 70);
        twobutton.setFont(new Font("arial", Font.PLAIN ,20));
        twobutton.addActionListener(this);
        twobutton.setBackground(Color.WHITE);
        twobutton.setOpaque(true);
        f.add(twobutton);

        threebutton=new JButton("3");
        threebutton.setBounds(200, 330, 70, 70);
        threebutton.setFont(new Font("arial", Font.PLAIN ,20));
        threebutton.addActionListener(this);
        threebutton.setBackground(Color.WHITE);
        threebutton.setOpaque(true);
        f.add(threebutton);

		fourbutton=new JButton("4");
        fourbutton.setBounds(20, 240, 70, 70);
        fourbutton.setFont(new Font("arial", Font.PLAIN ,20));
        fourbutton.addActionListener(this);
        fourbutton.setBackground(Color.WHITE);
        fourbutton.setOpaque(true);
        f.add(fourbutton);
        
        fivebutton=new JButton("5");
        fivebutton.setBounds(110, 240, 70, 70);
        fivebutton.setFont(new Font("arial", Font.PLAIN ,20));
        fivebutton.addActionListener(this);
        fivebutton.setBackground(Color.WHITE);
        fivebutton.setOpaque(true);
        f.add(fivebutton);

        sixbutton=new JButton("6");
        sixbutton.setBounds(200, 240, 70, 70);
        sixbutton.setFont(new Font("arial", Font.PLAIN ,20));
        sixbutton.addActionListener(this);
        sixbutton.setBackground(Color.WHITE);
        sixbutton.setOpaque(true);
        f.add(sixbutton);

        sevenbutton=new JButton("7");
        sevenbutton.setBounds(20, 150, 70, 70);
        sevenbutton.setFont(new Font("arial", Font.PLAIN ,20));
        sevenbutton.addActionListener(this); 
        sevenbutton.setBackground(Color.WHITE);
        sevenbutton.setOpaque(true);
        f.add(sevenbutton);
        
        eightbutton=new JButton("8");
        eightbutton.setBounds(110, 150, 70, 70);
        eightbutton.setFont(new Font("arial", Font.PLAIN ,20));
        eightbutton.addActionListener(this);
        eightbutton.setBackground(Color.WHITE);
        eightbutton.setOpaque(true);
        f.add(eightbutton);

        ninebutton=new JButton("9");
        ninebutton.setBounds(200, 150, 70, 70);
        ninebutton.setFont(new Font("arial", Font.PLAIN ,20));
        ninebutton.addActionListener(this);
        ninebutton.setBackground(Color.WHITE);
        ninebutton.setOpaque(true);
        f.add(ninebutton);

		//operator buttons
        mulbutton=new JButton("x");
        mulbutton.setBounds(290, 240, 170, 70);
        mulbutton.setFont(new Font("arial", Font.PLAIN ,30));
        mulbutton.addActionListener(this);
        mulbutton.setBackground(Color.BLUE);
        mulbutton.setOpaque(true);
        f.add(mulbutton);

		plusbutton=new JButton("+");
        plusbutton.setBounds(290, 150, 75, 70);
        plusbutton.setFont(new Font("arial", Font.PLAIN ,30));
        plusbutton.addActionListener(this);
        plusbutton.setBackground(Color.BLUE);
        plusbutton.setOpaque(true);
        f.add(plusbutton);
        
        minbutton=new JButton("-");
        minbutton.setBounds(385, 150, 75, 70);
        minbutton.setFont(new Font("arial", Font.PLAIN ,35));
        minbutton.addActionListener(this);
        minbutton.setBackground(Color.BLUE);
        minbutton.setOpaque(true);
        f.add(minbutton);

        subbutton=new JButton("/");
        subbutton.setBounds(290, 330, 170, 70);
        subbutton.setFont(new Font("arial", Font.PLAIN ,30));
        subbutton.addActionListener(this);
        subbutton.setBackground(Color.BLUE);
        subbutton.setOpaque(true);
        f.add(subbutton);

        dotbutton=new JButton(".");
        dotbutton.setBounds(20, 420, 70, 70);
        dotbutton.setFont(new Font("arial", Font.PLAIN ,50));
        dotbutton.addActionListener(this);
        dotbutton.setBackground(Color.WHITE);
        dotbutton.setOpaque(true);
        f.add(dotbutton);

        equalbutton=new JButton("=");
        equalbutton.setBounds(200, 420, 70, 70);
        equalbutton.setFont(new Font("arial", Font.PLAIN ,30));
        equalbutton.addActionListener(this);
        equalbutton.setBackground(Color.GREEN);
        equalbutton.setOpaque(true);
        f.add(equalbutton);
        
        clearbutton=new JButton("Clear");
        clearbutton.setBounds(290, 420, 170, 70);
        clearbutton.setFont(new Font("arial", Font.PLAIN ,25));
        clearbutton.addActionListener(this);
        clearbutton.setBackground(Color.RED);
        clearbutton.setOpaque(true);
        f.add(clearbutton);

		//watermark
		watermark=new JLabel("created by: Dillon Grose");
		watermark.setBounds(20, 500, 130, 15);
		watermark.setBackground(Color.BLACK);
		watermark.setOpaque(true);
		watermark.setHorizontalAlignment(SwingConstants.RIGHT);
		watermark.setForeground(Color.WHITE);
		watermark.setFont(new Font("arial", Font.PLAIN, 10));
		watermark.setVisible(true);
		f.add(watermark);
        
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	//main method
	public static void main(String[] args) {
		new Calculator();
	}
	//calculator and displayer
	@Override
	public void actionPerformed(ActionEvent e) {
		Object Source = e.getSource();
		if(Source==zerobutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"0");
			}
		}else if(Source==onebutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"1");
			}
		}else if(Source==twobutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"2");
			}
		}else if(Source==threebutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"3");
			}
		}else if(Source==fourbutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"4");
			}
		}else if(Source==fivebutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"5");
			}
		}else if(Source==sixbutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"6");
			}
		}else if(Source==sevenbutton) {
			if (isOperatorClicked==true) {
				DisplayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"7");
			}			
		}else if(Source==eightbutton) {
			if (isOperatorClicked==true) {
				DisplayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"8");
			}
		}else if(Source==ninebutton) {
			if (isOperatorClicked) {
				DisplayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
		}else if(Source==dotbutton) {
			DisplayLabel.setText(DisplayLabel.getText()+".");
		}else if(Source==plusbutton) {
			isOperatorClicked=true;
			oldValue=Double.parseDouble(DisplayLabel.getText());
			calculation= 1;
		}else if(Source==minbutton) {
			isOperatorClicked=true;
			oldValue=Double.parseDouble(DisplayLabel.getText());
			calculation=2;
		}else if(Source==mulbutton) {
			isOperatorClicked=true;
			oldValue=Double.parseDouble(DisplayLabel.getText());
			calculation=3;
		}else if(Source==subbutton) {
			isOperatorClicked=true;
			oldValue=Double.parseDouble(DisplayLabel.getText());
			calculation=4;
		}else if(Source==clearbutton) {
			DisplayLabel.setText("");
		}else if(Source==equalbutton) {

			//calculations
			switch (calculation) {
			case 1: {
				newValue = oldValue + Double.parseDouble(DisplayLabel.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					DisplayLabel.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					DisplayLabel.setText(Double.toString(newValue));
				}
				break;
				
			}
			case 2: {
				newValue = oldValue - Double.parseDouble(DisplayLabel.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					DisplayLabel.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					DisplayLabel.setText(Double.toString(newValue));
				}
				break;
			}
			case 3: {
				newValue = oldValue * Double.parseDouble(DisplayLabel.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					DisplayLabel.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					DisplayLabel.setText(Double.toString(newValue));
				}
				break;
			}
			case 4: {
				newValue = oldValue / Double.parseDouble(DisplayLabel.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					DisplayLabel.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					DisplayLabel.setText(Double.toString(newValue));
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + calculation);
			}
			
		}
		
	}
}


