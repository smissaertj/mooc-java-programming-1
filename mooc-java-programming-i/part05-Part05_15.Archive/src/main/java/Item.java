public class Item {
    private String id;
    private String name;

    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object compared){
        // Do the objects share the same memory address?
        if (this == compared){
            return true;
        }

        // Is the compared object an instance of this class?
        if (!(compared instanceof Item)){
            return false;
        }

        // compared is an instance of this class, we can check the instance variables
        Item comparedItemObj = (Item) compared;
        if (
            this.id.equals(comparedItemObj.id)
        ) { return true; }

        return false;
    }
}
