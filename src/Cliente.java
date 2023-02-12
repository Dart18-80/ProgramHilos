public class Cliente {

	public Cliente(String snombre, int[] scarroCompras) {
        nombre = snombre;
        carroCompra = scarroCompras;
    }
    private String nombre;
	private int[] carroCompra;

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

}