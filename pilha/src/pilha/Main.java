package pilha;

public class Main {

	public static void main(String[] args) {

		Pilha minhaPilha = new Pilha();

		minhaPilha.push(new No(9));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		minhaPilha.push(new No(6));

		System.out.println(minhaPilha);

		System.out.println(minhaPilha.pop());

		System.out.println(minhaPilha);
		
		
		
		Pilha notas = new Pilha();
		
		notas.push(new No(5));
		
		System.out.println(notas);


	}



}
