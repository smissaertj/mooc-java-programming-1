public class Container {
    
    private int value;
    private int maxValue;

    public Container(){
        this.value = 0;
        this.maxValue = 100;
    }

    public void add(int amount){
        this.value += amount;
        if (this.value > maxValue){
            this.value = maxValue;
        }
    }

    public void remove(int amount){
        this.value -= amount;
        if (this.value <= 0){
            this.value = 0;
        }
    }

    public int contains(){
        return this.value;
    }

    @Override
    public String toString(){
        return this.contains() + "/" + maxValue;
    }
}
