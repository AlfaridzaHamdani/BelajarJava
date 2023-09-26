import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args) {
    HashMap<String, String> food = new HashMap<String, String>();
    
    food.put("Mie", "Indomie");

    System.out.println(food.get("Mie"));
    }
}
