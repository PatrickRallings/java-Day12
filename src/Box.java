import java.util.ArrayList;

public class Box implements Packable{
    double maxWeight;
    double totalWeight;
    int numItems;

    ArrayList<Packable> itemsInBox;

    public double weight(){
        return totalWeight;
    }

    @Override
    public String title() {
        return null;
    }

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable item){
        if (item.weight()+totalWeight < maxWeight){
            itemsInBox.add(item);
            totalWeight += item.weight();
            numItems++;
        } else {
            System.out.println(item.title()+" is too heavy.");
        }
    }

    public void remove(Packable item){
        itemsInBox.remove(item);
        totalWeight -= item.weight();
        numItems--;
    }

    @Override
    public String toString() {
        return "Box: " + numItems + " items, total weight " + totalWeight +" kg";
    }
}
