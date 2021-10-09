package in;
import java.io.*;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;



import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
//overloading in  methods


class A {
 public int foo(int a) { return 10; }

 public char foo(int a, int b) { return 'a'; }
}
class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
  
// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show()
    {
        System.out.println("Child's show()");
    }
}
  
// Driver class	

 
class Objectpass{
	int x,y;
	Objectpass(int i,int j){
		x=i;
		y=j;
	}
	boolean equalsTo( Objectpass o) {
		return(o.x == x && o.y == y);
	}
}
class Class{
	int a;
	String name;
	Class(int a,String name){
		this.a=a;
		this.name=name;
	}
	
}

  
  
class Cal extends Class{
	float numbers;
	Cal(int a,String name,float numbers){
		super(a,name);
		this.numbers=numbers;
	}
	void display()
	{System.out.println(a+" "+name+" "+numbers);}
}

public  class MyCalculator {

	private JFrame frame;
	private JTextField value1;
	private JTextField value2;
	
	
	/**
	 * Launch the application.
	 */
	public void run() {{System.out.println("Calculation");}
    }
 	 
public void msg()


	 {System.out.println("calculation is done by MyCalculator");}
	public static void main(String[] args) {
		
		System.out.println("Mycalculator done by shashank BU");
		
		 A a = new A();
	        System.out.println(a.foo(1));
	        System.out.println(a.foo(1, 2));
		 // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();
  
        // If a Parent type reference refers
        // to a Child object Child's show()
       
        Parent obj2 = new Child();
        obj2.show();
		String s1 ="Hello";
		String s2=new String(s1);
		
		System.out.println(s1 + "equals"+s2+"->"+s1.equals(s2));
		 Objectpass ob1=new  Objectpass(20,2);
		 Objectpass ob2=new  Objectpass(1,100);
		 Objectpass ob3=new  Objectpass(200,20);
		 System.out.println("ob1 == ob2:"+ ob1.equalsTo(ob2));
		 System.out.println("ob1 == ob3:"+ ob1.equalsTo(ob3));
		Cal e1=new Cal(1,"MycalculatorDoAdd",12f);
		Cal e2=new Cal(2,"MycalculatorDoSub",123f);
		Cal e3=new Cal(3,"MycalculatorDoDiv",1234f);
		Cal e4=new Cal(4,"MycalculatorDoMul",12345f);
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator window = new MyCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 461, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 194, 85, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		btnNewButton_1.setBounds(10, 263, 85, 59);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("7");
		btnNewButton_1_1.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(10, 332, 85, 59);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(122, 194, 85, 59);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		btnNewButton_1_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(122, 263, 85, 59);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("8");
		btnNewButton_1_5.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		btnNewButton_1_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_5.setBounds(122, 332, 85, 59);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("0");
		btnNewButton_1_6.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_6.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		btnNewButton_1_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_6.setBounds(48, 401, 158, 59);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("3");
		btnNewButton_1_7.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_7.setBounds(230, 194, 85, 59);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("6");
		btnNewButton_1_8.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		btnNewButton_1_8.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_8.setBounds(230, 263, 85, 59);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("9");
		btnNewButton_1_9.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		btnNewButton_1_9.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_9.setBounds(230, 332, 85, 59);
		frame.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("=");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float one=Integer.parseInt(value1.getText());
				float two=Integer.parseInt(value2.getText());
				if(actionRecived.getText().equals("SUB")) {
					float SUB=one-two;
					value2.setText(String.valueOf(SUB));
					System.out.println("subtraction is done");
				}
				if(actionRecived.getText().equals("ADD")) {
					float ADD=one+two;
					value2.setText(String.valueOf(ADD));
					System.out.println("addition is done");
				}
				if(actionRecived.getText().equals("MUL")) {
					float MUL=one*two;
					value2.setText(String.valueOf(MUL));
					System.out.println("multiplication is done");
				}
				if(actionRecived.getText().equals("DIV")) {
					float DIV=one/two;
					value2.setText(String.valueOf(DIV));
					System.out.println("dividion is done");
				}
			}
		});
		btnNewButton_1_10.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_10.setBounds(240, 401, 145, 59);
		frame.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("+");
		btnNewButton_1_11.setBackground(new Color(240, 230, 140));
		btnNewButton_1_11.setForeground(new Color(0, 0, 0));
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("ADD");
				value2.setText(null);
			}
		
		});
		btnNewButton_1_11.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_11.setBounds(352, 125, 85, 59);
		frame.getContentPane().add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("-");
		btnNewButton_1_12.setBackground(new Color(240, 230, 140));
		btnNewButton_1_12.setForeground(new Color(0, 0, 0));
		btnNewButton_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("SUB");
				value2.setText(null);
			}
		});
		btnNewButton_1_12.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_12.setBounds(352, 194, 85, 59);
		frame.getContentPane().add(btnNewButton_1_12);
		
		JButton btnNewButton_1_13 = new JButton("*");
		btnNewButton_1_13.setBackground(new Color(240, 230, 140));
		btnNewButton_1_13.setForeground(new Color(0, 0, 0));
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("MUL");
				value2.setText(null);
			}
		});
		btnNewButton_1_13.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_13.setBounds(352, 263, 85, 59);
		frame.getContentPane().add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("/");
		btnNewButton_1_14.setBackground(new Color(240, 230, 140));
		btnNewButton_1_14.setForeground(new Color(0, 0, 0));
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("DIV");
				value2.setText(null);
			}
		});
		btnNewButton_1_14.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnNewButton_1_14.setBounds(352, 332, 85, 59);
		frame.getContentPane().add(btnNewButton_1_14);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		editorPane.setBounds(10, 10, 427, 92);
		frame.getContentPane().add(editorPane);
		
		value1 = new JTextField();
		value1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		value1.setBorder(new LineBorder(SystemColor.activeCaption));
		value1.setBounds(262, 20, 158, 41);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setBackground(new Color(255, 255, 255));
		value2.setText("0");
		value2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		value2.setBounds(26, 53, 183, 41);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.setBackground(new Color(224, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				value1.setText(null);
				value2.setText("0");
				actionRecived.setText(null);
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnNewButton_2.setBounds(10, 125, 105, 59);
		frame.getContentPane().add(btnNewButton_2);
		
	    actionRecived = new JLabel("");//making global variable
	    actionRecived.setBackground(new Color(255, 218, 185));
	    actionRecived.setHorizontalAlignment(SwingConstants.CENTER);
	    actionRecived.setForeground(new Color(255, 69, 0));
		actionRecived.setFont(new Font("Tahoma", Font.ITALIC, 22));
		actionRecived.setBounds(75, 481, 217, 68);
		frame.getContentPane().add(actionRecived);
	
                
	}
	private JLabel actionRecived;
	
    
}
