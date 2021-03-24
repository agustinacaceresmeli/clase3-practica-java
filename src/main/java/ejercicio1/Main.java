package ejercicio1;

public class Main {

    public static void main(String[] args) throws Exception {

        Password newPasswordSimple = new PasswordSimple();
        newPasswordSimple.setValue("probando");
        System.out.println(newPasswordSimple);

        Password newPasswordIntermedio = new PasswordSimple();
        newPasswordIntermedio.setValue("Probando123");
        System.out.println(newPasswordIntermedio);

        Password newPasswordFuerte = new PasswordSimple();
        newPasswordFuerte.setValue("Probando123!");
        System.out.println(newPasswordFuerte);
    }
}
