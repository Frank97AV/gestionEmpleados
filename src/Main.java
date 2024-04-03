import interfaces.EvaluacionDesenpeno;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Insertar Desarrollador
        ArrayList<String> lenguajes1 = new ArrayList<>();
        lenguajes1.add("java");
        lenguajes1.add("python");

        Desarrollador des1 = new Desarrollador(1, "Franklin", "Lima", 4857, lenguajes1);

        ArrayList<String> lenguajes2 = new ArrayList<>();
        lenguajes2.add("java");
        lenguajes2.add("python");
        lenguajes2.add("HTML");
        lenguajes2.add("C#");

        Desarrollador des2 = new Desarrollador(2, "Juan", "Junin", 2351, lenguajes2);

        ArrayList<String> lenguajes3 = new ArrayList<>();
        lenguajes3.add("Rust");
        lenguajes3.add("Nosql");
        lenguajes3.add("java");
        lenguajes3.add("python");
        lenguajes3.add("HTML");
        lenguajes3.add("C#");

        Desarrollador des3 = new Desarrollador(3, "Alberto", "Iquitos", 61312, lenguajes3);


        //Insertar Gerente

        ArrayList<String> equipo1 = new ArrayList<>();
        equipo1.add("Marta");
        equipo1.add("Juanita");

        Gerente ger1= new Gerente(1, "Rodrigo","Arequipa",512311, equipo1);

        ArrayList<String> equipo2 = new ArrayList<>();
        equipo2.add("Mario");
        equipo2.add("Juan");
        equipo2.add("Jose");
        equipo2.add("Josefa");

        Gerente ger2= new Gerente(2, "Edwin","Junin",125121, equipo2);

        ArrayList<String> equipo3= new ArrayList<>();
        equipo3.add("Rosa");
        equipo3.add("Lorena");
        equipo3.add("George");
        equipo3.add("Antoni");
        equipo3.add("Jesus");
        equipo3.add("Mateo");

        Gerente ger3= new Gerente(3, "Edwin","Junin",125121, equipo3);

        System.out.println("=============================================");
        des1.mostrarDetalles();
        System.out.println("Desempenio: "+des1.evaluarDesempeno());
        System.out.println("bono: "+des1.calcularBono(des1.evaluarDesempeno()));

        System.out.println("=============================================");
        ger2.mostrarDetalles();
        System.out.println("Desempenio: "+ger2.evaluarDesempeno());
        System.out.println("bono: "+ger2.calcularBono(ger2.evaluarDesempeno()));

        System.out.println("=============================================");
        ger3.mostrarDetalles();
        System.out.println("Desempenio: "+ger3.evaluarDesempeno());
        System.out.println("bono: "+ger3.calcularBono(ger3.evaluarDesempeno()));

        System.out.println("=============================================");
        des1.mostrarDetalles();
        System.out.println("Desempenio: "+des1.evaluarDesempeno());
        System.out.println("bono: "+des1.calcularBono(des1.evaluarDesempeno()));

        System.out.println("=============================================");
        ger2.mostrarDetalles();
        System.out.println("Desempenio: "+ger2.evaluarDesempeno());
        System.out.println("bono: "+ger2.calcularBono(ger2.evaluarDesempeno()));

        System.out.println("=============================================");
        ger3.mostrarDetalles();
        System.out.println("Desempenio: "+ger3.evaluarDesempeno());
        System.out.println("bono: "+ger3.calcularBono(ger3.evaluarDesempeno()));


        System.out.println("===============ITERANDO======================");
    
        List<Gerente> gerentes= new ArrayList<>();
        gerentes.add(ger1);
        gerentes.add(ger2);
        gerentes.add(ger3);

        for (Gerente gerente : gerentes) {
            System.out.println("=============================================");
            gerente.mostrarDetalles();
            System.out.println("Desempenio: "+gerente.evaluarDesempeno());
            System.out.println("bono: "+gerente.calcularBono(gerente.evaluarDesempeno()));
        }



        List<Desarrollador> desarrolladores= new ArrayList<>();
        desarrolladores.add(des1);
        desarrolladores.add(des2);
        desarrolladores.add(des3);

        for (Desarrollador desarrollador : desarrolladores) {
            System.out.println("=============================================");
            desarrollador.mostrarDetalles();
            System.out.println("Desempenio: "+desarrollador.evaluarDesempeno());
            System.out.println("bono: "+desarrollador.calcularBono(desarrollador.evaluarDesempeno()));
        }

    }
}