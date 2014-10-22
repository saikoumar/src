package donnee;

import java.util.*;


public class Specialite {
	
	private String nom;
	private HashMap<String,Patient> lespatients;
	private HashMap<String,FicheSuivie> lesfichessuivies;
	private Collection<Specialiste> lesspecialistes;
	
	public Specialite(String nom) {
		this.nom =conflit;
		this.lespatients=new HashMap<String,Patient> ();
		this.lesfichessuivies=new HashMap<String,FicheSuivie>();
		this.lesspecialistes=new ArrayList<Specialiste> ();
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<String, Patient> getLespatients() {
		return lespatients;
	}

	public HashMap<String, FicheSuivie> getLesfichessuivies() {
		return lesfichessuivies;
	}

	public Collection<Specialiste> getLesspecialistes() {
		return lesspecialistes;
	}

	
}
