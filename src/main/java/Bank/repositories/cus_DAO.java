package Bank.repositories;

import Bank.entities.Customer;
import Bank.services.CustomerServices;
import Bank.util.DBCon;

import javax.naming.Name;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class cus_DAO {
Scanner sc= new Scanner(System.in);
Connection con;
ResultSet Data;
Customer c;
    {
       try {
           con= DBCon.getConnection();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    }

    public void getAll()
    {
        ArrayList<Customer>clist=new ArrayList<Customer>();
        try {
            Statement stmt =con.createStatement();
            Data = stmt.executeQuery("Select * from Customer");
            while (Data.next()){
                int cId = Data.getInt(1);
                String Name=Data.getString(2);
                String city=Data.getString(3);
                String Email=Data.getString(4);
                LocalDate Date= LocalDate.ofEpochDay(Data.getInt(5));
                c=new Customer();
                c.setcId(cId);
                c.setName(Name);
                c.setCity(city);
                c.setEmail(Email);
                c.setDate();
                clist.add(c);

                System.out.println(c);

            }

        }catch (SQLException e){
            throw new RuntimeException(e);

        }

    }
    public void AddCustomer() {

        CustomerServices CustServiceobj=new CustomerServices();
        c=CustServiceobj.add();
        try {
            String Query="insert into customer values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, c.getcId());
            stmt.setString(2, c.getName());
            stmt.setString(3, c.getCity());
            stmt.setString(4,c.getEmail());
            stmt.setDate(5, java.sql.Date.valueOf(c.getDate()));

            int i = stmt.executeUpdate();
            if(i>0)
                System.out.println(i + " records inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void UpdateCustomerById() {

    }

    }





