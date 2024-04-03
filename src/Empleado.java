public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String departamento;
    protected double salario;

    protected Empleado(){

    }
    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salario: "+salario);
    }

    public abstract double calcularBono(String desenpenio);

}
