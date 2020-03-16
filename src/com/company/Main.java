package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * Инициализация полей через конструктор
         */
        Customer Customer1 = new Customer("Иван","Иванов","+777374274277");
        Address Address1 = new Address("Минск", "Ивановская", "7");
        Customer Customer2 = new Customer("Петр","Петров","+7773745343534");
        Address Address2 = new Address("Минск", "Петровская", "7");
        Customer Customer3 = new Customer("Поп","Попов","+7773555555555");
        Address Address3 = new Address("Минск", "Поповская", "7");
        /**
         * Вывод полной информации о заказчике
         */
        Customer1.getFullName();
        Address1.getFullAddress();System.out.println();
        Customer2.getFullName();
        Address2.getFullAddress();System.out.println();
        Customer3.getFullName();
        Address3.getFullAddress();System.out.println();
    }
}
