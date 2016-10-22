/**
 * Created by Pankiv on 17.10.2016.
 */
public enum FlowerType {
    ROMASHKA, MAK, ROZA, TULPAN;
    public String toString(){
        switch (this){
            case ROMASHKA:
                return "Romashka";
            case MAK:
                return "Mak";
            case ROZA:
                return "Roza";
            case TULPAN:
                return "Tulpan";
            default:
                return "no type";
        }
    }
}
