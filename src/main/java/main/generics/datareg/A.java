package main.generics.datareg;

import lombok.Data;

@Data
public class A {
    private String name;

    public A(String name){
       setName(name);
    }
}
