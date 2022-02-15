import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void loanDate() {
        loanDate = new java.util.Date();
        System.out.println("The loan was created on " + loanDate);
    }

    public double monthlyPayment() {
        double monthlyInterestRate = (this.annualInterestRate / 100) / 12;
        double monthlyPayment = ((this.loanAmount * monthlyInterestRate)
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));
        return monthlyPayment;
    }

    public void totalPayment() {
        double totalPayment = monthlyPayment() * this.numberOfYears * 12;
        System.out.println("The monthly payment is: " + monthlyPayment());
        System.out.println("The total payment is: " + totalPayment);
    }
}
