package main.model;

/**
 * Created by Sherif on 2/29/2020.
 */
public class Reptile extends Creature {


    public Reptile(String name) {
        super(name);
    }

    @Override
    public int hashCode(){
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
//        return result;
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Reptile)) return false;
        Reptile reptile = (Reptile) o;
        return this.getName().equals(reptile.getName());
    }
}
