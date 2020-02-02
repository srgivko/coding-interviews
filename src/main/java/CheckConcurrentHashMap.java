import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CheckConcurrentHashMap {

    private static ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>(3);

    public static void main(String[] args) {
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 3);
        Thread thread = new Thread(() -> {
            System.out.println("Before");
            System.out.println(hashMap);
            System.out.println("Iterate");
            Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> next = iterator.next();
                System.out.println(next.getKey() + "-" + next.getValue());
                if(next.getValue()==3){
                    hashMap.put("3", 333);
                }
                if(next.getValue()==1){
                    hashMap.put("5", 5);
                }
                if(next.getValue()==5){
                    hashMap.put("4", 4);
                }
            }
            System.out.println("After");
            System.out.println(hashMap);
        });
        thread.run();
    }

}
