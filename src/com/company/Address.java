package com.company;

public class Address {
    String town;
    String street;
    String home;
    // Конструктор с параметрами
    public Address (String town, String street, String home){
        this.town = town;
        this.street = street;
        this.home = home;
    }
         // Вывод с помощью метода getFullAddress
        public void getFullAddress ()
         {
             System.out.print(" " + town + " " + street + " " + home);
        }



}
