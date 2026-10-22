import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User_Detials
 */
public class User_Details {
	List<String> AccountHolder = new ArrayList<>();
	List<Double> AccountNumber = new ArrayList<>();
	public void user_details(String name, double number){
		AccountHolder.add(name);
		AccountNumber.add(number);
	}
}