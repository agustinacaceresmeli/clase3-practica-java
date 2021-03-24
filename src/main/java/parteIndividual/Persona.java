package parteIndividual;

public class Persona implements Precedable<Persona>{
    String nombre;
    int dni;

    public Persona(){}

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona t) {
        if (this.dni == t.getDni()) {
            return 0;
        }
        if (this.dni < t.getDni()) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Nombre persona: " + nombre + " DNI persona: " + dni;
    }


}
