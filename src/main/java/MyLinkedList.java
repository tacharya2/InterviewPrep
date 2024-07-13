import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList {
    private Node head;

    // Node class representing each element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Insertion at the end of the linked list
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.next!= null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    // Deletion of a specific element in the linked list
    public void delete(int data){
        if(head == null){
            return; // The list is empty, nothing to delete
        }
        if(head.data == data){
            head = head.next; // Remove the head element
            return;
          }
        Node current = head;
        while(current.next!=null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
           }
        }

        //Searching for a specific element in the linkedList

    public boolean search(int data){
        Node current = head;
        while(current!=null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Printing the linkedList
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(10);
        myLinkedList.insert(11);
        myLinkedList.insert(12);
        myLinkedList.insert(13);
        myLinkedList.insert(14);
        myLinkedList.insert(16);

        myLinkedList.display();

        myLinkedList.insert(15);
        myLinkedList.display();

        myLinkedList.delete(10);
        myLinkedList.display();

    }
}