package ejercicio;

public class Product implements Comparable <Product>{

	private String name;  //Atributos principales de los productos 
	private int price;
	
	public Product() { //Estado inicial de un producto. Metodo constructor primario
		name = " ";
		price = 0;
	}
	
	public Product(String name, int price) { //Sobrecargamos de Constructores a la clase
		this.name = name;					//Util para acceder a las subclases y por ende a sus comportamientos
		this.price = price;
	}
	
	public Product(String name, int price, double volume) {
		this.name = name;
		this.price = price;
	}

	//Metodos getter y setter de la clase Producto
	public String getNombre(){ //Para nombre
		return name;
	}
	
	
	public void setNombre(String name) {
		this.name = name;
	}
		
	public int getPrecio() { //Para precio
		return price;
	}
	
	public void setPrecio(int price) {
		this.price = price;
	}

	
	public int compareTo(Product price) {  //Override de Comparable - compareTo (ordenar en base al precio)
		if (this.price>price.getPrecio()) {
			return -1;
		}else if (this.price<price.getPrecio()) {
			return 1;
		}
		return 0;
	} 
}
