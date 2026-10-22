/**
 * transaction
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class transaction  {
	double amount;
	LocalDateTime time;
	List<transaction> transaction_history = new ArrayList<>();

	public transaction(double amount){
		this.amount =  amount;
		this.time = LocalDateTime.now();
	}

	public void message(){
		System.out.println("Amount: "+amount+" Timestamp: "+time);
	}

}