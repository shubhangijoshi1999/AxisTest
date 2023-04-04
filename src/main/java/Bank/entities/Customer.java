package Bank.entities;

import java.time.LocalDate;

public class Customer {
private int  cId;
private String Name;
private String city;
private String Email;
private LocalDate Date=LocalDate.now();
public Customer(){

}

    public Customer(int cId, String name, String city, String email, LocalDate date) {
        this.cId = cId;
        Name = name;
        this.city = city;
        Email = email;
       this. Date = date;
    }

    public int getcId() {
        return cId;
    }
    public void setcId(int cId) {
        this.cId = cId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate() {
        this.Date=LocalDate.now();
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                ", Email='" + Email + '\'' +
                ", Date=" + Date +
                '}';
    }
}
