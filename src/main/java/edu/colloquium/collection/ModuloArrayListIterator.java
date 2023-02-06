package edu.colloquium.collection;

import edu.colloquium.util.Iterator;


/**
 * Реализуем итератор, который будет перебирать только те элементы коллекции, которые кратны модулю коллекции
 */
public class ModuloArrayListIterator implements Iterator<Integer> {
    private int currentIndex = 0;
    private final ModuloArrayList collection;

    ModuloArrayListIterator(ModuloArrayList instance) {
        collection = instance;
        updateNextIndex();
    }

    private void updateNextIndex() {
        while (currentIndex < collection.size()
                && collection.get(currentIndex) % collection.getModulo() != 0) {
            currentIndex++;
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    @Override
    public Integer getNext() {
        int element = collection.get(currentIndex);
        currentIndex++;
        updateNextIndex();
        return element;
    }
}
