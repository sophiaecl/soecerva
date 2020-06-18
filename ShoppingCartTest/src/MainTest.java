
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import java.awt.Color;

import javax.swing.*;

/*---------------------------------------------------
 * MainTest.java
 * 
 * MainTest.java holds all the tests for the GUI components
 * of ShoppingCart.java
 * 
 * ---------------------------------------------------
 */


public class MainTest {
	public MainTest() {
	}
	@BeforeClass
	public static void setUpClass() throws Exception{
		
	}
	@AfterClass
	public static void tearDownClass() throws Exception{
		
	}
	@Before
	public void setUp() {
		
	}
	@After
	public void tearDown() {
		
	}
	
	//Test for main
	@Test
	public void testMain() {
		System.out.println("Testing main..");
		String[] args = null;
		ShoppingCart.main(args);
		System.out.println("Main test passed!\n");
	}
	
	@Test
	public void testPriceError() {
		System.out.println("Testing Price Error Label..");
		ShoppingCart test;
		JLabel priceTest;
		JTextField priceTF;
		JButton button;
		String expLabel;
		Color expColor;
		boolean isVis;
		
		test = new ShoppingCart();
		test.setVisible(true);
		priceTest = (JLabel)TestUtils.getLabelNamed(test, "priceError");
		
		assertNotNull("Cannot access the JLabel component", priceTest);
		System.out.println("	Enter Price Error accessed");
		
		System.out.println("	Label should be: \"Error: please enter the price of your item (Enter a Double)\"");
		expLabel = "Error: please enter the price of your item (Enter a Double)";
		assertEquals(expLabel, priceTest.getText());
		System.out.println("	Label is \"Error: please enter the price of your item (Enter a Double)\"");
		
		expColor = Color.RED;
		System.out.println("	Expected foreground color is: RED");
		assertEquals(expColor, priceTest.getForeground());
		System.out.println("	Foreground color is RED");
		
		isVis = priceTest.isVisible();
		System.out.println("	Error message should not be visible before button action");
		assertEquals(isVis, false);
		System.out.println("	Error message is not visible");

        priceTF = (JTextField)TestUtils.getTFNamed(test, "price");
        assertNotNull("Cannot access JTextField componenet", priceTF);
        priceTF.setText("cheese");
        System.out.println("	Inputing String: \"cheese\"\n	Error message should be visible");
        
        button = (JButton)TestUtils.getButtonNamed(test, "enter");
        button.doClick();
        System.out.println("	Button clicked");
        isVis = priceTest.isVisible();
		assertEquals(isVis, true);
		System.out.println("	Error message is visible");
		
		System.out.println("Price Error Label test passed!\n");
		
	}
	
	@Test
	public void testItemError() {
		System.out.println("Testing Item Error Label..");
		ShoppingCart test;
		JLabel itemTest;
		JTextField itemTF;
		JButton button;
		String expLabel;
		Color expColor;
		boolean isVis;
		
		test = new ShoppingCart();
		test.setVisible(true);
		itemTest = (JLabel)TestUtils.getLabelNamed(test, "itemError");
		
		assertNotNull("Cannot access the JLabel component", itemTest);
		System.out.println("	Enter Item Error accessed");
		
		System.out.println("	Label should be: \"Error: please enter the name of your item (Enter a String)\"");
		expLabel = "Error: please enter the name of your item (Enter a String)";
		assertEquals(expLabel, itemTest.getText());
		System.out.println("	Label is \"Error: please enter the name of your item (Enter a String)\"");
		
		expColor = Color.RED;
		System.out.println("	Expected foreground color is: RED");
		assertEquals(expColor, itemTest.getForeground());
		System.out.println("	Foreground color is RED");
		
		isVis = itemTest.isVisible();
		System.out.println("	Error message should not be visible before button action");
		assertEquals(isVis, false);
		System.out.println("	Error message is not visible");
		
		itemTF = (JTextField)TestUtils.getTFNamed(test, "item");
        assertNotNull("Cannot access JTextField componenet", itemTF);
        itemTF.setText("2");
        System.out.println("	Inputing String: \"2\"\n	Error message should be visible");
        
        button = (JButton)TestUtils.getButtonNamed(test, "enter");
        button.doClick();
        System.out.println("	Button clicked");
        isVis = itemTest.isVisible();
		assertEquals(isVis, true);
		System.out.println("	Error message is visible");
		
		System.out.println("Item Error Label test passed!\n");
		
	}
	
