package seminars.lesson3;

public interface Iterator<S> {


    boolean hasNext();

    Student next();

    default void remove() {
    }
}
