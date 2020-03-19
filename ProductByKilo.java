package ejercicio;

public class ProductByKilo extends Product {//Clase Hija para los productos de Venta por Kilogramo
	
	private double kilogram; //Atributo caracteristico, los kilogramos
	
	public ProductByKilo(String name, int price) { //Estado inicial Productos por Kilo
		super(name,price);
		kilogram = 0;
	}
	
	public double getKilo() {
		return kilogram;
	}
	
	@Override
	public String toString() { //Con su respectivo override del toString para impresion por pantalla
		return "Nombre: "+getNombre()+" /// Precio: $"+getPrecio()+" /// Unidad de venta: Kilo";
	}

}
