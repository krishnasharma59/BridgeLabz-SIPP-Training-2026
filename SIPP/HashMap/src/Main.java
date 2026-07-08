import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("Krishna","Sharma");
        map.put("suggi","kaushtubhi");
        map.put("vandana","baliyan");
        System.out.println(map);
        System.out.println(map.get("suggi"));
        System.out.println(map.containsKey("vandana"));
        System.out.println(map.containsValue("baliyan"));
        System.out.println(map.getOrDefault("vandana","omar"));
    }
}
