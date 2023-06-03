package david.corral.tfc.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import david.corral.tfc.enums.Puesto;

@Entity
@Table (name="empleados")
public class Empleados {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	@Enumerated(EnumType.STRING)
	private Puesto puesto;
	private Integer salario;
	private Date fecha_contrato;
	private Integer idConcesionario;
	
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Puesto getPuesto() {
		return puesto;
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	public Date getFecha_contrato() {
		return fecha_contrato;
	}
	public void setFecha_contrato(Date fecha_contrato) {
		this.fecha_contrato = fecha_contrato;
	}
	
	public Integer getIdConcesionario() {
		return idConcesionario;
	}
	public void setIdConcesionario(Integer idConcesionario) {
		this.idConcesionario = idConcesionario;
	}
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto
				+ ", salario=" + salario + ", fecha_contrato=" + fecha_contrato + ", idConcesionario=" + idConcesionario
				+ "]";
	}
	
	
}
