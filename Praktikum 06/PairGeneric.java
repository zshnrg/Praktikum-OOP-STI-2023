
interface Pair<K,V>{
    public K getKey();
    public V getValue();
}
public class PairGeneric<K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public PairGeneric(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
        //Kembalikan nilai key
    }
    public V getValue(){
        return value;
        //Kembalikan nilai value
    }

    public String getTypeKeyandValue(){
        return key + " memiliki tipe " + key.getClass().getSimpleName() + " dan value dari key tersebut memiliki tipe " + value.getClass().getSimpleName() + " dengan nilai berupa " + value;
        //Mencetak tipe data key dan value
        //Contoh "1 memiliki tipe Integer dan value dari key tersebut memiliki tipe String dengan nilai berupa Halo"
        //Format "key memiliki tipe key_type dan value dari key tersebut memiliki tipe value_type dengan nilai berupa value"
    }
}