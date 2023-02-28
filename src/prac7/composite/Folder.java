package prac7.composite;

import java.util.ArrayList;

public class Folder implements Component{

    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }
}
