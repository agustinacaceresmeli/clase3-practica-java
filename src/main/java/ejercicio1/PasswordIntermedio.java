package ejercicio1;

public class PasswordIntermedio extends Password{

    public PasswordIntermedio(String pattern) {
        super("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}");
    }
}
