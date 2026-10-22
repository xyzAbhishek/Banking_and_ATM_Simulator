

import java.util.ArrayList;
import java.util.List;

/**
 * deposit
 */
public class deposit extends transaction{
	public deposit(double amount) {
		super(amount);
		//TODO Auto-generated constructor stub
	}
	double sum = 0;
	List<Double> Balance_Deposit = new ArrayList<>();
	public void Deposit(double Principle){
		Balance_Deposit.add(Principle);	
		sum = sum+Principle;

		transaction_history.add(Principle);

	}
	
}