package conexionBD;

public class SintomaDTO {
	private int idSint;
	private String desSint;
	
	public SintomaDTO(int idSint, String desSint) {
		this.idSint = idSint;
		this.desSint = desSint;
	}

	public int getIdSint() {
		return idSint;
	}

	public void setIdSint(int idSint) {
		this.idSint = idSint;
	}

	public String getDesSint() {
		return desSint;
	}

	public void setDesSint(String desSint) {
		this.desSint = desSint;
	}
	
}
