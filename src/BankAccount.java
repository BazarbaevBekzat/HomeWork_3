public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Возврашяемый: " + sum + " сом");
        System.out.println("Текущий баланс: " + amount + " сом");
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств", amount);
        } else {
            amount -= sum;
            System.out.println("Взятый: " + sum + " сом");
            System.out.println("Текущий баланс: " + amount + " сом");
        }
    }
}

