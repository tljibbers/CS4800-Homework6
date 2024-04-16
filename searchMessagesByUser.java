import java.util.ArrayList;
import java.util.Iterator;

public class searchMessagesByUser implements Iterator{

    private int count = 0;
    private int size;
    private ArrayList<String> messages;

   public boolean hasNext()
   {
        if(messages != null)
        {
            return true;
        }
        return false;

   }

   public String next() 
   {
        if(hasNext()) {
            return messages.get(count++);
        }
        return null;
   }

   public void remove() {
    Iterator.super.remove();
   }
    
}
