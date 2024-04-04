
public class Main {

    public static void main(String[] args) {
        
        // TEST 1 - Incrementing day/month/year
        SimpleDate myDate = new SimpleDate(29, 12, 2024);
        System.out.println(myDate);

        myDate.advance();
        System.out.println(myDate);

        myDate.advance(30);
        System.out.println(myDate);


        // TEST 2 - Returning a new date object
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
    
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
    
            week = week + 1;
        }
    
    
        System.out.println("The date after 790 days from the examined Friday is " + date.afterNumberOfDays(790));
    }
}
