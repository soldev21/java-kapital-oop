package main.collections.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model /*implements Comparable<Model>*/{

    private String name;
    private boolean cancelled;
    private Integer ranking;

    public Model(String name){
        this(name,0);
    }

    public Model(String name,Integer ranking){
        setName(name);
        setCancelled(false);
        setRanking(ranking);
    }

    @Override
    public int hashCode(){
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Model)) return false;
        Model model = (Model) o;
        return this.getName().equals(model.getName());
    }

//    @Override
//    public int compareTo(Model model) {
//        return getRanking()-model.getRanking();
//    }
}
