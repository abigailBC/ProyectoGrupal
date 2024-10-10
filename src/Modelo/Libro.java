package Modelo;

import java.io.Serializable;

public class Libro implements Serializable {
	private String id;
	private String titulo;
	private String autor;
	private String isbn;
	private int anno;
	private static final long serialVersionUID = 1L;
	public Libro(String id, String titulo, String autor, String isbn, int anno) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anno = anno;
	}
	

	public Libro() {
	}


	public String getId() {
		return id;
	}

	public String setId(String id) {
		this.id = id;
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", año=" + anno
				+ "]";
	}
	
}