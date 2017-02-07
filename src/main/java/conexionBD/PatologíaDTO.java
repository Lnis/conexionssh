package conexionBD;

import java.util.ArrayList;
import java.util.List;

public class PatologíaDTO {
	private int idPatol;
	private String nomPatol;
	private String desPatol;
	private String trata;
	private String causa;
	List<SintomaDTO> listSto = new ArrayList<SintomaDTO>();
	
	public PatologíaDTO(int idPatol, String nomPatol, String desPatol, String trata, String causa, List<SintomaDTO> listSto) {
		this.idPatol = idPatol;
		this.nomPatol = nomPatol;
		this.desPatol = desPatol;
		this.trata = trata;
		this.causa = causa;
		this.listSto = listSto;
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
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public List<SintomaDTO> getListSto() {
		return listSto;
	}
	public void setListSto(List<SintomaDTO> listSto) {
		this.listSto = listSto;
	}
	
}
