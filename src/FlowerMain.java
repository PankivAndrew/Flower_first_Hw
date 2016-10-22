import com.sun.org.apache.xpath.internal.SourceTree;

public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(FlowerColour.GREEN, 12, true, 12.5, FlowerType.MAK);
        Flower romashka = new Flower(FlowerColour.BLACK, 12, true, 12.5, FlowerType.ROMASHKA);

        FlowerSpec findFlower = new FlowerSpec(FlowerColour.BLACK, 12, FlowerType.ROMASHKA);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);

        System.out.println(bucket.getFlower(findFlower));
        System.out.println(bucket.searchFlower(findFlower));

    }
}
