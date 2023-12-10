public class Main {
    public static void main(String[] args) {
        int balance = 100; // Баланс
        int amount = 1100; // Пополнение
        boolean condition = amount >= 1_000; // Бонус на пополнение "Да/Нет"
        int bonus; // Расчеты по самой сумме
        if (condition) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int calculation = amount * bonus / 100; // Расчет бонуса
        int result = amount + balance + calculation; // Расчет баланса
        System.out.println("Баланс : " + result);
    }
}