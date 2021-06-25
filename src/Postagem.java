// Declara��o da classe Postagem com os m�todos construtor, set, get, add, equals, toString, segue

/**
 * Essa classe modela o conceito do que � uma postagem/publica��o na vida real,
 * onde est�o contidos os atributos e os comportamentos para a mesma.
 * 
 * <p>
 * Atributos da classe Postagem:
 * 
 * <blockquote>
 * 
 * <pre>
 * <code>String<code> texto - O texto da postagem
 * <code>String<code> foto - O link da foto inclusa na postagem
 * <code>String<code> video - O link do video incluso na postagem
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public class Postagem {

	private String texto; // O texto da postagem
	private String foto; // O link da foto da postagem
	private String video; // O link do v�deo da postagem

	/**
	 * Construtor Postagem
	 * 
	 * @param iniciaAtributos o texto da postagem, o link da foto da postagem, o
	 *                        link do video da postagem
	 */

	public Postagem(String... iniciaAtributos) {
		try {
			setTexto(iniciaAtributos[0]); // Configura e, consequentemente, inicializa texto
		} catch (java.lang.ArrayIndexOutOfBoundsException indexOutOfBounds) {
			setTexto("");
		}
		try {
			setFoto(iniciaAtributos[1]); // Configura e, consequentemente, inicializa foto
		} catch (java.lang.ArrayIndexOutOfBoundsException indexOutOfBounds) {
			setFoto("");
		}
		try {
			setVideo(iniciaAtributos[2]); // Configura e, consequentemente, inicializa video
		} catch (java.lang.ArrayIndexOutOfBoundsException indexOutOfBounds) {
			setVideo("");
		}
	} // Fim do construtor Postagem com o Varargs

	/**
	 * Obt�m o texto
	 * 
	 * @return um <code>String<code> especificando o texto
	 */

	public String getTexto() {
		return this.texto;
	} // Fim do m�todo getTexto

	/**
	 * Obt�m a foto
	 * 
	 * @return um <code>String<code> especificando o link da foto
	 */

	public String getFoto() {
		return this.foto;
	} // Fim do m�todo getFoto

	/**
	 * Obt�m o video
	 * 
	 * @return um <code>String<code> especificando o link do v�deo
	 */

	public String getVideo() {
		return this.video;
	} // Fim do m�todo getVideo

	/**
	 * Configura o texto
	 * 
	 * @param novoTexto o texto para a configura��o
	 */

	public void setTexto(String novoTexto) {
		this.texto = novoTexto;
	} // Fim do m�todo setTexto

	/**
	 * Configura a foto
	 * 
	 * @param novoFoto o link da foto para a configura��o
	 */

	public void setFoto(String novoFoto) {
		this.foto = novoFoto;
	} // Fim do m�todo setFoto

	/**
	 * Configura a foto
	 * 
	 * @param novoVideo o link do video para a configura��o
	 */

	public void setVideo(String novoVideo) {
		this.video = novoVideo;
	} // Fim do m�todo setVideo

	/**
	 * O m�todo equals compara dois objetos
	 * 
	 * @param meuObjeto o objeto com o qual voc� deseja comparar.
	 * @return {@code true} Se esse objeto for igual ao argumento meuObjeto;
	 *         {@code false} se n�o forem iguais.
	 */

	public boolean equals(Object meuObjeto) {
		if (!(meuObjeto instanceof Postagem))
			return false;
		Postagem comparandoObjeto = (Postagem) meuObjeto;
		if (this.getTexto().equals(comparandoObjeto.getTexto()) && this.getFoto().equals(comparandoObjeto.getFoto())
				&& this.getVideo().equals(comparandoObjeto.getVideo()))
			return true;
		return false;
	} // Fim do m�todo equals

	/**
	 * O m�todo toString retorna uma string que representa "textualmente" o objeto
	 * 
	 * @return uma representa��o de <code>String<code> do objeto
	 */

	public String toString() {
		return "\t" + getTexto() + "\n\t" + getFoto() + "\n\t" + getVideo();
	} // Fim do m�todo toString

}
