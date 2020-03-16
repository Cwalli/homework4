package com.company;

public class Customer {
    String firstname;
    String lastname;
    String phone;

     public Customer (String firstname, String lastname, String phone){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }



    public void getFullName (){
        System.out.print(firstname + " " + lastname + " " + phone);
    }


}
