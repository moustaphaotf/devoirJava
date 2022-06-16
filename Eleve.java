public class Eleve{
  // attributs
private:
  int idEleve;
  String prenom;
  String nom;
  int age;
  String filiation;

  // constructeurs
  Eleve(int id, String prenom, String nom, String filiation, int age){
    this.idEleve = id;
    this.prenom = prenom;
    this.nom = nom;
    this.filiation = filiation;
    this.age = age;
  }

  // getteurs+setteurs
  int getId() { return this.id; }
  void setId(int id) { this.id = id; }

  String getPrenom() { return this.prenom; }
  void setPrenom(String prenom) { this.prenom = prenom; }

  String getNom() { return this.nom;}
  void setNom(String nom) { this.nom = nom}

  String getFiliation() { return this.filiation;}
  void setFiliation(String filiation) { this.filiation;  = filiation; }

  int getAge() { return this.age;}
  void setNom(String age) { this.age = age; }

  // autres méthotes
  String presentation() {
    return (
      "Je m'appelle " + this.prenom + ' ' + this.nom + ", "
      "Je suis le fils/fille de " + this.filiation + ", " +
       "J'ai " + this.age + " ans et j'ai le numéro d'enregistrement " + this.idEleve;
    );
  }

  String presentation(String prenom, String nom){
    return (
      "Je m'appelle " + prenom + ' ' + nom + ", "
      "Je suis le fils/fille de " + this.filiation + ", " +
       "J'ai " + this.age + " ans et j'ai le numéro d'enregistrement " + this.idEleve;
    );
  }
}