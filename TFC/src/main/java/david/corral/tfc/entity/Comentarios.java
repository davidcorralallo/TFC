package david.corral.tfc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentarios {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String autor;
	private String comentario;
	
	@ManyToOne
    @JoinColumn(name = "idCoche")
    private Coches coche;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Coches getCoche() {
		return coche;
	}

	public void setCoche(Coches coche) {
		this.coche = coche;
	}

	@Override
	public String toString() {
		return "Comentarios [id=" + id + ", autor=" + autor + ", comentario=" + comentario + ", coche=" + coche + "]";
	}
	
	
}
