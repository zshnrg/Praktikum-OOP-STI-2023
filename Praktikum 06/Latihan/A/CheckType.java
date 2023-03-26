public class CheckType<T>{
    private T t;
    private String type;

    public CheckType(T t){
        this.t = t;
        type = t.getClass().getSimpleName();
        //Konstruktor
    }
    public T getT(){
        return t;
        //Kembalikan nilai t
    }
    public String getType(){
        return type;
        //Kembalikan tipe data T
    }
    public String printTypeandValue() {
        return type + ": " + t;
        //Kembalikan nilai "Tipe: Nilai"
        //Contoh "String: Halo"
    }
}