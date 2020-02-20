package com.hujl.jikeTime.linkedList;

public class singleLinked <T>{

    private class Node{
        private T data;
        private Node next;

        public Node(T data,Node next){
            this.data = data;
            this.next = next;
        }

    }

    private Node head;
    private int size;

    public singleLinked(){
        this.head = null;
        this.size = 0;
    }


}
