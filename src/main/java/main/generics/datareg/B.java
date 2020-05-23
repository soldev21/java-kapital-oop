package main.generics.datareg;

import lombok.Data;

@Data
public class B {
    private String name;

    public B(String name){
        setName(name);
    }
}
