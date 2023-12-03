public class Main {
    public static void main(String[] args) {
        int balance = 100; // Баланс
        int amount = 1100; // Пополнение
        boolean bonus = amount >= 1_000; // Бонус на пополнение "Да/Нет"
        int x; // Расчеты по самой сумме
        if (bonus) {
            x = 1;
        } else {
            x = 0;
        }
        int a = amount * x / 100; // Расчет бонуса
        int b = amount + balance + a; // Расчет баланса
        System.out.println("Баланс : " + b);
    }
}