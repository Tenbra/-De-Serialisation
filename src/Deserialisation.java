import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Deserialisation {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Personne.class); // Donne la classe qui sera deserialis�
        Unmarshaller um = jc.createUnmarshaller();   // Crée le deserialiser
        Personne p = (Personne)um.unmarshal(new File("resultat.xml"));
        System.out.println(p.getNom());

        JAXBContext jc_1 = JAXBContext.newInstance(Personnes.class);
        Unmarshaller ums = jc_1.createUnmarshaller();   // Crée le deserialiser
        Personnes ps = (Personnes)ums.unmarshal(new File("resultat1.xml"));




    }
}
