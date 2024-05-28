public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж при сумме кредита 1.000.000₽ и ставке 9.99% составляет:");
        System.out.println("на 1 год: " + service.calculate(1_000_000, 9.99, 12) + "₽");
        System.out.println("на 2 года: " + service.calculate(1_000_000, 9.99, 24) + "₽");
        System.out.println("на 3 года: " + service.calculate(1_000_000, 9.99, 36) + "₽");
    }
}