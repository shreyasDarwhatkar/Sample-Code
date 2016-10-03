package hashMapCustom;

class Entry {
    Integer key;
    Integer value;
    Entry next;
     
    public Entry(Integer key, Integer value, Entry next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}