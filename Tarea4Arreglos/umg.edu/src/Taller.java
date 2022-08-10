
import java.util.ArrayList;
import java.util.LinkedList;

public class Taller {
    /**
     * Creamos una lista de arreglos
     */
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();


    /**
     * Metodo para agregar un vehiculo a la lista
     */
    public void agregarVehiculo(String color, String marca, String modelo, String placa){
       listaVehiculos.add(new Vehiculo(color,marca,modelo,placa));
    }

    /**
     *
     * Metodo para quitar un objeto de la lista de arreglos
     */
    public boolean vehiculoReparado(){
            if(listaVehiculos.isEmpty())
            {
                return false;
            }else{
                listaVehiculos.remove(0);
                return true;
            }
        }


    /**
     * Metodo para visualizar todos los objetos guardados en la lista de arreglos
     */
   public void vehiculosEnelTaller(){
Vehiculo vehiculo = new Vehiculo();
    for (Vehiculo e:listaVehiculos){
        System.out.println(e.toString());
    }


   }
}
