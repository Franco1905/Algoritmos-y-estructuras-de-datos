package tp3.ejercicio1.copy;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    private List<T> data;

    public Queue() {
        this.data = new LinkedList<T>();
    }

    public void enqueue(T dato) {
        data.add(dato);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return data.remove(0);
    }

    public T head() {
        if (isEmpty()) {
            return null;
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.size(); i++) {
            sb.append(data.get(i));
            if (i < data.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}