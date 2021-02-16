package problems.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
        Node(T data){
            this.data = data;
            nextNode = null;
        }
    }
    Node head ;

    public void push(T data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        new_node.nextNode = head;
        head = new_node;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data.toString() + "->");
            temp = temp.nextNode;
        }
        System.out.print("null");
        System.out.println();

    }

    public void append(T data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node temp = head;
        while(temp != null) {
            if (temp.nextNode == null) {
                temp.nextNode = new_node;
                return;
            }
            temp = temp.nextNode;
        }
    }

    public void deleteByValue(T data){
        Node currentNode = head;
        if(head.data == data){
            currentNode = head.nextNode;
            head.nextNode = null;
            head = currentNode;
            return;
        }
        while(currentNode.nextNode != null){
            if(currentNode.nextNode.data == data){
                currentNode.nextNode = currentNode.nextNode.nextNode;
                return;
            }
            currentNode = currentNode.nextNode;
        }
    }

    public int getCount(Node head){
        if(head == null){
            return 0;
        }
        Node currentNode = head;
        int count = 0;
        while(currentNode!=null){
            currentNode = currentNode.nextNode;
            count++;
        }
        return count;
    }

    public void insertAtPosition(T data,int position){
        Node new_node = new Node(data);
        int currentPosition = 1;
        if(head == null){
            head = new_node;
            return;
        }
        Node currentNode = head;
        Node prev = null;
        while(currentNode != null){
            if(currentPosition == position){
                new_node.nextNode = currentNode;
                prev.nextNode = new_node;
                return;
            }
            prev = currentNode;
            currentNode = currentNode.nextNode;
            currentPosition++;
        }
    }

    public Node getNode(int position){
        Node currentNode = head;
        if(position == 1){
            return currentNode;
        }
        int currentPosition = 1;
        while(currentNode != null){
            if(currentPosition == position){
                return currentNode;
            }
            currentNode = currentNode.nextNode;
            currentPosition++;
        }
        return currentNode;
    }

    public Node getIntersectionNode(Node head1 , Node head2){
        Node firstListNode = head1;
        Node secondListNode = head2;
        while(firstListNode!=secondListNode){
            if(firstListNode.nextNode == null){
                firstListNode = head2;
            }else{
                firstListNode = firstListNode.nextNode;
            }

            if(secondListNode.nextNode == null){
                secondListNode = head1;
            }else{
                secondListNode = secondListNode.nextNode;
            }
        }
        return firstListNode;
    }

    public boolean isCycleList(Node node){
        if(node.nextNode == null){
            return false;
        }
        Node slowPtr = node;
        Node fastPtr = node;
        while(fastPtr != null && fastPtr.nextNode!=null){

            slowPtr = slowPtr.nextNode;
            fastPtr = fastPtr.nextNode.nextNode;
            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }

    public  Node reverseList(Node head){
        Node previous = null;
        Node nextNode = null;
        Node currentNode = head;
        while(currentNode!=null){
            nextNode = currentNode.nextNode;
            currentNode.nextNode = previous;
            previous = currentNode;
            currentNode = nextNode;
        }
        return previous;
    }

    public boolean isPalindrom(Node head){
        if(head.nextNode == null){
            return true;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.nextNode != null){
            slowPtr = slowPtr.nextNode;
            fastPtr = fastPtr.nextNode.nextNode;
        }
        slowPtr = reverseList(slowPtr);
        fastPtr = head;
        while (slowPtr!=null){
            if(slowPtr.data!=fastPtr.data){
                return false;
            }
            slowPtr = slowPtr.nextNode;
            fastPtr = fastPtr.nextNode;
        }
        return true;
    }

    public Node removeElements(Node head,T data){
        T data1 = null;
        Node helperNode = new Node(data1);
        helperNode.nextNode = head;
        Node p = helperNode;
        while(p.nextNode != null){
            if(p.nextNode.data == data){
                Node next = p.nextNode;
                p.nextNode = next.nextNode;
            }else{
                p = p.nextNode;
            }
        }
        return helperNode.nextNode;

    }
}
