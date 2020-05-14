package main.collections;

import main.collections.model.Model;

import java.util.Comparator;

public class ModelComparator2 implements Comparator<Model> {
    @Override
    public int compare(Model model, Model t1) {
        return t1.getRanking()-model.getRanking();
//        return 0;
    }
}
