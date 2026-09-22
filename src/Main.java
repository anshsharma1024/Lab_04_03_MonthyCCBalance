public class Main {
    public static void main(String[] args) {
        double ccBalance = 5000;
        double annualInterestRate = 0.17;

        double monthOneInterest = ccBalance * (annualInterestRate / 12);
        double balanceAfterMonthOne = ccBalance + monthOneInterest;

        double monthTwoInterest = balanceAfterMonthOne * (annualInterestRate / 12);
        double balanceAfterMonthTwo = balanceAfterMonthOne + monthTwoInterest;

        System.out.println("Starting balance: $" + ccBalance);
        System.out.println("Interest due after month 1: $" + monthOneInterest);
        System.out.println("Balance after month 1: $" + balanceAfterMonthOne);
        System.out.println("Interest due after month 2: $" + monthTwoInterest);
        System.out.println("Balance after month 2: $" + balanceAfterMonthTwo);
    }
}