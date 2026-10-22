import java.util.ArrayList;
import java.util.List;

/**
 * withdraw
 */
public class withdraw extends deposit{
	List<Double> withdrawl_history = new ArrayList<>();
 	public void withdraw(double withdrawl_amount){
 		if(sum>0 && sum>=withdrawl_amount){
 		  withdrawl_history.add(withdrawl_amount);
 		  sum = sum-withdrawl_amount;
 		System.out.println("The amount is withdrawn Successfully");
 		 }
 		else{
 			System.out.println("Not enough balance to withdraw !!");
 		 }
    }
}