package com.example.parcial;public class Pagina2 {

    public class Main {

        public static void main(String[] args) {

            Ferrari ferrari1 = new Ferrari();
            Aston aston1 = new Aston("Ingles", "Deportivo", "5 Pasajeros", "Gasolina" , 4 , "Superauto");

            ferrari1.encender();
            ferrari1.hacerSonido("Superdeportivo","Rojo");

            aston1.apagar(aston1.getTipo_combustible());

        }
    }

    public interface Automovil {
        void encender();
        void apagar();

    }
}
