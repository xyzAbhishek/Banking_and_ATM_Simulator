
import java.time.LocalDateTime;

/**
 * transaction_history
 */
public class transaction_history extends check_balance {
	public void Stored_History(){
		LocalDateTime time = LocalDateTime.now();
	 System.out.println("Amount added:");
	 if(Balance_Deposit.isEmpty()){
	 	System.out.println("No Deposit is made");
	 }
	 else{
	 for (Double double1 : Balance_Deposit) {
	 	System.out.println(double1 +" TimeStamp: "+time);
	 }
	}
	 System.out.println("Amount withdrawn");
	 if(withdrawl_history.isEmpty()){
	 	System.out.println("No Withdrawl is made");
	 }
	 else{
	 for (Double double2 : withdrawl_history) {
	 	System.out.println(double2 +" TimeStamp: "+time);
	 }
	}
	}
}