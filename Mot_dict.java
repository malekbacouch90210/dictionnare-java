package dictionnaire;

public class Mot_dict {
	private String mot;
	private String definition;
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	@Override
	public String toString() {
		return "Mot_dict [mot=" + mot + ", definition=" + definition + "]";
	}
	public boolean sysnonyme(String s){
		if(this.getMot().equals(s)==true) {
			return true;
		}
		else {
			return false;
		}
	}
}
