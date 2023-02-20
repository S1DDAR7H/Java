import java.util.*;

public class collectionstest{
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("GT-R");l1.add("NSX");l1.add("M3");
        Iterator<String> i = l1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        l1.set(1, "Supra");
        System.out.println(l1);
    }
}