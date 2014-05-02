package aplicacio1;

//@François
import java.util.ArrayList;

public class Persona {

	// atributos

	private Advocat advocat;
	private String nom;
	private String llinatges;
	private String dni;
	private ArrayList<Cas> LlistaCasosPersona;
	
	// constructores
	public Persona( String nom, String llinatges, String dni) {
		super();
		this.nom = nom;
		this.llinatges = llinatges;
		this.dni = dni;
	
	}

	// getters, setters
	public Advocat getAdvocat() {
		return advocat;
	}

	public void setAdvocat(Advocat advocat) {
		this.advocat = advocat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLlinatges() {
		return llinatges;
	}

	public void setLlinatges(String llinatges) {
		this.llinatges = llinatges;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// Métodos

	public Cas tornaCas(int id) {

		for (Cas d : LlistaCasosPersona) {
			if (d.getId() == id) {
				return d.getId();
			}  

			
			

		}
		return null;

	}
	public boolean addCas (Cas cas){
		LlistaCasosPersona.add(cas);
		return true;
	}
	
	public boolean removeCas (Cas cas){
		LlistaCasosPersona.remove(cas);
		return true;
	}
	

	
	
}
