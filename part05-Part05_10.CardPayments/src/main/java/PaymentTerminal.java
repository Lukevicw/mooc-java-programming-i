
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3;


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
        
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= AFFORDABLE_PRICE) {
            affordableMeals++;
            return card.takeMoney(AFFORDABLE_PRICE);
        }
        
        
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= HEARTY_PRICE) {
            heartyMeals++;
            return card.takeMoney(HEARTY_PRICE);
        }
        
        return false;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment < AFFORDABLE_PRICE){
            System.out.println("No sale");
            return payment;
        } 
        affordableMeals++;
        this.money += AFFORDABLE_PRICE;
        return payment - AFFORDABLE_PRICE;
    }

    public double eatHeartily(double payment) {
        
        if (payment < HEARTY_PRICE) {
            System.out.println("No sale");
            return payment;
        }
        
        heartyMeals ++;
        this.money += HEARTY_PRICE;
        return payment - HEARTY_PRICE;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
       
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
