package dictionnaire;

public class test_Dictionnaire {

    public static void main(String[] args) {
        Dictionnaire monDico = new Dictionnaire("MonDictionnaire", 5);

        Mot_dict mot1 = new Mot_dict("arbre", "Plante ligneuse qui se développe en hauteur.");
        Mot_dict mot2 = new Mot_dict("voiture", "Véhicule à quatre roues.");
        Mot_dict mot3 = new Mot_dict("ordinateur", "Machine électronique pour traiter des données.");
        Mot_dict mot4 = new Mot_dict("synonyme", "Mot qui a une signification identique ou très proche.");
        Mot_dict mot5 = new Mot_dict("maison", "Lieu où on habite.");

        monDico.ajouter_Mot(mot1);
        monDico.ajouter_Mot(mot2);
        monDico.ajouter_Mot(mot3);
        monDico.ajouter_Mot(mot4);
        monDico.ajouter_Mot(mot5);

        System.out.println("\nListe des mots après ajout :");
        monDico.listerDictionnaire();

        System.out.println("\nRecherche de la définition de 'ordinateur':");
        System.out.println(monDico.rechercheDicho("ordinateur"));

        System.out.println("\nSuppression du mot 'synonyme':");
        monDico.supprimerMot("synonyme");
        monDico.listerDictionnaire();

        System.out.println("\nNombre de synonymes de 'voiture':");
        System.out.println(monDico.nombreSynonymes("voiture"));
    }
}
