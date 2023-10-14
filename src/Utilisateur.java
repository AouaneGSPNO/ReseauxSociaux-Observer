import java.util.ArrayList;
import java.util.List;

public class Utilisateur implements Observer {
  private String nom;
  private List<Publication> publicationsSuivies = new ArrayList<> ();

  public Utilisateur(String nom) {
    this.nom = nom;
  }

  public void suivrePublication(Publication publication) {
    publicationsSuivies.add(publication);
    publication.ajouterAbonne(this);
  }

  public void nePlusSuivrePublication(Publication publication) {
    publicationsSuivies.remove(publication);
    publication.retirerAbonne(this);
  }

  @Override
  public void mettreAJour(Publication publication) {
    System.out.println(nom + " a recu une nouvelle publication : " + publication.getContenu());
  }
}
