package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        // Pay with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50.0);

        // Pay with Bitcoin
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75.0);
    }
}
