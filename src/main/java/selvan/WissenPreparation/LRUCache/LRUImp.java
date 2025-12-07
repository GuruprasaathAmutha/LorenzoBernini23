package selvan.WissenPreparation.LRUCache;

public class LRUImp {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.printLRUCache();

        lruCache.put(1,2);
        lruCache.put(2,3);
        lruCache.put(3,4);
        System.out.println(lruCache.get(3));
        lruCache.printLRUCache();
        lruCache.put(6,9);
        lruCache.put(9,6);
        lruCache.put(0,1);
        lruCache.printLRUCache();
    }
}

