package pedrodev.live.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
    DEBIT{
        @Override
        public double discountCalc(double value) {
            return value * 0.1;
        }
    },
    CREDIT{
        @Override
        public double discountCalc(double value) {
            return value * 0.05;
        }
    };

    public abstract double discountCalc(double value);
}
