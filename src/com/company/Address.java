package com.company;

public class Address {
    String town;
    String street;
    String home;

    public Address (String town, String street, String home){
        this.town = town;
        this.street = street;
        this.home = home;
    }
        public void getFullAddress ()
         {
             System.out.print(" " + town + " " + street + " " + home);
        }



}
