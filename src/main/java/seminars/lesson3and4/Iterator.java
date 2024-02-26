package seminars.lesson3and4;

public interface Iterator<S> {


    boolean hasNext();

    Student next();

    default void remove() {
    }
}
