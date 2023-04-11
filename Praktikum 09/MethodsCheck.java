import java.lang.reflect.Method;

public class Metot {
    public static void main(String[] args) {
        printMethods("java.util.Map");
    }

    public static void printMethods(String className) {
        try {
            Class c = Class.forName(className);
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}