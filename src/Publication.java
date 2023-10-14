import java.util.ArrayList;
import java.util.List;

public class Publication {
  private String contenu;
  private List<Observer> abonnes = new ArrayList<> ();

  public Publication(String contenu) {
    this.contenu = contenu;
  }

  public String getContenu() {
    return contenu;
  }

  public void ajouterAbonne(Observer abonne) {
    abonnes.add(abonne);
  }

  public void retirerAbonne(Observer abonne) {
    abonnes.remove(abonne);
  }

  public void publier() {
    System.out.println("Publication : " + contenu);
    notifierAbonnes();
  }

  private void notifierAbonnes() {
    for (Observer abonne : abonnes) {
      abonne.mettreAJour(this);
    }
  }
}
