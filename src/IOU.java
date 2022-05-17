import java.util.HashMap;

public class IOU {
    public HashMap<String, Double> hashmap = new HashMap<>();
    public IOU(){};

    public void setSum(String toWhom, double amount){
        hashmap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        if (hashmap.containsKey(toWhom)){
        return hashmap.get(toWhom);
        } else {
            return 0;
        }
    }

}