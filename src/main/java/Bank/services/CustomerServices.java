package Bank.services;

import Bank.entities.Customer;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerServices {
    private java.time.LocalDate LocalDate;

    public Customer add(){
        Scanner sc=new Scanner(System.in);
        Customer c1=new Customer();
        System.out.println("enter Customer ID");
        c1.setcId(sc.nextInt());
        System.out.println("enter Customer name");
        c1.setName(sc.next());
        System.out.println("enter Customer city");
        c1.setCity(sc.next());
        System.out.println("enter Customer Email");
        c1.setEmail(sc.next());
        c1.setDate();

        return c1;
    }
}
