//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet dh = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "RH", 5);
        Departement d3 = new Departement(3, "Finance", 20);

        dh.ajouterDepartement(d1);
        dh.ajouterDepartement(d2);
        dh.ajouterDepartement(d3);

        dh.displayDepartement();

        System.out.println("Recherche par nom 'RH' : " + dh.rechercherDepartement("RH"));
        System.out.println("Trier par ID : " + dh.trierDepartementById());
    }
}
