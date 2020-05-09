package main.collections;

import main.collections.model.Model;

import java.util.Comparator;

public class ModelComparator implements Comparator<Model> {
    @Override
    public int compare(Model model, Model t1) {
        return model.getRanking()-t1.getRanking();
//        return 0;
    }
}
