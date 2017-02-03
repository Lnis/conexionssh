package conexionssh;

public class Sintoma {
	private int id;
	private String sint;
	
	/**
	 * BEAN
	 * POJO
	 */
	public Sintoma(int id, String sint) {
		this.id = id;
		this.sint = sint;
	}
	public int getId() {
		return id;
	}
		public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return sint;
	}
	public void setNombre(String sint) {
		this.sint = sint;
	}
	
	
	
}
