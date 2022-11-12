public class Base  {
    private static  Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public  static int calculateTotalSalaty() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalaty() {
        Employee result = employees[0];
        int minSalaty = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaty){
                minSalaty = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static  Employee findEmployeeWithMaxSalaty() {
        Employee result = employees[0];
        int maxSalaty = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaty){
                maxSalaty = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalaty() {
        return calculateTotalSalaty() / Employee.getCounter();
    }


    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


    public static void main(String[] args) {
        employees = new Employee[] {
                new Employee("Джон Коннор", 130000,1 ),
                null,
                new Employee("Эдвард Калин", 150000,4 ),
                new Employee("Стивен Роджерс", 150000,1 ),
                new Employee("Наталья Романова", 160000,2 ),
                new Employee("Олехандро Начос", 160000,2),
                new Employee("Пьетро Родригес", 160000,4 ),
                new Employee("Арнольд Шварценеггер", 170000,2 ),
                new Employee("Питтер Квилл", 170000,3 ),
                new Employee("Бенисио Д.Торро", 170000,3 ),
        };
        employees[0] = new Employee("Джон Коннор",150000,1 );
        printFullNames();
        printEmployees();
        System.out.println("avg =  " + calculateAverageSalaty());
        System.out.println("----high-----");
    }
}
