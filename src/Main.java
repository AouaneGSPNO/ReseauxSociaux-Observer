public class Main {
  public static void main(String[] args) {
    Utilisateur ahmed = new Utilisateur("Ahmed");
    Utilisateur fatima = new Utilisateur("Fatima");
    Publication pub1 = new Publication(" pub 1");
    Publication pub2 = new Publication(" pub 2");
//1er cas
    ahmed.suivrePublication(pub1);
    fatima.suivrePublication(pub1);

    ahmed.suivrePublication(pub2);

    pub1.publier();
    pub2.publier();
//2eme cas
    ahmed.nePlusSuivrePublication(pub1);

    pub1.publier();
  }
}
