
public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
        
            try {
                Thread.sleep(10); // 10ms is 1 Centisecond
            } catch (Exception e) {
        
            }
        }
    }
}
