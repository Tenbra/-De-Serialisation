import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Personne.class); // Donne la classe qui sera serialisé
		Personne p_1 = new Personne("Tenede","Bryan", new Date(11,04,2000)); 
		
		Marshaller m = jc.createMarshaller();   // Crée le serialiser
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  // Formate le fichier de sortie sous forme d'arbre
		m.marshal(p_1, new File("resutlat.xml"));  // Serialise et donne le fichier de sortie
	}

}
