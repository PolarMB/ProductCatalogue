package ejercicio;

import java.util.*;

public class Catalogue {
	
	public Product producto;
	public ArrayList <Product> catalogue; //Definimos la Clase catalogo como una Lista de Productos

		//Se usa la clase ArrayList puesto que si se quieren agregar productos, está lista permite hacerlo
		//sin tener que modificar  el rango del Array en forma manual
	
	public Catalogue() {
		catalogue = new ArrayList<Product>(); //Estado inicial de la clase Catalogo
	}
	
	
	public Product createProduct(String name, int price, double weigth) { //Acá el Metodo creador de productos
		producto = new ProductByVolume(name,price,weigth);
		return producto;
	}
	
	public Product createProduct(String name, int price) { //Sobrecargamos el Metodo, así no pedimos un peso
		producto = new ProductByKilo(name,price);		   //A los productos por Kilogramo
		return producto;
	}
	
	public void addProduct(Product producto) {   //Un Metodo sencillo para añadir los Productos al ArrayList
		catalogue.add(producto);
		}
	
	
	public void getCatalogue() { //Método impresor del Catalogo
		for(Product x : catalogue) {
			System.out.println(x.toString()); //Aca se aplican los toStrings sobreescritos en las dos subclases
		}										//de productos
		System.out.println("=============================");
	}
	
	public void sortList() { 
		Collections.sort(catalogue); //Uso del método Comparable
	}
	
	
	public void printExpensive(){  //Impresor del producto más caro
		System.out.println("Producto más caro: "+catalogue.get(0).getNombre());
	}
	
	public void printCheap(){ //Impresor del producto más baratp
		System.out.println("Producto más barato: "+catalogue.get(catalogue.size()-1).getNombre());
	}
	
}