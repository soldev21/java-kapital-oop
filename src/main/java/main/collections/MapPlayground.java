package main.collections;

import main.model.Reptile;

import java.util.*;

public class MapPlayground {
    public static void main(String[] args) {
        Customer customer = new Customer("Tural", "Aliyev", "+994551234567", "Somewhere in Baku)");
        Customer customer2 = new Customer("Sharif", "Huseynli", "+994557654321", "Somewhere in Baku) 2");
        Map<Object, Customer> map = new HashMap<>();
        map.put(customer.getName(), customer);
        map.put(customer2.getName(), customer2);

        map.put(customer.getPhone(),customer);
        map.put(customer2.getPhone(),customer2);

        map.put(5,customer);
        map.put("5",customer2);

        String searchKey = "+994557654321";
        map.remove(5);
        map.remove(customer.getPhone());
        Customer wantedCustomer = map.get(5);

        if (Objects.nonNull(wantedCustomer)) {
            System.out.println(wantedCustomer.getName()+" "+wantedCustomer.getSurname()+" "+wantedCustomer.getPhone());
        } else {
            System.out.println("Customer not found!");
        }

//        List<Customer> list = new ArrayList<>();
//        list.add(customer);
//        list.add(customer2);
//
//        String phone = "+994557654321";
//        Customer wantedCustomer = null;
//        for (Customer c : list){
//            if (c.getPhone().equals(phone)) {
//                wantedCustomer = c;
//                break;
//            }
//        }

//        String phone = "+994557654321";
//        Customer wantedCustomer = null;
//        for (Customer c : list){
//            if (c.getName().equals(phone)) {
//                wantedCustomer = c;
//                break;
//            }
//        }
//
//        if (Objects.nonNull(wantedCustomer)) {
//            System.out.println(wantedCustomer.getName());
//        }else {
//            System.out.println("Customer not found!");
//        }
    }
}
