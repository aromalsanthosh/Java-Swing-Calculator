import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton b9,b8,b7,b6,b5,b4,b3,b2,b1;
	
	JButton bZero,bAdd,bMultip,bDivision,bEquals,bDot,bMinus,bClear;
	

	boolean isOperationClicked=false;//To check if Operator Was Clicked Previously
	
	int operationID=0;// 1-> Addition 2->Multiplication 3->Division 4-> Subtraction 5-> Equal
	
	float preValue=0f;
	float newValue=0f;
	float Result;
	
	boolean ActionPerformed=false;//To check if any previous operation has to be completed

	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(550,580);
		jf.setLocation(300,145);
		
		
		displayLabel = new JLabel();
		displayLabel.setBounds(30,50,485,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(displayLabel);
		
		b7 =new JButton("7");
		b7.setBounds(30, 130, 80, 80);
		b7.setFont(new Font("Arial", Font.PLAIN, 35));
		b7.addActionListener(this);
		jf.add(b7);
		
		b8 =new JButton("8");
		b8.setBounds(130, 130, 80, 80);
		b8.setFont(new Font("Arial", Font.PLAIN, 35));
		b8.addActionListener(this);
		jf.add(b8);
		
		b9 =new JButton("9");
		b9.setBounds(230, 130, 80, 80);
		b9.setFont(new Font("Arial", Font.PLAIN, 35));
		b9.addActionListener(this);
		jf.add(b9);
		
		b4 =new JButton("4");
		b4.setBounds(30, 230, 80, 80);
		b4.setFont(new Font("Arial", Font.PLAIN, 35));
		b4.addActionListener(this);
		jf.add(b4);
		
		b5 =new JButton("5");
		b5.setBounds(130, 230, 80, 80);
		b5.setFont(new Font("Arial", Font.PLAIN, 35));
		b5.addActionListener(this);
		jf.add(b5);
		
		b6 =new JButton("6");
		b6.setBounds(230, 230, 80, 80);
		b6.setFont(new Font("Arial", Font.PLAIN, 35));
		b6.addActionListener(this);
		jf.add(b6);
		
		b1 =new JButton("1");
		b1.setBounds(30, 330, 80, 80);
		b1.setFont(new Font("Arial", Font.PLAIN, 35));
		b1.addActionListener(this);
		jf.add(b1);
		
		b2 =new JButton("2");
		b2.setBounds(130, 330, 80, 80);
		b2.setFont(new Font("Arial", Font.PLAIN, 35));
		b2.addActionListener(this);
		jf.add(b2);
		
		b3 =new JButton("3");
		b3.setBounds(230, 330, 80, 80);
		b3.setFont(new Font("Arial", Font.PLAIN, 35));
		b3.addActionListener(this);
		jf.add(b3);
		
		bDot =new JButton(".");
		bDot.setBounds(30, 430, 80, 80);
		bDot.setFont(new Font("Arial", Font.PLAIN, 35));
		bDot.addActionListener(this);
		jf.add(bDot);
		
		bZero =new JButton("0");
		bZero.setBounds(130, 430, 80, 80);
		bZero.setFont(new Font("Arial", Font.PLAIN, 35));
		bZero.addActionListener(this);
		jf.add(bZero);
		
		bEquals =new JButton("=");
		bEquals.setBounds(230, 430, 80, 80);
		bEquals.setFont(new Font("Arial", Font.PLAIN, 35));
		bEquals.addActionListener(this);
		jf.add(bEquals);
		
		bDivision =new JButton("/");
		bDivision.setBounds(330, 130, 80, 80);
		bDivision.setFont(new Font("Arial", Font.PLAIN, 35));
		bDivision.addActionListener(this);
		jf.add(bDivision);
		
		bMultip =new JButton("x");
		bMultip.setBounds(330, 230, 80, 80);
		bMultip.setFont(new Font("Arial", Font.PLAIN, 35));
		bMultip.addActionListener(this);
		jf.add(bMultip);
		
		bMinus =new JButton("-");
		bMinus.setBounds(330, 330, 80, 80);
		bMinus.setFont(new Font("Arial", Font.PLAIN, 35));
		bMinus.addActionListener(this);
		jf.add(bMinus);
		
		bAdd =new JButton("+");
		bAdd.setBounds(330, 430, 80, 80);
		bAdd.setFont(new Font("Arial", Font.PLAIN, 35));
		bAdd.addActionListener(this);
		jf.add(bAdd);
		
		bClear =new JButton("C");
		bClear.setBounds(430, 130, 80, 380);
		bClear.setFont(new Font("Arial", Font.PLAIN, 35));
		bClear.addActionListener(this);
		jf.add(bClear);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	public static void main (String[] args) {
		new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b7) {	
			if (isOperationClicked) {//if any operation button clicked, reseting label to new input
				displayLabel.setText("7");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");//concat previous input if no operator button clicked
			}
		}
		else if(e.getSource()==b8) {
			if (isOperationClicked) {
				displayLabel.setText("8");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==b9) {
			if (isOperationClicked) {
				displayLabel.setText("9");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==b4) {
			if (isOperationClicked) {
				displayLabel.setText("4");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource()==b5) {
			if (isOperationClicked) {
				displayLabel.setText("5");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==b6) {
			if (isOperationClicked) {
				displayLabel.setText("6");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==b1) {
			if (isOperationClicked) {
				displayLabel.setText("1");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==b2) {
			if (isOperationClicked) {
				displayLabel.setText("2");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource()==b3) {
			if (isOperationClicked) {
				displayLabel.setText("3");
				isOperationClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==bDot) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		
		else if(e.getSource()==bZero) {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource()==bClear) {
			displayLabel.setText("0");
			isOperationClicked=true;
			
			Result=0f;
			operationID=0;
			preValue=0;
			newValue=0;
		}
		else if(e.getSource()== bAdd) { //Addition
			
			if(operationID!=1 && preValue!=0 && !isOperationClicked)
				  Calculation(); 
			operationID=1;
			
			if(!isOperationClicked)
				Calculation();

		}
		else if(e.getSource()== bMultip) { //Multiplication
			if(operationID!=2 && preValue!=0 && !isOperationClicked)
				Calculation();
		  
			operationID=2;
			if(!isOperationClicked)
				Calculation();
	  }else if(e.getSource()== bDivision) { //Division

		  if(operationID!=3 && preValue!=0 && !isOperationClicked)
			    Calculation();
		  
		  operationID=3;
		  if(!isOperationClicked)
			  	Calculation();

	  }else if(e.getSource()== bMinus) { //Subtraction

		  if(operationID!=4 && preValue!=0 && !isOperationClicked)
			  	Calculation();
		  operationID=4;
		  if(!isOperationClicked)
				Calculation();
	  }else if(e.getSource()== bEquals) { //Equal
		  	Calculation();
		  	operationID=5;
	  }
	}
	//Main Calculation function
	void Calculation() {
		switch(operationID) {
	  	case 1://Add
	  		if (Result != 0)//storing previous result to preVal For continious Operation
	  			preValue = Result;

	  		if (preValue ==0)
	  			preValue = Float.parseFloat(displayLabel.getText());
	  		else
	  			newValue = Float.parseFloat(displayLabel.getText());

	  		if (newValue!=0) {
	  			ActionPerformed=true;
	  			Result=preValue+newValue;
	  			displayLabel.setText("" + formatRes(Result));
	  		}
	  		else {
	  			ActionPerformed=false;
	  			displayLabel.setText("" + formatRes(preValue));
	  		}

	  		newValue=0f;
	  		break;
	  	case 2://Multiplication
	  		if (Result != 0)
	  			preValue = Result;

	  		if (preValue ==0)
	  			preValue = Float.parseFloat(displayLabel.getText());
	  		else
	  			newValue = Float.parseFloat(displayLabel.getText());


	  		if(newValue !=0.0f) // To avoid Multiplication with 0 at initial stage
	  			Result=preValue * newValue;
	  		else
	  			Result=preValue;

	  		if (newValue!=0) {
	  			ActionPerformed=true;
	  			Result=preValue*newValue;
	  			displayLabel.setText("" + formatRes(Result));
	  		}
	  		else {
	  			ActionPerformed=false;
	  			displayLabel.setText("" + formatRes(preValue));
	  		}
	  		newValue=0;
	  		break;

	  	case 3://Division
	  		if (Result != 0)
	  			preValue = Result;

	  		if (preValue ==0)
	  			preValue = Float.parseFloat(displayLabel.getText());
	  		else
	  			newValue = Float.parseFloat(displayLabel.getText());




	  		if (preValue!=0 && newValue!=0) {
	  			Result=preValue/newValue;
	  			displayLabel.setText("" + formatRes(Result));

	  	  		if (newValue!=0) {
	  	  			ActionPerformed=true;
	  	  		}
	  	  		else
	  	  			ActionPerformed=false;

	  		}
	  		newValue=0f;
	  		break;

	  	case 4://Subtraction
	  		if (Result != 0)
	  			preValue = Result;

	  		if (preValue ==0)
	  			preValue = Float.parseFloat(displayLabel.getText());
	  		else
	  			newValue = Float.parseFloat(displayLabel.getText());

	  		if (newValue!=0) {
	  			ActionPerformed=true;
	  			Result=preValue-newValue;
	  			displayLabel.setText("" + formatRes(Result));
	  		}
	  		else {
	  			ActionPerformed=false;
	  			displayLabel.setText("" + formatRes(preValue));
	  		}

	  		newValue=0f;
	  		break;
	 	}
		isOperationClicked=true;
		
	
	  	
	}
	
	//Function for Formatting , unwanted decimal Zeros if required (for eg, 5+2 = will be 5.0, this modifies as 5 )
	public static String formatRes(double d){
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	}

		


}
