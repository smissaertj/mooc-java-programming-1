public class Timer {
    private ClockHand centiseconds;
    private ClockHand seconds;

    public Timer(){
        this.centiseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.centiseconds.advance();
        if (this.centiseconds.value() == 0){
            this.seconds.advance();
        }
    }

    @Override
    public String toString(){
        return seconds.toString() + ":" + centiseconds.toString(); 
    }
}
