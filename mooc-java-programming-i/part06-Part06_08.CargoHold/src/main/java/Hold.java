import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if ( (this.totalWeight + suitcase.totalWeight()) <= this.maxWeight){
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems(){
        if (!(this.suitcases.isEmpty())){
            for (Suitcase suitcase: suitcases){
                suitcase.printItems();
            }
        }
    }

    @Override
    public String toString(){
        return suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
