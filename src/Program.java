import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap){
        System.out.println(hashmap.keySet());
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String s){
        for (String partial : hashmap.keySet()){
            if(partial.contains(s)){
                System.out.println(partial);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String s){
        for (String partial : hashmap.keySet()){
            if(partial.contains(s)){
                System.out.println(hashmap.get(partial));
            }
        }
    }
    public static void printValues(HashMap<String,Book> hashmap){
        System.out.println(hashmap.values());
    }
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String partialName){
        for (Book book : hashmap.values()){
            if(book.getName().contains(partialName)){
                System.out.println(book);
            }
        }
    }
}
