
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(FlowerColour.GREEN, 12, true, 12.5, FlowerType.MAK);
        Flower romashka = new Flower(FlowerColour.BLACK, 12, true, 12.5, FlowerType.ROMASHKA);

        Flower findFlower = new Flower(FlowerColour.BLACK, 12, true, 10, FlowerType.ROMASHKA);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);

        System.out.println(bucket.searchFlower(findFlower));

    }
}
