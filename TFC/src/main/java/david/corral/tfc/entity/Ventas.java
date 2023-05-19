package david.corral.tfc.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="ventas")
public class Ventas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;
	private Integer IdCoche;
	private Date fechaVenta;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public Integer getIdCoche() {
		return IdCoche;
	}
	public void setIdCoche(Integer idCoche) {
		IdCoche = idCoche;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	@Override
	public String toString() {
		return "Ventas [id=" + id + ", cliente=" + cliente + ", IdCoche=" + IdCoche + ", fechaVenta=" + fechaVenta
				+ "]";
	}
	
	
	
}
