package edu.colloquium;

import edu.colloquium.collection.ModuloArrayList;
import edu.colloquium.collection.ModuloArrayListIterator;
import edu.colloquium.util.Iterator;

import java.util.List;

/**
 * Программа для коллока.
 * ФИ: Нечесов Андрей БПИ217
 */
public class Main {
    public static void main(String[] args) {
        // На реализацию выпал паттерн "Итератор".
        // Он позволяет обходить коллекцию, не вдаваясь подробности реализации этой коллекции.

        // Вводим чиселки
        ModuloArrayList moduloArrayList = new ModuloArrayList(3);
        for (int i = 1; i <= 12; ++i) {
            moduloArrayList.add(i);
        }

        // Обходим коллекцию с помощью итератора
        // Печатаются только те цифры, которые делятся на переданный в конструктор объекта mod
        var iterator = moduloArrayList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
