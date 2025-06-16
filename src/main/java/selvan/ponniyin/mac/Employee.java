package selvan.ponniyin.mac;

public class Employee {


    private int id;
    private String name;
    private double Salary;
    private String Department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                ", Department='" + Department + '\'' +
                '}';
    }

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        Salary = salary;
        Department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
