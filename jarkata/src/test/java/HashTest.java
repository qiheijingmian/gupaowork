import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

public class HashTest {

    @Test
    public void concurrentHashMapTest() {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        hashMap.put("key", "value");

        int i = -200;
        System.out.println(i >>> 1);
    }
}