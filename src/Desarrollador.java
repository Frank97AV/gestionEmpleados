import interfaces.EvaluacionDesenpeno;

import java.util.ArrayList;
import java.util.List;

public class Desarrollador extends Empleado implements EvaluacionDesenpeno {

    //lenguajes tiene que ser lista
    private ArrayList<String> lenguajes;

    public Desarrollador(){
    }
    public Desarrollador(int id, String nombre, String departamento, double salario, ArrayList<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes=lenguajes;
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguajes: "+lenguajes);
        for (int s = 0; s < lenguajes.size(); s++) {
            System.out.println(lenguajes.get(s));
        }
    }
    @Override
    public double calcularBono(String desenpenio) {
        double bono = 0;
        if(desenpenio=="Bueno"){
            bono = getSalario()+(100*lenguajes.size());
        }else if (desenpenio=="Regular"){
            bono = getSalario()+(50*lenguajes.size());
        }else{
            bono = getSalario();
        }

        return bono;
    }

    @Override
    public String evaluarDesempeno() {
        String mensaje;
        if(lenguajes.size()>=5){
            mensaje= "Bueno";
        } else if (lenguajes.size()>=3){
            mensaje= "Regular";
        }else{
            mensaje="Malo";
        }
        return mensaje;
    }
}
