package david.corral.tfc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import david.corral.tfc.enums.Perfil;

@Entity
@Table (name="perfiles")
public class Perfiles {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer IdPerfil;
	private Perfil perfil;
	
	
	public Integer getId() {
		return IdPerfil;
	}

	public void setId(Integer id) {
		this.IdPerfil = id;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Perfiles [IdPerfil=" + IdPerfil + ", perfil=" + perfil + "]";
	}

	
}
