package edu.colloquium.collection;
import edu.colloquium.util.Iterable;
import edu.colloquium.util.Iterator;

import java.util.ArrayList;

/**
 * Динамический массив для работы с целыми числами, который реализует интерфейс Iterable
 * и позволяет обходить массив целых чисел, которые нацело делятся на значения modulo.
 * Интерфейс Collection<T> не реализую специально, чтобы применить собственный итератор, а не Java.
 */
public class ModuloArrayList implements Iterable<Integer> {
    private final int modulo;
    private final ArrayList<Integer> container;

    public ModuloArrayList(int modulo) {
        this.modulo = modulo;
        container = new ArrayList<>();
    }

    public Iterator<Integer> createIterator() {
        return new ModuloArrayListIterator(this);
    }

    public int getModulo() {
        return modulo;
    }

    public int get(int index) {
        return container.get(index);
    }
    public int size() {
        return container.size();
    }

    public boolean isEmpty() {
        return container.isEmpty();
    }

    public boolean contains(int number) {
        return container.contains(number);
    }

    public void add(Integer number) {
        container.add(number);
    }

    public boolean remove(Integer number) {
        return container.remove(number);
    }

    public void clear() {
        container.clear();
    }
}
