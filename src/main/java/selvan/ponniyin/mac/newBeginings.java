package selvan.ponniyin.mac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class newBeginings {


    public static void main(String[] args) {


        Employee e = new Employee(1, "Guru", 1000.0, "HR");
        Employee e1 = new Employee(1, "Prasaath", 900.0, "Admin");
        Employee e2 = new Employee(1, "Amutha", 800.0, "IT");
        Employee e3 = new Employee(1, "Amirtha", 1000.0, "IT");
        Employee e4 = new Employee(1, "Kasinathan", 1500.0, "Admin");
        Employee e5 = new Employee(1, "Aegon", 3000.0, "HR");


        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);


        Map<String, List<Employee>> res = new HashMap<>();





    }
}
