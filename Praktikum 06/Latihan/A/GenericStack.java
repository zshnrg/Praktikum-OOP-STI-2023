import java.util.Arrays;

public class GenericStack<T> {

    private T[] elements;
    private int top = 0;

    // zero indexing
    public GenericStack() {
        elements = (T[]) new Object[5];
    }

    public GenericStack(int s) {
        int sz = s > 0 ? s : 5;
        elements = (T[]) new Object[sz]; // create elements
    }

    public void push(T value) {
        if (top >= elements.length - 1) {
            grow();
        }
        elements[top] = value;
        top++;
        // cek jika top index lebih dari atau sama dengan elements length - 1, maka panggil fungsi grow
        // assign elements dengan index top dengan nilai pada parameter
    }

    public T pop() {
        if (top <= 0) return null;
        if (top <= elements.length / 2) shrink();

        T temp = elements[--top];
        elements[top] = null;
        return temp;
        // apabila top <= 0 maka kembalikan null, jika tidak assign element teratas dengan null
        // cek apabila indeks top lebih kecil dari ukuran shrink (50% dari ukuran maksimal elements) jika ya, maka panggil fungsi shrink
        // kembalikan nilai elemen yang sebelumnya akan diassign dengan null
        // misal terdapat stack
        // | 3 |
        // | 2 |
        // | 1 |
        // maka setelah di pop akan menjadi
        // | 2 |
        // | 1 |
        // lalu kembalikan nilai 3
    }

    public T peek() {
        if (top <= 0) return null;
        return elements[top - 1];
        // cek apabila top <= 0, jika iya maka kembalikan null
        // kembalikan elements dengan index top - 1
    }

    private void grow() {
        elements = Arrays.copyOf(elements, 2 * elements.length);
        // perbesar ukuran sekarang menjadi 2 kali lipat dari ukuran sebelumnya, anda dapat menggunakan
        // fungsi copyOf dari java.util.Arrays
    }

    private void shrink() {
        elements = Arrays.copyOf(elements, elements.length / 2);
        // perkecil ukuran sekarang menjadi 1/2 kali lipat dari ukuran sebelumnya, anda dapat menggunakan
        // fungsi copyOf dari java.util.Arrays
    }

    public boolean contains(T value){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) return true;
        }
        return false;
        // cek apabila terdapat nilai pada parameter yang sama dengan element" pada stack
        // jika ada, maka return true, jika tidak maka return false
    }

    public int getTop() {
        return top;
        // kembalikan nilai top
    }

    public void remove(int index) {
        if (index != --top) {
            // Shift the elements down one spot
            System.arraycopy(elements, index + 1, elements, index, top - index);
        }
        elements[top] = null;

        int shrinkSize = elements.length >> 1;
        if (top < shrinkSize) shrink();
    }

    public void clear() {
        for (int i = 0; i < top; i++) {
            remove(i);
        }
        top = 0;
        // assign semua elemen pada stack menjadi null dimulai dari top, anda dapat menggunakan fungsi remove
        // lalu pindahkan top ke 0
    }

    public String toString() {
        T[] reverse = (T[]) new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            reverse[i] = elements[elements.length - i - 1];
        }
        StringBuilder str = new StringBuilder(Arrays.toString(reverse));
        str.deleteCharAt(0);
        str.deleteCharAt(str.length() - 1);
        return str.toString();
        // kembalikan sebuah string yang terdiri atas keseluruhan isi elements, dimulai dari yang teratas,
        // jika element tersebut belum diassign, maka tulis dengan null
        // format kembalian adalah "null, null, 1, 1, 1" tanpa kutip
        // misal:
        // inisiasi stack size 5
        // stack.push(1)
        // stack.push(2)
        // stack.push(3)
        // maka string yang dihasilkan adalah "null, null, 3, 2, 1"
    }

    // public static void main(String[] args) {
    //     GenericStack<Integer> stack = new GenericStack<>(0);
    //     stack.push(1);
    //     stack.push(2);
    //     stack.push(3);
    //     System.out.println(stack.toString());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.toString());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.toString());
    //     stack.push(4);
    //     stack.push(5);
    //     stack.push(6);
    //     stack.push(7);
    //     System.out.println(stack.toString());
    //     stack.remove(2);
    //     System.out.println(stack.toString());
    //     stack.push(8);
    //     stack.push(999);
    //     stack.clear();
    //     System.out.println(stack.toString());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.toString());
    // }
}