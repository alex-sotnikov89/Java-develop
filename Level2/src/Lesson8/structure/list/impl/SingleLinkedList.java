package Lesson8.structure.list.impl;

import Lesson8.structure.list.GBIterator;
import Lesson8.structure.list.GBList;

public class SingleLinkedList implements GBList {
    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public void add(String val) {
        if (first == null) {
            first = new Node(val);
            last = first;
        } else {
            add(first, val);
        }
        size++;
    }

    private void add(Node current, String val) {
        if (current.next == null) {
            current.next = new Node(current, val);
            last=current.next;
            return;
        }
        add(current.next, val);
    }

    @Override
    public boolean remove(String val) {
        if (first.val.equals(val)) {
            first = first.next;
            size--;
            return true;
        }

        Node prev = first;
        Node current = first.next;
        while (current != null) {
            if (current.val.equals(val)) {
                prev.setNext(current.next);
                current.next.setPrev(prev);
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }

        return false;
    }

    @Override
    public String get(int n) {
        Node current = first;
        if (n==0){
            return first.val;
        }
        for (int i = 0; i <n; i++) {
            current = current.next;
            if (current == null){
                return "There is no element under this index!";
            }
        }
        return current.val;
    }


    @Override
    public int size() {
//        int i = 0;
//        GBIterator iterator = iterator();
//        while (iterator.hasNext()) {
//            i++;
//        }
//        return i;
        return size;
    }

    @Override
    public GBIterator iterator() {
        return new StraightForwardIterator(first);
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "last=" + last +
                '}';
    }

    private static class Node {
        private String val;
        private Node next;
        private Node prev;

        public Node(String val) {
            this(null, val, null);
        }

        public Node(Node prev, String val) {
            this(prev, val, null);
        }

        public Node(Node prev, String val, Node next) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val='" + val + '\'' +
                    ", prev=" + prev +
                    '}';
        }
    }

    public static class StraightForwardIterator implements GBIterator {
        private Node current;

        public StraightForwardIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public boolean hasPrev() {
            return current.prev != null;
        }

        @Override
        public String next() {
            String val = current.val;
            current = current.next;
            return val;
        }

        @Override
        public String prev() {
            String val = current.val;
            current = current.prev;
            return val;
        }
    }
}
