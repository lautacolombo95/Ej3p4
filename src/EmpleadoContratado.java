public class Empleado {

    //Attributes
    private String nombre;
    private int    nroLegajo;
    private double sueldoBase;

    //Constructor
    public Empleado(String nombre, int nroLegajo, double sueldoBase){
        this.nombre = nombre;
        this. nroLegajo = nroLegajo;
        this.sueldoBase = sueldoBase;
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    //Methods
    public double getSueldoSemana(){
        
    }
}
