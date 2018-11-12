
public class AddToAccounts implements Order {
   private Bill bill;

   public AddToAccounts(Bill bill){
      this.bill = bill;
   }

   public void execute() {
      bill.addToAccounts();;
   }
}