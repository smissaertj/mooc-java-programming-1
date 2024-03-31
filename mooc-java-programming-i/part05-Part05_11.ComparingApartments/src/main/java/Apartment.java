
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getPrice(){
        return this.squares * this.pricePerSquare;
    }

    public boolean largerThan(Apartment comparedApt){
        if (this.rooms > comparedApt.rooms){
            return true;
        }

        if (this.squares > comparedApt.squares){
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment comparedApt){
        if (this.getPrice() > comparedApt.getPrice()){
            return this.getPrice() - comparedApt.getPrice();
        } else {
            return comparedApt.getPrice() - this.getPrice();
        }
    }

    public boolean moreExpensiveThan(Apartment comparedApt){
        if (this.getPrice() > comparedApt.getPrice()){
            return true;
        }

        return false;
    }

}
