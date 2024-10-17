package dictionnaire;

public class Dictionnaire {
	public Mot_dict[] Dict;
	private int taille;
	private String nom;
	public static int nb_mot=0;
	
	public void Dictionnaire (String nom , int taille) {
		Dict=new Mot_dict[taille];
		this.taille=taille;
		this.nom=nom;
	}
	public void ajouter_Mot(Mot_dict dict[] , String mot) {
		if(nb_mot>taille) {
			System.out.println("n'ajoute pas");
		}
		else {
			dict[nb_mot].setMot(mot);
			nb_mot++;
		}
	}
	public void trier() {
	    Mot_dict temp;
	    for (int i = 0; i < nb_mot - 1; i++) {
	        for (int j = 0; j < nb_mot - i - 1; j++) {
	            if (Dict[j].getMot().compareToIgnoreCase(Dict[j + 1].getMot()) > 0) {
	                temp = Dict[j];
	                Dict[j] = Dict[j + 1];
	                Dict[j + 1] = temp;
	            }
	        }
	    }
	}
	 public void supprimerMot(String mot) {
	        boolean temp = false;
	        for (int i = 0; i < nb_mot; i++) {
	            if (Dict[i].getMot().equalsIgnoreCase(mot)) {
	                temp = true;
	                for (int j = i; j < nb_mot - 1; j++) {
	                	Dict[j] = Dict[j + 1];
	                }
	                Dict[nb_mot - 1] = null;
	                nb_mot--;
	                break;
	            }
	        }
	        if (!temp) {
	            System.out.println("Le mot '" + mot + "' n'a pas été trouvé dans le dictionnaire.");
	        }
	    }

	    public String rechercheDicho(String mot) {
	        for (int i = 0; i < nb_mot; i++) {
	            if (Dict[i].getMot().equalsIgnoreCase(mot)) {
	                return Dict[i].getDefinition();
	            }
	        }
	        return mot;
	    }

	    public void listerDictionnaire() {
	        System.out.println("Dictionnaire '" + nom + "' contient les mots suivants :");
	        for (int i = 0; i < nb_mot; i++) {
	            System.out.println(Dict[i].toString());
	        }
	    }

	    public int nombreSynonymes(String mot) {
	        int count = 0;
	        for (int i = 0; i < nb_mot; i++) {
	            if (Dict[i].sysnonyme(mot)) {
	                count++;
	            }
	        }
	        return count;
	    }
}

