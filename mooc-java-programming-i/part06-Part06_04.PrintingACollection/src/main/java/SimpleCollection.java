
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString(){
        String strElements = "";
        for (String el: elements){
            strElements = strElements + "\n" + el;
        }

        if (this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        } else if (this.elements.size() == 1){
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + strElements;
        } else {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + strElements;
        }

    }
    
}
