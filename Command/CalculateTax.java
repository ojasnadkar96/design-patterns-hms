
public class CalculateTax implements Order {
   private Bill bill;

   public CalculateTax(Bill bill){
      this.bill = bill;
   }

   public void execute() {
      bill.calculateTax();;
   }
}