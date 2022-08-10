public class Vehiculo {
    /**
     *   //atributos de la clase
     */
    private String color;
    private String marca;
    private String modelo;
    private String placa;

    /**
     * Metodo constructor por defecto
     */

    public Vehiculo() {
    }

    /**
     *  Condtructor con parametros
     */

    public Vehiculo(String color, String marca, String modelo,String placa){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.placa=placa;
    }
    /**
     * Metodos setters
     */

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Metodos getters
     */
    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }
    /**
     * Metodo toString para visualizar datos
     */
    @Override
    public String toString() {
        return"Color:\t"+"Marca:\t"+"Modelo:\t"+"Placa:\n"+
                color+"\t"+marca+"\t"+modelo+"\t"+placa+"\n"+"--------------------------------------------------------------------------------";

    }
}