public class HashTable {
    
    private Entry head; // Inicio de la lista

    public HashTable() {
        this.head = null;
    }

    
    public void add(String username, long pos) {
        Entry newEntry = new Entry(username, pos);
        
        if (head == null) {
           
            head = newEntry;
        } else {
            
            Entry current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }

   
    public void remove(String username) {
        if (head == null) return;

        
        if (head.username.equals(username)) {
            head = head.next;
            return;
        }

        
        Entry current = head;
        while (current.next != null) {
            if (current.next.username.equals(username)) {
                
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

   
    public long search(String username) {
        Entry current = head;
        while (current != null) {
            if (current.username.equals(username)) {
                return current.position;
            }
            current = current.next;
        }
        return -1;
    }
}