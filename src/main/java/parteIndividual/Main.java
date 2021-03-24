package parteIndividual;

public class Main {

    public static void main(String[] args) {

        Persona[] arrayPersonas = new Persona[3];

        arrayPersonas[0] = new Persona("Maria", 789);
        arrayPersonas[1] = new Persona("Agustina", 456);
        arrayPersonas[2] = new Persona("Luisa", 123);

        SortUtil.ordenar(arrayPersonas);
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println(arrayPersonas[i].toString());
        }

        Celular[] arrayCelulares = new Celular[3];
        arrayCelulares[0] = new Celular("Maria", 123);
        arrayCelulares[1] = new Celular("Agustina", 456);
        arrayCelulares[2] = new Celular("Luisa", 789);

        SortUtil.ordenar(arrayCelulares);
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println(arrayCelulares[i].toString());
        }
    }
}
