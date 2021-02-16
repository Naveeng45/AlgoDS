package problems.LinkedList;

public class ListDemo {
    public static void main(String args[]){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.printList();
        System.out.println(sll.getCount(sll.head));
        sll.append(4);
        sll.append(5);
        sll.append(6);
        sll.printList();
        System.out.println(sll.getCount(sll.head));
        sll.getCount(sll.head);
        //sll.deleteByValue(3);
        System.out.println(sll.getCount(sll.head));
        sll.printList();
        //sll.deleteByValue(1);
        System.out.println(sll.getCount(sll.head));
        sll.printList();
        //sll.deleteByValue(6);
        System.out.println(sll.getCount(sll.head));
        sll.printList();
        sll.insertAtPosition(7,2);
        sll.printList();
        sll.insertAtPosition(9,4);
        sll.printList();
        System.out.println(sll.getNode(3).data.toString());
        SinglyLinkedList<Integer> sll1 = new SinglyLinkedList<>();
        sll1.append(10);
        sll1.append(11);
        sll1.append(12);
        sll1.printList();
        //sll1.getNode(3).nextNode = sll.getNode(3);
        sll1.printList();
        //System.out.println(sll.getIntersectionNode(sll.getNode(1),sll1.getNode(1)).data.toString());
        sll.printList();
        //sll1.getNode(6).nextNode = sll1.getNode(3);

        if(sll.isCycleList(sll.getNode(1))){
            System.out.println("Give list is cyclelist");
        }else{
            System.out.println("No CycleList");
        }
        System.out.println(sll.reverseList(sll.getNode(1)).data.toString());
        SinglyLinkedList<Integer> sll2 = new SinglyLinkedList<>();
        sll2.append(1);
        sll2.append(2);
        sll2.append(3);
        sll2.append(2);
        sll2.append(1);
        sll2.printList();
        System.out.println(sll2.isPalindrom(sll2.getNode(1)));
        sll2.removeElements(sll2.getNode(1),2);
        sll2.printList();
    }
}
