public class Calculator {
    public Calculator() {
    };

    public double calculate(double a, double b, String operation) throws InvalidOperationException, InvalidDivisionByZero {
        if (operation.equals("+")) {
            return a + b;
        } else if (operation.equals("-")) {
            return a - b;
        } else if (operation.equals("*")) {
            return a * b;
        } else if (operation.equals("/")) {
            if (b == 0) {
                throw new InvalidDivisionByZero();
            } else {
                return a / b;
            }
        } else {
            throw new InvalidOperationException(operation);
        }
        /**
         * Implementasi
         * Apabila operasi yang diinput pengguna bukan `+`, `-`, `*`, atau `/`, maka
         * kalkulator akan mengembalikan pesan error dari kelas
         * `InvalidOperationException.java`
         * 
         * Apabila kalkulator menerima input pembagian terhadap 0, maka kalkulator juag
         * akan mengembalikan pesan error dari kelas `InvalidDivisionByZero.java`
         */ 
    }
}

class InvalidOperationException extends Exception {
    private String operation;

    public InvalidOperationException(String operation) {
        super();
        this.operation = operation;
        // Implementasi InvalidOperationException
    }

    public String getMessage() {
        return "Invalid operation: " + operation;
        // Implementasi custom message InvalidOperationException
        // Format: "Invalid operation: " + operation
    }
}

class InvalidDivisionByZero extends Exception {
    public InvalidDivisionByZero() {
        super("Tidak dapat melakukan pembagian terhadap 0");
        // Implementasi InvalidDivisionByZero
    }
}