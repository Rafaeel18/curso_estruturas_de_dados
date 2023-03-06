package listasEncadeadas;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;

	}

	// METODO add()

	public void add(T conteudo) {

		No<T> novoNo = new No<>(conteudo);
		if (this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}

		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		noAuxiliar.setProximoNo(novoNo);
	}

	// METODO get()
	public T get(int index) {

		return getNo(index).getConteudo();

	}

	// METODO getNo()

	private No<T> getNo(int index) {

		validaIndice(index);

		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;

		for (int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;

			noAuxiliar = noAuxiliar.getProximoNo();
		}

		return noRetorno;

	}

	// METODO remove()
	public T remove(int index) {

		No<T> noPivo = this.getNo(index);
		if (index == 0) {
			referenciaEntrada = noPivo.getProximoNo();
			return noPivo.getConteudo();
		}

		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivo.getProximoNo());
		return noPivo.getConteudo();

	}

//Metodo Size

	public int size() {

		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while (true) {
			if (referenciaAux != null) {
				tamanhoLista++;
				if (referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();

				} else {
					break;
				}

			} else {
				break;
			}

		}
		return tamanhoLista;

	}

	private void validaIndice(int index) {
		if (index >= size()) {

			int ultimoIndice = size() - 1;

			throw new IndexOutOfBoundsException("nao existe conteudo no indice " + index
					+ "desta lista. esta lista so vai ate o indice" + ultimoIndice);

		}
	}

	// Metodo isEmpty()

	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;

	}

	@Override
	public String toString() {

		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < this.size(); i++) {
			strRetorno += "No{conteudo = " + noAuxiliar.getConteudo() + "}--->";

			noAuxiliar = noAuxiliar.getProximoNo();

		}
		strRetorno += "null";

		return strRetorno;
	}

}
