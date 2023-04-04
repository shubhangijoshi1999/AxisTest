package org.example;

import Bank.repositories.cus_DAO;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws SQLException {
        Scanner sc = new Scanner(System.in);
        cus_DAO dao=new cus_DAO();
        while (true){
            System.out.println("\n 1:Display Customer Details 2:Add customer");
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:dao.getAll();
                break;
                case 2:dao.AddCustomer();
                System.out.println("Fill the following Details:");
                dao.getAll();
                break;
            }
        }

    }
}