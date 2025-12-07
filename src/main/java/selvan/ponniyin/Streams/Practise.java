package selvan.ponniyin.Streams;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import selvan.ponniyin.mac.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


//
//        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2),
//                Arrays.asList(3, 4, 5));
//
//
//        System.out.println(flatList(nestedNumbers));

//        System.out.println(isPositive(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,0)));

//        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris",
//                "Charlie Lou");
//
//        System.out.println(firstNames(fullNames));
//        System.out.println(reduceToSum(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,0)));

//
//        List<Integer> myList = Arrays.asList(1,1,2,3,4,5,6,7,7,8,8,9,9,10,11,12,13);
//        System.out.println(findDuplicates(myList));

//        String input = "Java articles are Awesome";
//
//
//        System.out.println(firstRepeatingChar(input));

//        System.out.println(sortDescending());
//        System.out.println(atLeastTwice());
//        System.out.println(concatenateStreams());
//        System.out.println(cubeAndFilter());


        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));


            int max =  (int) myList.stream().mapToDouble(i ->  Math.ceil ((double) i/7)).sum();
        System.out.println(  max);

//        System.out.println(  Math.ceil((double)3/7));

    }

    static  List<Integer> myList = Arrays.asList(3,6,7,11);
    static List<Integer> distinctIntList=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1112);
    static List<Integer> myList1= Arrays.asList(1,1,2,3,4,5,6,7,7,8,8,9,9,10,11,12,13);
static List<String> str1= Arrays.asList("Guru","Prasaath","Amutha");
static List<String> str2= Arrays.asList("Pradeepikaa","Manivannan");
    static List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);


//a List of objects into a Map by considering duplicated keys and store them insorted order?

//
//    public static Map<String,List<Notes>> mapIt(List<Notes> notesList){
//        return notesList.stream().map(Collectors.groupingBy(Notes::getName)).
//    }







//perform cube on list of elements and filter

    public static List<Integer> cubeAndFilter(){
        return integerList.stream().map(i -> i*i*i).filter(i -> i>50).toList();
    }

    public static List<String> concatenateStreams(){
        return Stream.concat(str1.stream(),str2.stream()).toList();
    }

    public static boolean atLeastTwice(){
        return distinctIntList.stream().distinct().count() != distinctIntList.size();
    }


    public static List<Integer> sortDescending(){
        return myList.stream().sorted(Collections.reverseOrder()).toList();
    }


    public static char firstRepeatingChar(String s){
        HashSet<Integer> set = new HashSet<>();
        return (char) s.toLowerCase().chars().filter(i -> !set.add(i)).findFirst().orElse(-1);
    }


    public static char nonRepeating(String s) {
        return (char)  s.toLowerCase().chars().distinct().findFirst().orElse(-1);
    }


    public static List<Integer> findDuplicates(List<Integer> nums) {

        HashSet<Integer> set = new HashSet<>();
        return nums.stream().filter(integer -> !set.add(integer)).toList();
    }


    public static void startingWithOne(List<Integer> list) {
        list.stream().map(String::valueOf).filter(i -> i.charAt(0) == '1').forEach(System.out::println);
    }

    public static int reduceToSum(List<Integer> nums) {

        return nums.stream().mapToInt(Integer::valueOf).sum();
    }


    public static String firstNames(List<String> names) {

        return names.stream().map(i -> i.split(" ")[0]).findAny().orElse("NOne");
    }


    public static boolean isPositive(List<Integer> nums) {
        return nums.stream().noneMatch(i -> i < 0);
    }


    //flat lists
    public static int flatList(List<List<Integer>> nestedNumbers) {

        return nestedNumbers.stream().flatMap(List::stream).findFirst().orElse(0);
    }

    //Group by name
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }


    //Grouping users by age

    public static Map<Integer, List<Users>> groupEmpByAge(List<Users> users) {
        return users.stream().collect(Collectors.groupingBy(Users::getAge));
    }


    //Skip two elements
    public static List<Integer> skiptwoElements(List<Integer> nums) {
        return nums.stream().peek(System.out::println).limit(3).toList();
    }


    public static Set<Integer> removeDuplicates(List<Integer> nums) {
        return new HashSet<>(nums);
    }


    public static IntSummaryStatistics summaryStatistics(List<Integer> nums) {

        return nums.stream().mapToInt(Integer::valueOf).summaryStatistics();

    }


    public static double avg(List<Integer> list, int threshold) {
        return list.stream().filter(i -> i < threshold).mapToDouble(Integer::valueOf).average().orElse(0);
    }


    public static double avgprime(List<Integer> list) {
        return list.stream().filter(Practise::isPrime).mapToDouble(Integer::valueOf).average().orElse(0);
    }


    public static boolean isPrime(int num) {

        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
