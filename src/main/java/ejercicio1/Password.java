package ejercicio1;

public class Password {

    private String regex;

    public Password(String pattern) {
        this.regex = pattern;
    }

    public String getPassword() {
        return regex;
    }

    public void setValue(String pwd) throws Exception{
        if(pwd.matches((regex))){
            this.regex = pwd;
        }
        else throw new Exception("La contraseña ingresada no es valida");
    }

    @Override
    public String toString() {
        return "Contraseña: " + regex;
    }
}
