package david.corral.tfc.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import david.corral.tfc.enums.Cambio;
import david.corral.tfc.enums.Combustible;
import david.corral.tfc.enums.Marcas;
import david.corral.tfc.enums.Traccion;

@Entity
@Table (name="coches")
public class Coches {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private Marcas marca;
	private String modelo;
	private Integer potencia;
	@Enumerated(EnumType.STRING)
	private Cambio cambio;
	@Enumerated(EnumType.STRING)
	private Traccion traccion;
	@Enumerated(EnumType.STRING)
	private Combustible combustible;
	private Integer plazas;
	private Double precio;
	private String img;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Marcas getMarca() {
		return marca;
	}
	public void setMarca(Marcas marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Cambio getCambio() {
		return cambio;
	}
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	public Traccion getTraccion() {
		return traccion;
	}
	public void setTraccion(Traccion traccion) {
		this.traccion = traccion;
	}
	public Combustible getCombustible() {
		return combustible;
	}
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}
	public Integer getPlazas() {
		return plazas;
	}
	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public Integer getPotencia() {
		return potencia;
	}
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	
	
	
	
}
