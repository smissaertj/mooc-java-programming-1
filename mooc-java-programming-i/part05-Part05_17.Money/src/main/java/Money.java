
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public Money minus(Money decreaser) {
        int newEuros;
        int newCents;
    
        if (this.euros < decreaser.euros || (this.euros == decreaser.euros && this.cents < decreaser.cents)) {
            // If the decreaser's value is greater than this Money object's value, return 0
            newEuros = 0;
            newCents = 0;
        } else {
            newEuros = this.euros - decreaser.euros;
            if (this.cents < decreaser.cents) {
                // Borrow 1 euro and add 100 cents
                newEuros -= 1;
                newCents = this.cents + 100 - decreaser.cents;
            } else {
                newCents = this.cents - decreaser.cents;
            }
        }
    
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared){
        // Are the objects on the same memory address? Then they're equal and not "less than"
        if (this == compared){
            return false;
        }

        // Compare the values of the Objects.
        if (
            this.euros < compared.euros ||

            (this.euros <= compared.euros &&
            this.cents < compared.cents)
        ) { return true;}


        return false;
    }

}
