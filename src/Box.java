import java.util.ArrayList;

public class Box implements Packable{
    double maxWeight;
    double totalWeight;
    int numItems;

    ArrayList<Packable> itemsInBox;

    public double weight(){
        for (int i = 0; i < itemsInBox.size(); i++){
            totalWeight += itemsInBox.get(i).weight();
        }
        return totalWeight;
    }

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable item){
        itemsInBox.add(item);
        totalWeight += item.weight();
        numItems++;
    }

    public void remove(Packable item){
        itemsInBox.remove(item);
        totalWeight += item.weight();
        numItems++;
    }

    @Override
    public String toString() {
        return "Box: " + numItems + " items, total weight " + totalWeight +" kg";
    }
}
