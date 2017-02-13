package ua.goit.module.third.task4;

public class TaskFourMain {
    public static void main(String[] args) {
        User user1 = new User("Dmitry", 700, 3, "Monsters Inc.",
                500, "UAH");
        System.out.printf(user1.displayTheUser());
        user1.paySalary();
        System.out.printf("\nБаланс после зарплаты - %.2f", user1.getBalance());
        user1.withdraw(200);
        System.out.printf("\nБаланс после снятия 200 - %.2f", user1.getBalance());
        System.out.printf("\nДлина имени компании - %d", user1.companyNameLenght());
        user1.monthIncreaser(2);
        System.out.printf("\nMonths of employment после увеличения на 2 - %d", user1.getMonthsOfEmployment());
    }
}
