import java.util.HashMap;
import java.util.Map;

public class PageReplacementLRU {
    private final Integer maxPages;
    // Pair<processID, page>
    private Map<Pair<Integer, Integer>, Node> pages;
    private Node head;
    private Node tail;

    private class Node {
        Pair<Integer, Integer> pageID;
        Integer physicalAddr;
        Node prev;
        Node next;

        public Node(Pair<Integer, Integer> pageID, int physicalAddr) {
            // Please provide your solution in the space below
            this.pageID = pageID;
            this.physicalAddr = physicalAddr;
            prev = null;
            next = null;
        }
    }

    private void addNode(Node node) {
        // Please provide your solution in the space below
        // Tambahkan node di depan head
        if (head == null) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    private void removeNode(Node node) {
        // Please provide your solution in the space below
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        node.next = null;
        node.prev = null;
    }

    private void moveToHead(Node node) {
        // Please provide your solution in the space below
        removeNode(node);
        addNode(node);
    }

    public PageReplacementLRU(Integer maxPages) {
        // Please provide your solution in the space below
        this.maxPages = maxPages;
        pages  = new HashMap<Pair<Integer, Integer>, Node>();
        head = null;
        tail = null;
    }

    public int accessPage(Pair<Integer, Integer> pageID) {
        // Please provide your solution in the space below
        // print "page fault!" ketika pageID tidak ditemukan dalam LRU
        // lalu kembalikan -1
        if (pages.containsKey(pageID)) {
            Node node = pages.get(pageID);
            moveToHead(node);
            return node.physicalAddr;
        } else {
            System.out.println("page fault!");
            return -1;
        }

    }

    public void addPage(Pair<Integer, Integer> pageID, int physicalAddr) {
        // Please provide your solution in the space below
        Node node = new Node(pageID, physicalAddr);
        if (pages.size() == maxPages) {
            pages.remove(tail.pageID);
            removeNode(tail);
        }
        addNode(node);
        pages.put(pageID, node);
    }
}
