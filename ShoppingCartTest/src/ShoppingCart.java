import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*----------------------------------------------------------
 * ShoppingCart.java
 * 
 * ShoppingCart.java is the file that holds the ShoppingCart
 * constructor. ShoppingCart.java creates a JFrame with two
 * JTextFields, four JLabels, and one JButton.
 * 
 * ----------------------------------------------------------
 */

public class ShoppingCart extends JFrame{
	//create all private components of the Shopping Cart
	private JButton enter;
    private JTextField tf1;
    private JLabel item;
    private JLabel price;
    private JTextField tf2;
    private JLabel itemError;
    private JLabel priceError;

	/**
	 * Launch the application.
	 */
    //pre-written by Eclipse IDE
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingCart frame = new ShoppingCart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShoppingCart() {
		//creates new JFrame and sets size
		JFrame f = new JFrame("Shopping Cart");
        f.setSize(600,400);
        
        ClickListener cl = new ClickListener();

        //Labels/creates enter JButton and sets bounds
        enter = new JButton("Enter");
        enter.setBounds(225,200,150,40);

        //assigns tf1 to new JTextField and sets bounds
        tf1 = new JTextField();
        tf1.setBounds(200, 150,100, 40);

        //assigns item to new JLabel, titles it, and sets bounds
        item = new JLabel();
        item.setText("Enter Item:");
        item.setBounds(100, 100, 100, 100);

        //assigns price to new JLabel, titles it, and sets bounds
        price = new JLabel();
        price.setText("Enter Price:");
        price.setBounds(350, 100, 100, 100);

        //assigns tf2 to new JTextField and sets bounds
        tf2 = new JTextField();
        tf2.setBounds(450, 150, 100, 40);

        //assigns itemError to a new JLabel and enters item error String
        itemError = new JLabel("Error: please enter the name of your item (Enter a String)");
        //assigns priceError to a new JLabel and enters price error String
        priceError = new JLabel("Error: please enter the price of your item (Enter a Double)");
        //set bounds and foreground color for itemError and priceError
        itemError.setBounds(100, 50, 400, 100);
        priceError.setBounds(100, 25, 400, 100);
        itemError.setForeground(Color.RED);
        priceError.setForeground(Color.RED);

        //adds itemError and priceError to JFrame f
        f.add(itemError);
        f.add(priceError);
        //sets itemError and priceError to not visible as they should only
        //appear when there is wrong input
        itemError.setVisible(false);
        priceError.setVisible(false);

        //add enter, item, tf1, tf2, and price to JFrame f
        f.add(enter);
        f.add(item);
        f.add(tf1);
        f.add(price);
        f.add(tf2);
        //Layout set to null since everything is already placed accordingly
        f.setLayout(null);
        //set frame visible to true and end running when window is closed
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set names for all variables that need to be accessible for JUnit tests
        tf1.setName("item");
        tf2.setName("price");
        enter.setName("enter");
        itemError.setName("itemError");
        priceError.setName("priceError");
        item.setName("itemLabel");
        price.setName("priceLabel");

        //add actionListener to enter JButton to make it function properly
        enter.addActionListener(cl);
	}
	
	private class ClickListener implements ActionListener{
	//When enter JButton is clicked, both text fields should clear and show any
	// necessary errors if wrong input is added.
		@Override
	    public void actionPerformed(ActionEvent evt) throws NumberFormatException{
	            boolean itemtf = false;
	            boolean pricetf = true;
	            try{
	                    double d1 = Double.parseDouble(tf1.getText());
	            } catch (NumberFormatException nfe) {
	                    itemtf = true;
	            }try{
	                    double d2 = Double.parseDouble(tf2.getText());
	            } catch (NumberFormatException nfe) {
	                    pricetf = false;
	            }
	            if(itemtf == true){
	                    itemError.setVisible(false);
	            }else{
	                    itemError.setVisible(true);
	            }
	            if(pricetf == false){
	                    priceError.setVisible(true);
	            }else{
	                    priceError.setVisible(false);
	            }
	            tf1.setText("");
	            tf2.setText("");
	    }
	}
	JTextField getTF1() {
		return tf1;
	}
	
	JTextField getTF2() {
		return tf2;
	}
	
	JButton getEnter() {
		return enter;
	}
	
	JLabel getItemError() {
		return itemError;
	}
	
	JLabel getPriceError() {
		return priceError;
	}
	
	JLabel getItemLabel() {
		return item;
	}
	
	JLabel getPriceLabel() {
		return price;
	}

}
