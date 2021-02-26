package softdev.Lab_session.Lab_3.Stack_Brackettester.util;


public class Stack<T> implements StackIntf<T> {
    private Node<T> first;

    @Override
    public void push(T o) {
        Node<T> oldfirst = first;
        first = new Node<T>();
        first.T = o;
        first.next = oldfirst;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T T = first.T;        // save item to return
            first = first.next;            // delete first node
            return T;    // return the saved T
        }

    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return first.T;
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void clear() {
        first = null;
    }

    private static class Node<T> {
        private T T;
        private Node<T> next;
    }

    // TODO: implement your stack

}
