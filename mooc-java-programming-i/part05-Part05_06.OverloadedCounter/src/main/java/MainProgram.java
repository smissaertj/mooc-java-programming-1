
public class MainProgram {

    public static void main(String[] args) {
        Counter myCounter = new Counter(5);
        System.out.println(myCounter.value());
        myCounter.increase();
        myCounter.increase(10);
        System.out.println(myCounter.value());
        myCounter.decrease();
        System.out.println(myCounter.value());
    }
}
