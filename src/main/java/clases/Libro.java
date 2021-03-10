package clases;

import java.util.Comparator;

public class Libro implements Comparable<Libro>, Comparator<Libro>{
	
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;

	public Libro() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [titulo: " + titulo + ", isbn: " + isbn + ", genero: " + genero + ", autor: " + autor + ", paginas: "
				+ paginas + "]";
	}
	
	public String toFichero() {
		return titulo + "," + isbn + "," + genero + "," + autor + ","
				+ paginas+"\n";
	}


	public boolean equals(Object o) {
		boolean ig = false;
		if(this == o) {
			ig = true;
		}
		else {
			Libro a = (Libro) o;
			if (this.isbn.equalsIgnoreCase(a.isbn)) {
				ig = true;
			}
		}
		
		return ig;
	}
	
	public int compareTo(Libro o) {
		
		return this.titulo.compareTo(o.titulo);
		
		
	}
	
	public int compare(Libro l1, Libro l2) {
		return l1.getPaginas()-l2.getPaginas();
		
		
		
	}
	
	
	/**
	 * @param titulo
	 * @param isbn
	 * @param genero
	 * @param autor
	 * @param paginas
	 */

}
