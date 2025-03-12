import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<Integer> phone = new ArrayList<>();
    public static ArrayList<String> address = new ArrayList<>();
    public static ArrayList<Double> salary = new ArrayList<>();
    public static ArrayList<String> department = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("--------welcome to employees application--------");
        while (true) {
            System.out.println("1-Add Employee \n2-Display Employee\n3-Delete Employee \n4-Edit employee\n5-Calculate salaries \n6-sorting \n7-exit");
            System.out.print("your choice is :");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:adding();break;
                case 2:display();break;
                case 3:delete();break;
                case 4:edit();break;
                case 5:calculateTotalSalaries();break;
                case 6:sorting();break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if (choice == 7) break;
        }
    }
    static void adding() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name");

        String empName = input.nextLine();
        System.out.println("Enter employee phone number");

        int empNum = input.nextInt();
        input.nextLine();
        System.out.println("Enter employee address");

        String empAddress = input.nextLine();
        System.out.println("Enter employee salary");

        double empSalary = input.nextDouble();
        System.out.println("Enter employee department");
        input.nextLine();
        String empDepartment = input.nextLine();
        names.add(empName);
        phone.add(empNum);
        address.add(empAddress);
        salary.add(empSalary);
        department.add(empDepartment);
    }
    static void display() {
        System.out.println("Please enter employee name...");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (!names.contains(name)) {
            System.out.println(name + " is not found");
            return;
        }
        int index = names.indexOf(name);
        System.out.println("employee data ");
        System.out.println("Name:" + names.get(index));
        System.out.println("Phone:" + phone.get(index));
        System.out.println("Address:" + address.get(index));
        System.out.println("Salary:" + salary.get(index));
        System.out.println("Department:" + department.get(index));
    }
    static void delete() {
        System.out.println("please enter the name of the employee...");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int index = names.indexOf(name);
        if (names.contains(name)) {
            names.remove(name);
            phone.remove(index);
            address.remove(index);
            salary.remove(index);
            department.remove(index);

            System.out.println("Employee is deleted successfully");
        }
    }
    static void edit() {
        System.out.println("Plese enter tne employee name...");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        int index = names.indexOf(name);

        if (names.contains(name)) {
            System.out.println("enter name");
            String newName = input.nextLine();

            System.out.println("enter phone number");
            int newPhone = input.nextInt();
            input.nextLine();

            System.out.println("enter address");
            String newAddress = input.nextLine();

            System.out.println("enter salary");
            double newSalary = input.nextDouble();
            input.nextLine();

            System.out.println("enter department");
            String newDepartment = input.nextLine();

            names.set(index, newName);
            phone.set(index, newPhone);
            address.set(index, newAddress);
            salary.set(index, newSalary);
            department.set(index, newDepartment);

            System.out.println("Employee is updated successfully");

        }

    }
    static void calculateTotalSalaries() {
        System.out.println("Plese enter tne Department...");
        Scanner input = new Scanner(System.in);
        String depart = input.nextLine();

        double totalSalaries = 0.0;

        for (int i = 0; i < department.size(); i++) {
            if (department.get(i).equals(depart)) {
                totalSalaries += salary.get(i);
            }
        }
        System.out.println("Total Salaries for " + depart + " department: " + totalSalaries);
    }
    static void sorting() {
        System.out.println("choose the type of sorting...");
        System.out.println("1-sorting by names \n2-sorting by phone number\n3-sorting by department");
        Scanner input = new Scanner(System.in);
        int sortType = input.nextInt();
        switch (sortType) {
            case 1:
                sortingByNames();
                break;
            case 2:
                sortingByPhoneNumber();
                break;
            case 3:
                sortingByDepartment();
                break;
        }
    }
    static void sortingByNames() {
       ArrayList<String>sorted= new ArrayList<>();
       for (String name:names){
           sorted.add(name);
       }
       Collections.sort(sorted);
        for(String sort:sorted){
            for(String name :names){
                if(name.equals(sort)){
                    int index = names.indexOf(name);
                    System.out.println("employee data is :");
                    System.out.println(names.get(index));
                    System.out.println(phone.get(index));
                    System.out.println(address.get(index));
                    System.out.println(salary.get(index));
                    System.out.println(department.get(index));
                }
            }

        }

    }
    static void sortingByPhoneNumber() {
        ArrayList<Integer>sorted= new ArrayList<>();
        for (int phoneNum:phone){
            sorted.add(phoneNum);
        }
        Collections.sort(sorted);
        for(int sort:sorted){
            for(int phoneNum :phone){
                if(phoneNum==sort){
                    int index = phone.indexOf(phoneNum);
                    System.out.println("employee data is :");
                    System.out.println(names.get(index));
                    System.out.println(phone.get(index));
                    System.out.println(address.get(index));
                    System.out.println(salary.get(index));
                    System.out.println(department.get(index));
                }
            }

        }

    }



}