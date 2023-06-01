package david.corral.tfc.entity;
import java.util.Date;
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
@Table (name="clientes")
public class Clientes {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	//private String telefono;
	private String email;
	private String usuario;
	private String password;
	private Integer estatus;
	private Date fechaRegistro;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "usuarioperfil", 
    joinColumns = @JoinColumn (name= "idUsuario"), 
    inverseJoinColumns = @JoinColumn(name = "idPerfil"))
	
	
    private List<Perfiles> perfiles;

	public void agregar(Perfiles perfil) {
		
	}
	
	
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

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
/*
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String contraseña) {
		this.password = contraseña;
	}

	public List<Perfiles> getPerfiles() {
		return perfiles;
	}


	public void setPerfiles(List<Perfiles> perfiles) {
		this.perfiles = perfiles;
	}


	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", usuario=" + usuario + ", password=" + password + ", estatus=" + estatus + ", fechaRegistro="
				+ fechaRegistro + ", perfiles=" + perfiles + "]";
	}


	
	
	
}
