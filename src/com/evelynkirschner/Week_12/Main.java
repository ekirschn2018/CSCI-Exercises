package com.evelynkirschner.Week_12;

class QueueFullException extends Exception {}

class QueueEmptyException extends Exception {}


class Queue<E> {
    private E[] elements;
    private int index = 0;
    private int size;

    Queue(int size) {
        elements = (E[]) new Object[size];
        this.size = size;
    }

    void enqueue(E element ) throws QueueFullException {
        if (index >= size) {
            throw new QueueFullException();
        }

        elements[index] = element;
        index++;
    }

    E dequeue () throws QueueEmptyException {
        if (index == 0) {
            throw new QueueEmptyException();
        }

        E returnElement = elements[0];
        for (int i = 0; i < (index - 1); i++)
            elements[i] = elements[i+1];
        index--;
        return returnElement;
    }
}


public class Main {
    public static void main(String[] agrs) {
        Queue<String> strings = new Queue<>(3);
        try {
            strings.enqueue("First");
            strings.enqueue("Next");
            strings.enqueue("Last");
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
        } catch (QueueFullException | QueueEmptyException e) {
            e.printStackTrace();
        }

    }
}
