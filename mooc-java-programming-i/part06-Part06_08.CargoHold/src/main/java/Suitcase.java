import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Item> items;


    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        if ( (this.totalWeight+ item.getWeight()) <= this.maxWeight){
            this.items.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public void printItems(){
        if (!(this.items.isEmpty())){
            for (Item item: items){
                System.out.println(item);
            }
        }
    }

    public int totalWeight(){
        return this.totalWeight;
    }

    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item: items){
            if (heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }

    @Override
    public String toString(){
        if (this.items.isEmpty()){
            return "no items (0 kg)";
        }

        if (this.items.size() == 1){
            return items.size() + " item (" + this.totalWeight + " kg)";
        }

        return items.size() + " items (" + this.totalWeight + " kg)";
    }
}