import java.util.Scanner;
//import java.util.MissingFormatArgumentException;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Loan user = new Loan(2.5, 5, 1000);
        // System.out.println("Annual interest rate:" + user.getAnnualInterestRate());

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double InterestRate = input.nextDouble();
        // System.out.println(annualInterestRate);

        System.out.print("Enter number of years as an integer: ");
        int noOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double userLoanAmt = input.nextDouble();

        Loan user = new Loan(InterestRate, noOfYears, userLoanAmt);

        user.loanDate();
        user.monthlyPayment();
        user.totalPayment();

        input.close();
    }
}
