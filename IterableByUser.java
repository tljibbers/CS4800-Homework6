import java.util.Iterator;

public interface IterableByUser {
    Iterator<message> iterator(user userToSearchWith);
}
