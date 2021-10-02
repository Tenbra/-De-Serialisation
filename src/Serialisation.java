import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Serialisation {

	public Serialisation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Personne.class); // Donne la classe qui sera serialis�
		Personne p_1 = new Personne("Tenede","Bryan", new Date(11,04,2000)); 
		
		Marshaller m = jc.createMarshaller();   // Cr�e le serialiser
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  // Formate le fichier de sortie sous forme d'arbre
		m.marshal(p_1, new File("resultat.xml"));  // Serialise et donne le fichier de sortie
		
		JAXBContext jc_1 = JAXBContext.newInstance(Personnes.class);
		Personnes ps = new Personnes(); 
		
		ps.getPersonnes().add(new Personne("Tenede","Bryan", new Date(11,04,2000)));
		ps.getPersonnes().add(new Personne("Tenede","Bryan", new Date(11,04,2000)));
		ps.getPersonnes().add(new Personne("Tenede","Bryan", new Date(11,04,2000)));

		Marshaller ms = jc_1.createMarshaller();   // Cr�e le serialiser
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  // Formate le fichier de sortie sous forme d'arbre
		ms.marshal(ps, new File("resultat1.xml"));
		
		
		
		
		
	}

}
