package problems.LinkedList;

import problems.utils.Node;

public class Creation {
    public static void main(String args[]){
        Node head = new Node(1);
        head = insert(head,2);
        head = insert(head ,3);
        head = insert(head,4);
        head = insert(head,5);
        print(head);
    }

    private static Node insert(Node head, int i) {
        Node node = new Node(i);
        if(head==null){
            return node;
        }
        while(head!=null){
            head=head.next;
        }
        head.next=node;
        return head;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.println(head.value);
            head = head.next;
        }

    }
}
