package listaExercico.application;

import listaExercico.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be reistred? ");
        int N = sc.nextInt();

        for(int i = 0; i<N; i++) {

            System.out.println();
            System.out.printf("Employee #%d:%n", (i+1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Integer pos = position(list, idSalary);
        if(pos == null) System.out.println("This ID does not exist!");
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee emp : list) {
            System.out.println(emp);
        }


        sc.close();
    }

    static Integer position(List<Employee> list, int id) {
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i).getId() == id)
                return i;
        }
        return null;
    }
}
