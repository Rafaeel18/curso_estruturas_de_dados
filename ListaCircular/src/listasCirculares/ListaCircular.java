package listasCirculares;

public class ListaCircular<T> {
	
	private No<T> cabeza;	
	private No<T> cauda;	
	private int  tamanhoLista;
	
	
	
	
	
	
	
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeza = null;
		this.tamanhoLista = 0;
		
	}






	//METODO add()
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.tamanhoLista == 0) {
			this.cabeza = novoNo;
			this.cauda = this.cabeza;
			this.cabeza.setNoProximo(cauda);
		}else {
			novoNo.setNoProximo(this.cauda);
			this.cabeza.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		this.tamanhoLista++;
		
	}
	
	
		
	
	
	
	//METODO remove()

	public void remove(int index) {
		if(index>=this.tamanhoLista)
			throw new IndexOutOfBoundsException("O INDECE E MAIOR QUE O TAMANHO DA LISTA!");
		No<T> noAuxiliar = this.cauda;
		if(index == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeza.setNoProximo(this.cauda);
		}else if(index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
			
		}else {
			for(int i = 0 ; i<index-1;i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		this.tamanhoLista--;
	}
	
	
	
	//METODO get()
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	
	
	//Metodo getNo()
	
	private No<T> getNo(int index){
		
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("A lista esta vazia!");
	
	if(index == 0) {
		return this.cauda;
	}
	
	No<T> noAuxiliar = this.cauda;
	for(int i = 0; (i<index)&&(noAuxiliar != null);i++ ) {
		
		
		noAuxiliar = noAuxiliar.getNoProximo();
		
	}
	return noAuxiliar;
	}
	
	
	
	
	
	
	
	
	//METODO isEmpty		
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
		
		
	}
	
	
	
	
	//METODO size
	
	public int size() {
		return this.tamanhoLista;
	}






	@Override
	public String toString() {
String strRetorno = "";		
		
No<T> noAuxiliar = this.cauda;
for(int i = 0; i<this.size(); i++) {
	strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->"; 
	noAuxiliar = noAuxiliar.getNoProximo();
}
strRetorno += this.size() != 0 ?"(Retorna ao inicio)" : "[]";

		return strRetorno;
	}
	
	//METODO toString()
	
	
	

}
