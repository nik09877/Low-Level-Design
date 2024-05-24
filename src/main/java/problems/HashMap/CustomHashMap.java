package problems.HashMap;

public class CustomHashMap<K,V> {
    private static final int INITIAL_SIZE = 1 << 4; //16

    // range is -2^31 to 2^31 -1, and size is in power of 2
    // so max capacity is 2^30
    // power of 2 size because while calculating hash value
    // we need to do modular operation which is expensive becuz it uses division
    // if we use table size as power of 2 then a % m = a & (m - 1), which is faster
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    private Entry[] hashTable;
    public CustomHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }
    public CustomHashMap(int capacity){
        int size = tableSizeFor(capacity);
        hashTable = new Entry[size];
    }

    private static int tableSizeFor(int capacity){
        // Find the nearest power of 2 greater than equal to capacity
        capacity -= 1;
        capacity |= capacity>>>1;
        capacity |= capacity>>>2;
        capacity |= capacity>>>4;
        capacity |= capacity>>>8;
        capacity |= capacity>>>16;
        return (capacity < 0) ? 1 : (capacity >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : capacity + 1;
    }
    class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        Entry(K k,V v){
            key = k;
            value = v;
            next = null;
        }
    }

    public void put(K key,V value){
        // hashCode = (h = key.hashCode()) ^ (h >>> 16); used originally
        // to spread out the bits and to reduce collision
        int hashCode = key.hashCode() % hashTable.length;
        Entry newNode = new Entry(key,value);

        if(hashTable[hashCode] == null){
            hashTable[hashCode] = newNode;
        }
        else{
            Entry curNode = hashTable[hashCode];
            while(curNode.next!=null){
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    public V get(K key){
        int hashCode = key.hashCode() % hashTable.length;
        Entry curNode = hashTable[hashCode];
        while(curNode!=null){
            if(curNode.key.equals(key)){
                return (V)curNode.value;
            }
            curNode = curNode.next;
        }
        return null;
    }
}
