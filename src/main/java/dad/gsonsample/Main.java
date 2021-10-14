package dad.gsonsample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona varPer = new Persona();
        System.out.println("Introduzca el Nombre: ");
        varPer.setNombre(in.nextLine());
        System.out.println("Introduzca los Apellidos: ");
        varPer.setApellidos(in.nextLine());
        System.out.println("Introduzca la Edad: ");
        varPer.setEdad(in.nextInt());
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(varPer);
        System.out.println(json);
        in.close();
    }
}
