package edu.colloquium.util;

/**
 * Интерфейс, который должен любой конкретный итератор.
 * Позволяет узнать, можно ли итерироваться дальше, а также получить следующий элемент.
 * @param <T> тип элементов коллекции.
 */
public interface Iterator<T> {
    boolean hasNext();
    T getNext();
}
