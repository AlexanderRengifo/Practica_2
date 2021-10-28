package practica2;

public class libro {
	//atributos
		private long ISBM;
		private String autor;
		private boolean estado;
		private String titulo;
		private int year;
		private String prestado;
		//constructores
		public libro(long iSBM, String autor, boolean estado, String titulo, int year) {
			super();
			ISBM = iSBM;
			this.autor = autor;
			this.estado = estado;
			this.titulo = titulo;
			this.year = year;
			this.prestado="\0";
		}
		public libro() {
			ISBM =0;
			this.autor = "\0";
			this.estado = false;
			this.titulo = "\0";
			this.year = 0;
			this.prestado="\0";
		}
		//getters and setters
	public long getISBM() {
		return ISBM;
	}
	public void setISBM(long iSBM) {
		ISBM = iSBM;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public long getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		}
	public String getPrestado() {
		return prestado;
	}
	public void setPrestado(String prestado) {
		this.prestado = prestado;
	}
	//metodos
	public String toString() {
		//si el estado es falso es un libro disponible caso contrario el libro esta prestado
		
		if (estado==false) {
			return "libro [ISBM=" + ISBM + ", autor=" + autor +  ", titulo=" + titulo + ", year="
					+ year + ", estado=" + "Disponible"+"]";
		}else {
			return "libro [ISBM=" + ISBM + ", autor=" + autor +  ", titulo=" + titulo + ", year="
					+ year + ", estado=" + "Prestado a:"+prestado+"]";
		}
	}
	
	
}
