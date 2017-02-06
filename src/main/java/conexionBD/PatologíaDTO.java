package conexionBD;

public class PatologíaDTO {
	private int idPatol;
	private String nomPatol;
	private String desPatol;
	private String trata;
	
	public PatologíaDTO(int idPatol, String nomPatol, String desPatol, String trata) {
		this.idPatol = idPatol;
		this.nomPatol = nomPatol;
		this.desPatol = desPatol;
		this.trata = trata;
	}
	public int getIdPatol() {
		return idPatol;
	}
	public void setIdPatol(int idPatol) {
		this.idPatol = idPatol;
	}
	public String getNomPatol() {
		return nomPatol;
	}
	public void setNomPatol(String nomPatol) {
		this.nomPatol = nomPatol;
	}
	public String getDesPatol() {
		return desPatol;
	}
	public void setDesPatol(String desPatol) {
		this.desPatol = desPatol;
	}
	public String getTrata() {
		return trata;
	}
	public void setTrata(String trata) {
		this.trata = trata;
	}
	
}
