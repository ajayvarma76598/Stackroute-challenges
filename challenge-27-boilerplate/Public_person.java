import java.text.DecimalFormat;
import java.util.Scanner;
public class Public_person extends Customer {
    private final double interest_RATE_public=5.00;  
    private double time_in_years_public;
    private double balance_public;
    private double interest_public;
    public double geInterest_RATE_public() {
        return interest_RATE_public;
    }
    public double getInterest_RATE_public() {
        return interest_RATE_public;
    }
    public double getTime_in_years_public() {
        return time_in_years_public;
    }
    public void setTime_in_years_public(double time_in_years_public) {
         this.time_in_years_public = time_in_years_public;
    }
    public double getBalance_public() {
        return balance_public;
    }
    public void accept_public(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your acc balance: ");
        balance_public = s.nextDouble();
        System.out.println("Enter time: ");
        time_in_years_public = s.nextDouble();
    }
    public void calculate_interest_public(){
        interest_public = (balance_public * time_in_years_public * interest_RATE_public ) /100;
        System.out.format("%.2f",interest_public);
    }
}
