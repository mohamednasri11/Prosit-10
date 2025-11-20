
    public class Departement {
        private int id;
        private String nom;
        private int nbEmployes;

        // Constructeur sans paramètres
        public Departement() {}

        // Constructeur avec paramètres
        public Departement(int id, String nom, int nbEmployes) {
            this.id = id;
            this.nom = nom;
            this.nbEmployes = nbEmployes;
        }

        // Getters & Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getNom() { return nom; }
        public void setNom(String nom) { this.nom = nom; }

        public int getNbEmployes() { return nbEmployes; }
        public void setNbEmployes(int nbEmployes) { this.nbEmployes = nbEmployes; }

        // equals : égalité selon id et nom
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Departement)) return false;
            Departement d = (Departement) obj;
            return this.id == d.id && this.nom.equalsIgnoreCase(d.nom);
        }

        // Indispensable pour HashSet
        @Override
        public int hashCode() {
            return id + nom.toLowerCase().hashCode();
        }

        // toString
        @Override
        public String toString() {
            return "Departement{id=" + id + ", nom='" + nom + "', nbEmployes=" + nbEmployes + "}";
        }
    }


