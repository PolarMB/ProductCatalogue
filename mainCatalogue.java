package ejercicio;

public class mainCatalogue{

	public static void main(String[] args) {
	
		Catalogue lista = new Catalogue();
		
		//Se agregan productos usando el metodo addProduct
		lista.addProduct(lista.createProduct("Coca-Cola Zero", 20, 1.5)); //Al mismo tiempo, se crean 
		lista.addProduct(lista.createProduct("Coca-Cola",18,1.5));		//usando createProduct
		lista.addProduct(lista.createProduct("Shampoo Sedal", 19, 500));
		lista.addProduct(lista.createProduct("Frutillas", 64));			
																		
		lista.getCatalogue(); //Imprimir por pantalla					
		
		lista.sortList(); //Ordenador de lista en base al precio (Interface Comparable)
		lista.printExpensive(); //Imprime el mas caro
		lista.printCheap();    //Imprime el mas barato

	}
}
