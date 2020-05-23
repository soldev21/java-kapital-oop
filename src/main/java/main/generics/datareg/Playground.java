package main.generics.datareg;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Playground {
    public static void main(String[] args) {
        RegistryFactoryLocal registryFactoryLocal = new RegistryFactoryLocal();
        DataRegistry<String,A> dataRegistry = registryFactoryLocal.getRegistryInstance(A.class);
        dataRegistry.add("a",new A("a"));
        dataRegistry.add("a1",new A("a1"));
        DataRegistry<String,B> dataRegistry1 = registryFactoryLocal.getRegistryInstance(B.class);
        dataRegistry1.add("b",new B("b"));
        dataRegistry1.add("b1",new B("b1"));

        System.out.println(dataRegistry.getMap());
        System.out.println(dataRegistry1.getMap());

        registryFactoryLocal.getRegistryInstance(B.class).add("b2",new B("b2"));
        System.out.println(dataRegistry1.getMap());
    }
}
