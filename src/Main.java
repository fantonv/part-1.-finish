public class Main {

    public static int calculateSum(Employee[] salary) {
        int sum = 0;
        for (Employee employees : salary) {
            sum = sum + employees.getSalary();
        }
        return sum;
    }

    public static void searchMedium(Employee[] medium) {
        double sum = calculateSum(medium);
        double mediumSalary = sum / medium.length;
        System.out.println("Средняя зарплата составила: " + mediumSalary);
    }

    public static void withdrawEmployers(Employee[] amount){
        for (Employee employees : amount) {
            System.out.println(employees);
        }
    }

    public static void searchMaximum(Employee[] max) {
        int maxMoney = 0;
        String mostRich = "";
        for (Employee employees : max){
            if (employees.getSalary() > maxMoney) {
                maxMoney = employees.getSalary();
                mostRich = employees.getFullName();
            }
        }
        System.out.println("Самая высокая зарплата у " + mostRich + " и составляет  " + maxMoney + " руб");
    }

    public static void searchMinimum(Employee[] min) {
        int minMoney = 100000000;
        String mostPoor = "";
        for (Employee employees : min){
            if (employees.getSalary() < minMoney) {
                minMoney = employees.getSalary();
                mostPoor = employees.getFullName();
            }
        }
        System.out.println("Самая низкая зарплата у " + mostPoor + " и составляет  " + minMoney + " руб");
    }
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee(89787,"Шварцнеггер Арнольд Карлович", 1);
        employee[1] = new Employee(99999,"Немцов Борис Ефимович", 2);
        employee[2] = new Employee(34564,"Джоли Анджелина Петровна", 3);
        employee[3] = new Employee(43534,"Питт Бред Иванович", 4);
        employee[4] = new Employee(34567,"Клинтон Билл Васильевич", 5);
        employee[5] = new Employee(34523,"Рембо Джон Викторович", 1);
        employee[6] = new Employee(45645,"Ведьмакова Цирилла Герольтовна", 2);
        employee[7] = new Employee(56765,"Дикаприо Леонардо Леонидович", 3);
        employee[8] = new Employee(67867,"Депп Джони Ефимович", 4);
        employee[9] = new Employee(78997,"Ведмаков Геральт Весимирович", 5);

        withdrawEmployers(employee);

        int total = calculateSum(employee);
        System.out.println("Сумма затрат в месяц составила: " + total + " руб");

        searchMaximum(employee);
        searchMinimum(employee);
        searchMedium(employee);
    }
}