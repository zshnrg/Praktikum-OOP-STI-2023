/**
 * LinkedList.java
 * Kelas DoubleinkedList yang merupakan struktur data linked list yang elemennya dapat menyimpan data dalam jenis tipe data apapun
 * @author 18221121 Rozan Ghosani
 */

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat Double linked list dengan size = 0 dan head = tail = null
     */
    public DoubleLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        Node<T> p = head;
        int it = 0;
        if (position < 0 || position >= size) return null;
        while (it != position && p != null) {
            p = p.getNext();
            it++;
        }
        return p;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        Node<T> p = new Node(item);
        if (size == 0) {
            head = p;
        } else {
            p.setPrev(tail);
            tail.setNext(p);
        }
        tail = p;
        size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        Node<T> p = getNode(position);
        if (p != null) return p.getValue();
        else return null;
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node<T> p = getNode(position);
        if (p != null) p.setValue(item);
        
    }

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
        Node<T> p = getNode(position);
        if (p != null) {
            if (p.getPrev() == null) {
                head = p.getNext();
            } else {
                Node<T> prev = p.getPrev();
                prev.setNext(p.getNext());
            }
            if (p.getNext() == null) {
                tail = p.getPrev();
            } else {
                Node<T> next = p.getNext();
                next.setPrev(p.getPrev());
            }
            size--;
        }
    }

    /**
     * Hapus semua elemen dari Double Linked List
     */
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * Getter size
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Menampilkan keseluruhan isi Double Linked List
     * Format yang dikeluarkan adalah sebagai berikut, misal isi list adalah [1,2,3,4]
     * Maka output yang dihasilkan adalah (dengan enter) :
     * 1 2 3 4
     */
    public void display() {
        Node<T> p = head;
        while (p != null) {
            System.out.print(p.getValue() + " ");
            p = p.getNext();
        }
        System.out.println();
    }

    /**
     * Find element position
     * jika terdapat lebih dari 1 elemen dengan nilai yang sama, maka ambil posisi
     * yang ditemukan pertama kali dari head
     * @return posisi dari sebuah item mulai dari head dengan zero indexing
     */
    public Integer find(T item) {
        int it = 0;
        Node<T> p = head;
        while (p != null) {
            if (p.getValue() == item) return it;
            it++;
            p = p.getNext();
        }
        return -1;
    }
}
