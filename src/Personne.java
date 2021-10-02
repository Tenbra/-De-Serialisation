import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Etudiant")  // Transforme le nom de la balise mere en celui passé en attribut
@XmlType(propOrder = {"nom","prenom","dateNaissance"})
public class Personne implements Serializable {

	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	public Personne() {
		// Tous les attributs doivent etre de type private
		// Forcement un constructeur par defaut, et autres constructeurs si necessaire
		// Getter et Setter
	}

	public Personne(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	//@XmlAttribute    Transforme l'attribut de la class en attribut de la balise mere lors de la creation du fichier XML
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	//@XmlTransient    Pour que l'element n'apparait pas dans le document XML
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
