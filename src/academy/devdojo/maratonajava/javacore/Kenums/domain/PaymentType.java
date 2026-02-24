package academy.devdojo.maratonajava.javacore.Kenums.domain;

public enum PaymentType{
        DEBIT{
            @Override
            public double calcDiscount(double value) {
                return value * 0.1;
            }
        }, CREDIT{
        @Override
        public double calcDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calcDiscount(double value);
    }