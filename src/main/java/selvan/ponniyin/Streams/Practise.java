package selvan.ponniyin.Streams;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import selvan.ponniyin.mac.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {

//Write a Java program to compute the average of a list of integers using streams after filtering out numbers exceeding a given threshold.
//        System.out.println(avg(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1112),9));


//        Write a Java program to calculate the average of prime numbers from a list of integers using streams.

//IntSummaryStatistics summaryStatistics = summaryStatistics(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1112));
//        System.out.println(summaryStatistics.toString());

//        System.out.println(skiptwoElements(Arrays.asList(1,1,2,3,4,4,5,5,6,6,7,8,8,9,9,9)));
//
//        Users u = new Users("Guru",18);
//        Users u1 = new Users("Ammu",18);
//        Users u2= new Users("Deepika",18);
//        Users u3 = new Users("A",19);
//        Users u4 = new Users("B",19);
//        Users u5 = new Users("C",20);
//        Users u6 = new Users("D",21);
//        Users u7 = new Users("E",21);
//
//
//        List<Users> usrlist = Arrays.asList(u,u1,u2,u3,u4,u5,u6,u7);
//
//        Map<Integer,List<Users>> usrGroupedByAge = groupEmpByAge(usrlist);
//
//
//        for(Integer age :   usrGroupedByAge.keySet()){
//            System.out.println("For age "+ age + " the users are "+ usrGroupedByAge.get(age).toString());
//        }

//        Employee e = new Employee(1,"Guru",1000,"DepA");
//        Employee e1 = new Employee(1,"Prasaath",1000,"DepA");
//        Employee e2 = new Employee(1,"A",1000,"DepA");
//        Employee e3 = new Employee(1,"B",1000,"DepB");
//        Employee e4 = new Employee(1,"C",1000,"DepB");
//        Employee e5 = new Employee(1,"D",1000,"DepC");
//        Employee e6 = new Employee(1,"E",1000,"DepC");
//        Employee e7 = new Employee(1,"F",1000,"DepC");
//        Employee e8 = new Employee(1,"G",1000,"DepC");
//
//
//        List<Employee> employeeList = Arrays.asList(e,e1,e2,e3,e4,e5,e6,e7,e8);
//
//        Map<String,List<Employee>> grpByDepartment= groupByDepartment(employeeList);
//
//
//        for(String s : grpByDepartment.keySet()){
//            System.out.println("Department name is : "+ s + " Employees are + " + grpByDepartment.get(s) );
//        }







    }


    //Group by name
    public static Map<String,List<Employee>> groupByDepartment(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }



    //Grouping users by age

    public static Map<Integer,List<Users>> groupEmpByAge(List<Users> users){
            return users.stream().collect(Collectors.groupingBy(Users::getAge));
    }



    //Skip two elements
    public static  List<Integer> skiptwoElements(List<Integer> nums){
        return nums.stream().peek(System.out::println).limit(3).toList();
    }


    public static Set<Integer> removeDuplicates(List<Integer> nums){
        return new HashSet<>(nums);
    }



    public static IntSummaryStatistics summaryStatistics(List<Integer> nums){

        return nums.stream().mapToInt(Integer::valueOf).summaryStatistics();

    }


    public static double avg(List<Integer> list,int threshold){
        return  list.stream().filter(i -> i < threshold).mapToDouble(Integer::valueOf).average().orElse(0);
    }


    public static double avgprime(List<Integer> list){
        return  list.stream().filter(Practise::isPrime).mapToDouble(Integer::valueOf).average().orElse(0);
    }


    public static boolean isPrime(int num){

        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;

        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0){
                return true;
            }
        }
        return false;
    }
}
