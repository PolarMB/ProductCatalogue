package ejercicio;

public class ProductByVolume extends Product {//Clase Hija para los Productos que se venden por Volumen
	
	private double volume; //Atributo volumen
	
	public ProductByVolume(String name, int price, double volume) { //Estado inicial Productos por Volumen
		super(name,price,volume);
		this.volume = volume;
	}
	
	public double getVolume(){
		return volume;
	}
	
	public String rangeVolume(double volume) { //Definimos un rango para los Litros y Mililitros.
		if (volume <= 15) {
			return "Litros: "+volume;
		} else {
			return "Contenido: "+(int)volume+"ml";
		}
	}
	
	@Override
	public String toString() { //Override del toString si es Producto por Volumen
		return "Nombre: "+getNombre()+" /// "+rangeVolume(getVolume())+" /// Precio: $"+getPrecio();
	}

}
