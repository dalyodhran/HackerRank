import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
        List<LinkList> myList = new ArrayList<LinkList>();
        LinkList temp = null;
        for (int i = 0; i < p.length; i++) {
            if (i > 0 && p[i] <= p[i - 1]) {
                temp.append(p[i]);
            } else {
                LinkList t = new LinkList();
                t.append(p[i]);

                myList.add(t);
                temp = t;
            }
        }

        int days = 0;
        while (myList.size() > 1) {
            for (int i = 1; i < myList.size(); i++) {
                myList.get(i).removeFirst();
            }

            List<LinkList> list = new ArrayList<LinkList>();
            for (LinkList part : myList) {
                if (part.head == null) {
                    continue;
                }

                if (!list.isEmpty() && list.get(list.size() - 1).tail.value >= part.head.value) {
                    list.get(list.size() - 1).append(part);
                } else {
                    list.add(part);
                }
            }
            myList = list;

            days++;
        }
        return days;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants(p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class LinkList {
    Node head;
    Node tail;

    void append(int value) {
        Node node = new Node(value);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    void append(LinkList list) {
        tail.next = list.head;
        tail = list.tail;
    }

    void removeFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }
}
