import java.awt.*;
import javax.swing.*;

/*-----------------------------------------------------
 * TestUtils.java
 * 
 * TestUtils.java holds helper functions for MainTest.java
 * ----------------------------------------------------
 */

public class TestUtils {
	//helper function for testItemTextField and for testPriceTextField
	public static JTextField getTFNamed(ShoppingCart parent, String name) {
		//if parent->child has String name
		//	return child
		//else if parent->other TF child has String name
		//	return other child
		//else
		//	return null
		if(name.equals(parent.getTF1().getName())) {
			return parent.getTF1();
		}
		else if(name.equals(parent.getTF2().getName())) {
			return parent.getTF2();
		}
		return null;
	}
	
	//helper function for testItemError and for testPriceError
	public static JLabel getLabelNamed(ShoppingCart parent, String name) {
		//if parent->child has String name
		//	return child
		//else if parent->other label child has String name
		//	return other child
		//else
		//	return null
		if(name.equals(parent.getItemError().getName())) {
			return parent.getItemError();
		}
		else if(name.equals(parent.getPriceError().getName())) {
			return parent.getPriceError();
		}
		else if(name.equals(parent.getItemLabel().getName())) {
			return parent.getItemLabel();
		}
		else if(name.equals(parent.getPriceLabel().getName())) {
			return parent.getPriceLabel();
		}
		return null;
	}
	
	//helper function for testEnter
	public static JButton getButtonNamed(ShoppingCart parent, String name) {
		//if parent->child has String name
		//	return child
		//else 
		//	return null;
		if(name.equals(parent.getEnter().getName())) {
			return parent.getEnter();
		}
		return null;
	}

}
