package aplicacio1;

//@François
import java.util.ArrayList;

public class Advocat {

	// atributos
	/**
	 * Este atributo indica el nombre del abogado
	 */
	private String nom;
	/**
	 * Este atributo indica los apellidos del abogado
	 */
	private String llinatges;
	/**
	 * Este atributo indica el identificador del abogado como un número entero
	 */
	private static int id_advocat = 0;

	// Constructores

	/**
	 * 
	 * @param nom
	 *            indica el nombre del abogado
	 * @param llinatges
	 *            indica los apellidos del abogado
	 *            
	 * Cada vez que se añade un
	 * abogado, se suma en el contador 1. La posición en la que haya
	 * sido añadido el abogado será su id por ejemplo, el primer
	 * abogado en añadirse, tendrá por ID "1"
	 */
	public Advocat(String nom, String llinatges) {
		super();
		this.nom = nom;
		this.llinatges = llinatges;
		this.id_advocat = id_advocat;
		id_advocat++;
	}

	// Getters, setters

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

	public int getId() {
		return id_advocat;
	}

	public void setId(String id) {
		this.id_advocat = id_advocat;
	}

}