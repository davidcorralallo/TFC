package david.corral.tfc.entity;

public class Item {

	private Coches coche;
	private Integer catidad;
	public Coches getCoche() {
		return coche;
	}
	public void setCoche(Coches coche) {
		this.coche = coche;
	}
	public Integer getCatidad() {
		return catidad;
	}
	public void setCatidad(Integer catidad) {
		this.catidad = catidad;
	}
	
	public Item(Coches coche, Integer catidad) {
		super();
		this.coche = coche;
		this.catidad = catidad;
	}
	
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [coche=" + coche + ", catidad=" + catidad + "]";
	}
	
	
}
