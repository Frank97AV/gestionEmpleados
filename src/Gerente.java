import interfaces.EvaluacionDesenpeno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Empleado implements EvaluacionDesenpeno {

    private ArrayList<String> equipo   ;
    public Gerente( int id, String nombre, String departamento, double salario, ArrayList<String> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo=equipo;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Equipo: "+ equipo);
        for (int s = 0; s < equipo.size(); s++) {
            System.out.println(equipo.get(s));
        }
    }
    @Override
    public double calcularBono(String desenpenio) {
        double bono = 0;
        if(desenpenio=="Bueno"){
            bono = getSalario()+(100*equipo.size());
        }else if (desenpenio=="Regular"){
            bono = getSalario()+(50*equipo.size());
        }else{
            bono = getSalario();
        }

        return bono;
    }
    @Override
    public String evaluarDesempeno(){
        String mensaje;
        if(equipo.size()>=5){
            mensaje= "Bueno";
        } else if (equipo.size()>=3){
            mensaje= "Regular";
        }else{
            mensaje="Malo";
        }
        return mensaje;
    }
}
