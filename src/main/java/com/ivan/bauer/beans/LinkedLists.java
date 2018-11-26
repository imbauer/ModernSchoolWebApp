package com.ivan.bauer.beans;

import com.ivan.bauer.server.main.SpringBootRest2Application;
import org.springframework.boot.SpringApplication;

//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?
//Has complexity O(N^2)
//    public static Boolean firstLinkedListFunction(String str) {
//        if(str.equals("hello")) {
//            return true;
//        }
//        return false;
//    }

public class LinkedLists {

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }



    }

    public int getNode(int data) {
        if (head == null) return 0;
        if (head.data == data) return data;
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                return data;
            }
            current = current.next;
        }
        return -1;
    }

    public LinkedLists runnerTechnique() {
        if (head == null) {
            LinkedLists linked = new LinkedLists();
            return linked;
        }
        Node p1 = head;
        Node p2 = head.next;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p2 = head;
        p1 = p1.next;
        LinkedLists linked = new LinkedLists();
        while (true) {
            if (p1 == null) {
                break;
            }
            linked.append(p2.data);
            linked.append(p1.data);
            p2 = p2.next;
            p1 = p1.next;
        }
        return linked;
    }

    public void displayLinkedList() {
        if (head == null) return;
        Node current = head;
        System.out.print("[" + current.data + "]");
        while (current.next != null) {
            System.out.print("--->[" + current.next.data + "]");
            current = current.next;
        }
        System.out.println();
    }

    public void removeDups() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner != null) {
                if (runner.next == null) {
                    break;
                }
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public int kthToLast(int k) {
        Node current = head;
        Node checker = current;

        for (int i = 0; i < k; i++) {
            if (checker == null) return -1;
            checker = checker.next;
        }
        while (checker != null) {
            checker = checker.next;
            current = current.next;
        }
        return current.data;
    }

    public int isPalindrome() {
        Node start = head;
        Node end = head;
        int count = 0;
        while (end != null) {
            count++;
            end = end.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.append(2);ll.append(2);ll.append(3);ll.append(4);
        ll.append(2);ll.append(1);ll.append(4);ll.append(8);ll.append(8);
        ll.displayLinkedList();
//        System.out.println(ll.kthToLast(9));
        System.out.println(ll.isPalindrome());
//        ll.removeDups();
//        ll.displayLinkedList();
//        LinkedLists list = ll.runnerTechnique();
//        list.displayLinkedList();
    }

}

class Node {
    int data; // data element
    Node next; // pointer element

    public Node(int data) {
        this.data = data;
    }

}
