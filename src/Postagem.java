// Declaração da classe Postagem com os métodos construtor, set, get, add, equals, toString, segue

/**
 * Essa classe modela o conceito do que é uma postagem/publicação na vida real,
 * onde estão contidos os atributos e os comportamentos para a mesma.
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
	private String video; // O link do vídeo da postagem

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
	 * Obtém o texto
	 * 
	 * @return um <code>String<code> especificando o texto
	 */

	public String getTexto() {
		return this.texto;
	} // Fim do método getTexto

	/**
	 * Obtém a foto
	 * 
	 * @return um <code>String<code> especificando o link da foto
	 */

	public String getFoto() {
		return this.foto;
	} // Fim do método getFoto

	/**
	 * Obtém o video
	 * 
	 * @return um <code>String<code> especificando o link do vídeo
	 */

	public String getVideo() {
		return this.video;
	} // Fim do método getVideo

	/**
	 * Configura o texto
	 * 
	 * @param novoTexto o texto para a configuração
	 */

	public void setTexto(String novoTexto) {
		this.texto = novoTexto;
	} // Fim do método setTexto

	/**
	 * Configura a foto
	 * 
	 * @param novoFoto o link da foto para a configuração
	 */

	public void setFoto(String novoFoto) {
		this.foto = novoFoto;
	} // Fim do método setFoto

	/**
	 * Configura a foto
	 * 
	 * @param novoVideo o link do video para a configuração
	 */

	public void setVideo(String novoVideo) {
		this.video = novoVideo;
	} // Fim do método setVideo

	/**
	 * O método equals compara dois objetos
	 * 
	 * @param meuObjeto o objeto com o qual você deseja comparar.
	 * @return {@code true} Se esse objeto for igual ao argumento meuObjeto;
	 *         {@code false} se não forem iguais.
	 */

	public boolean equals(Object meuObjeto) {
		if (!(meuObjeto instanceof Postagem))
			return false;
		Postagem comparandoObjeto = (Postagem) meuObjeto;
		if (this.getTexto().equals(comparandoObjeto.getTexto()) && this.getFoto().equals(comparandoObjeto.getFoto())
				&& this.getVideo().equals(comparandoObjeto.getVideo()))
			return true;
		return false;
	} // Fim do método equals

	/**
	 * O método toString retorna uma string que representa "textualmente" o objeto
	 * 
	 * @return uma representação de <code>String<code> do objeto
	 */

	public String toString() {
		return "\t" + getTexto() + "\n\t" + getFoto() + "\n\t" + getVideo();
	} // Fim do método toString

}
