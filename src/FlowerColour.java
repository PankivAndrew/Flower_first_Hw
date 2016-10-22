/**
 * Created by Pankiv on 17.10.2016.
 */
public enum FlowerColour {
    GREEN, RED, BLUE, BLACK;
    public String toString(){
        switch (this){
            case GREEN:
                return "Green";
            case RED:
                return "Red";
            case BLUE:
                return "Blue";
            case BLACK:
                return "Black";
            default:
                return "no colour";
        }
    }
}
