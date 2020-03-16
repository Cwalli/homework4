package com.company;

public class Customer {
    String firstname;
    String lastname;
    String phone;
    // Конструктор с параметрами
     public Customer (String firstname, String lastname, String phone){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }


        // Вывод с помощью метода getFullName
    public void getFullName (){
        System.out.print(firstname + " " + lastname + " " + phone);
    }


}
