package david.corral.tfc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table (name="concesionario")
public class Concesionario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String localizacion;
	private Integer id_empleado;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "cochesconcesionario", 
    joinColumns = @JoinColumn (name= "idConcesionario"), 
    inverseJoinColumns = @JoinColumn(name = "idCoche"))
	
	private List<Coches> coches;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public Integer getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}
	public List<Coches> getCoches() {
		return coches;
	}
	public void setCoches(List<Coches> coches) {
		this.coches = coches;
	}
	
	
	@Override
	public String toString() {
		return "Concesionario [id=" + id + ", nombre=" + nombre + ", localizacion=" + localizacion + ", id_empleado="
				+ id_empleado + ", coches=" + coches + "]";
	}
	
	
	
	
	
	
	
}