public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee jane = new HourlyEmployee("Jane", "11/11/1995",
                "05/05/2020", 15);
        System.out.println(jane);
        System.out.println("Jane's Paycheck $" + jane.collectPay());
        System.out.println("Jane's Holiday Pay $" + jane.getDoublePay());
    }
}
