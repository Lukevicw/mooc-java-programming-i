
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    
    public int getRooms() {
        return this.rooms;
    }
    
    public int getPrincePerSquare() {
        return this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        int ownSquares = this.squares;
        int comparedSquares = compared.getSquares();                
        if (ownSquares > comparedSquares) {
            return true;
        } return false;
    }
    
    public int priceDifference(Apartment compared) {
        int ownPrice = (this.squares * this.pricePerSquare);
        int comparedPrice = (compared.squares * compared.pricePerSquare);
        int solution = ownPrice - comparedPrice;
        if (solution < 0) {
            return (solution * -1);
        } else {
            return solution;
        }
        
    } public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = (this.squares * this.pricePerSquare);
        int comparedPrice = (compared.squares * compared.pricePerSquare);
        if (ownPrice < comparedPrice) {
            return false;
        } else {
            return true;
        }

    }
}
