package hashMapCustom;

public class HashMapCustom {
	private Entry[] table;
    private int capacity= 10;

    public HashMapCustom(){
        table = new Entry[capacity];
     }
    
    public void put(Integer newKey, Integer data){
        if(newKey==null)
            return;    //does not allow to store null.
       
        //calculate hash of key.
        int hash=hash(newKey);
        //create new entry.
        Entry newEntry = new Entry(newKey, data, null);
       
        //if table location does not contain any entry, store entry there.
         if(table[hash] == null){
          table[hash] = newEntry;
         }else{
            Entry previous = null;
            Entry current = table[hash];
            
            while(current != null){ //we have reached last entry of bucket.
            if(current.key.equals(newKey)){           
                if(previous==null){  //node has to be insert on first of bucket.
                      newEntry.next=current.next;
                      table[hash]=newEntry;
                      return;
                }
                else{
                    newEntry.next=current.next;
                    previous.next=newEntry;
                    return;
                }
            }
            previous=current;
              current = current.next;
          }
          previous.next = newEntry;
         }
     }
    
    public Integer get(Integer key){
        int hash = hash(key);
        if(table[hash] == null){
         return null;
        }else{
         Entry temp = table[hash];
         while(temp!= null){
             if(temp.key.equals(key))
                 return temp.value;
             temp = temp.next; //return value corresponding to key.
         }         
         return null;   //returns null if key is not found.
        }
    }
    
    public void display(){
        
        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                   Entry entry=table[i];
                   while(entry!=null){
                         System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                         entry=entry.next;
                   }
            }
        }             
     
     }
    
 
    private int hash(Integer key){
        return Math.abs(key.hashCode()) % capacity;
    }
}
