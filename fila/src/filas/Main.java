package filas;

public class Main {
	
	public static void main(String[] args) {
		
		Fila<String>  minhaFila = new Fila<>();
		
		minhaFila.enqueue("Primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("Cuarto");
		
		System.out.println(minhaFila);
		
		
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue("ultimo");

		System.out.println(minhaFila);
		
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
		
	
	}

}
