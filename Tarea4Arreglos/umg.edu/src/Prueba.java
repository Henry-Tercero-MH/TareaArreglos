public class Prueba {
    public static void main(String[] args) {
/**
 * Instanciamos la clase taller para obtener sus metodos
 */
        System.out.println("Agregamos 5 vehiculos de tipo objeto");
        Taller taller = new Taller();
        String color="Rojo";
        String marca= "Honda";
        String modelo="2018";
        String placa="P201DSF";
        taller.agregarVehiculo(color,marca,modelo,placa);


        String color1="Azul";
        String marca1= "Audi";
        String modelo1="2022";
        String placa1="P201ABX";
        taller.agregarVehiculo(color1,marca1,modelo1,placa);

        String color3="Blanco";
        String marca3= "BMW";
        String modelo3="98";
        String placa3="P2541FXZ";
        taller.agregarVehiculo(color3,marca3,modelo3,placa3);

        String color4="Negro";
        String marca4= "Mazda";
        String modelo4="2012";
        String placa4="P201RGDZ";
        taller.agregarVehiculo(color4,marca4,modelo4,placa4);

        String color5="Amarillo";
        String marca5= "Ferrari";
        String modelo5="2000";
        String placa5="P281XCZ";
        taller.agregarVehiculo(color5,marca5,modelo5,placa5);

        System.out.println("------------------");
        System.out.println("Mostramos todos los vehiculos que estan en el taller");
       taller.vehiculosEnelTaller();
        System.out.println("------------------");
        System.out.println("Simulamos la reparacion de un vehiculo");
      taller.vehiculoReparado();
        System.out.println("Mostramos todos los vehiculos que estan en el taller");
        taller.vehiculosEnelTaller();
        System.out.println("------------------");
        System.out.println("Simulamos la reparacion de un vehiculo");
        taller.vehiculoReparado();
        System.out.println("Mostramos todos los vehiculos que estan en el taller");
        taller.vehiculosEnelTaller();


    }
}