	@Test
	public void testPriceTextField() {
		System.out.println("Testing Price TextField..");
        ShoppingCart test;
        JTextField priceTest;
        JButton button;
        String expInput;
        String expResult;

        test = new ShoppingCart();
        test.setVisible(true);
        
        //locating the price text field in shopping cart test
        priceTest = (JTextField)TestUtils.getTFNamed(test, "price");
        
        //if the text field cannot be found, send message and fails/
        // does not finish test
        assertNotNull("Cannot access the JTextField component", priceTest);
        System.out.println("	Price TextField accessed");

        //adds input into the price text field (tf1)
        System.out.println("	Input: 3.00");
        priceTest.setText("3.00");

        //itemTest.postActionEvent();
        
        //compares expected input to the input added to the text field
        //ends test if fails, continues if it passes
        System.out.println("	Expected input before enter button hit: 3.00");
        expInput = "3.00";
        assertEquals(expInput, priceTest.getText());
        System.out.println("	Input equals expected input");
        
        button = (JButton)TestUtils.getButtonNamed(test, "enter");
        
        assertNotNull("Cannot access the JButton component", button);
        System.out.println("	Enter Button accessed");
        
        button.doClick();
        System.out.println("	Button clicked");
        
        System.out.println("	After Enter Button hit, Text Field should be empty");
        expResult = "";
        assertEquals(expResult, priceTest.getText());
        System.out.println("	Text Field is empty");

        System.out.println("Price TextField test passed!\n");
		
	}
	
	//Test for the item text field (tf1)
	@Test
    public void testItemTextField(){
		System.out.println("Testing Item TextField..");
        ShoppingCart test;
        JTextField itemTest;
        JButton button;
        String expInput;
        String expResult;

        test = new ShoppingCart();
        test.setVisible(true);
        
        //locating the item text field in shopping cart test
        itemTest = (JTextField)TestUtils.getTFNamed(test, "item");
        
        //if the text field cannot be found, send message and fails/
        // does not finish test
        assertNotNull("Cannot access the JTextField component", itemTest);
        System.out.println("	Item TextField accessed");

        //adds input into the item text field (tf1)
        System.out.println("	Input: cheese");
        itemTest.setText("cheese");

        //itemTest.postActionEvent();
        
        //compares expected input to the input added to the text field
        //ends test if fails, continues if it passes
        System.out.println("	Expected input before enter button hit: cheese");
        expInput = "cheese";
        assertEquals(expInput, itemTest.getText());
        System.out.println("	Input equals expected input");
        
        button = (JButton)TestUtils.getButtonNamed(test, "enter");
        
        assertNotNull("Cannot access the JButton component", button);
        System.out.println("	Enter Button accessed");
        
        button.doClick();
        System.out.println("	Button clicked");
        
        System.out.println("	After Enter Button hit, Text Field should be empty");
        expResult = "";
        assertEquals(expResult, itemTest.getText());
        System.out.println("	Text Field is empty");
        
        System.out.println("Item TextField test passed!\n");
 
    }
	
	@Test
	public void testEnterButton() {
		System.out.println("Testing Enter Button..");
		ShoppingCart test = new ShoppingCart();
		JButton button;
		
		button = (JButton)TestUtils.getButtonNamed(test, "enter");
		
		assertNotNull("Cannot access the JButton component", button);
        System.out.println("	Enter Button accessed");
        
        button.doClick();
        System.out.println("	Button clicked");
        
        System.out.println("Enter Button test passed!\n");
		
	}
	
	@Test
	public void testPriceLabel() {
		System.out.println("Testing Enter Price Label..");
		ShoppingCart test;
		JLabel priceTest;
		String expLabel;
		
		test = new ShoppingCart();
		test.setVisible(true);
		priceTest = (JLabel)TestUtils.getLabelNamed(test, "priceLabel");
		
		assertNotNull("Cannot access the JLabel component", priceTest);
		System.out.println("	Enter Price Label accessed");
		
		System.out.println("	Label should be: \"Enter Price:\"");
		expLabel = "Enter Price:";
		assertEquals(expLabel, priceTest.getText());
		
		System.out.println("	Label is \"Enter Price:\"\nEnter Price Label test passed!\n");
	}
	
	@Test
	public void testItemLabel() {
		System.out.println("Testing Enter Item Label..");
		ShoppingCart test;
		JLabel itemTest;
		String expLabel;
		
		test = new ShoppingCart();
		test.setVisible(true);
		itemTest = (JLabel)TestUtils.getLabelNamed(test, "itemLabel");
		
		assertNotNull("Cannot access the JLabel component", itemTest);
		System.out.println("	Enter Item Label accessed");
		
		System.out.println("	Label should be: \"Enter Item:\"");
		expLabel = "Enter Item:";
		assertEquals(expLabel, itemTest.getText());
		
		System.out.println("	Label is \"Enter Item:\"\nEnter Item Label test passed!\n");
	}

}
