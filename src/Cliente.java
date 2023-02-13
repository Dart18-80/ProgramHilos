public class Cliente {

    public Cliente(){
    }

	public Cliente(String snombre, int[] scarroCompras) {
        this.nombre = snombre;
        this.carroCompra = scarroCompras;
    }
    private String nombre;
	private int[] carroCompra;

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String snombre){
        this.nombre = snombre;
    }

    public void setCarroCompra (int[] scarroCompras){
        this.carroCompra = scarroCompras;
    }

}