public class CreditPaymentService {

    public int calculate(int creditAmount, double annualRate, int paymentsMonths) {

        double annuityPayment = (creditAmount * (annualRate / 100 / 12) * Math.pow((1 + annualRate / 100 / 12), paymentsMonths)) / (Math.pow((1 + annualRate / 100 / 12), paymentsMonths) - 1);
        return (int) annuityPayment;
    }
}
