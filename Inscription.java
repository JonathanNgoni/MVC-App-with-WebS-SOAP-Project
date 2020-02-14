package scola;

public class Inscription {
private int idIns;
private int idStudents;
private String nomS;
private String prenomS;
private String specialite;
private int level;
private String year;
private String decision;
public Inscription(int idIns, int idStudents, String nomS, String prenomS, String specialite,
		int level, String year,String decision){
	this.idIns=idIns;
	this.idStudents=idStudents;
	this.nomS=nomS;
	this.prenomS=prenomS;
	this.specialite=specialite;
	this.level=level;
	this.year=year;
	this.decision= decision;
}
public String getDecision() {
	return decision;
}
public void setDecision(String decision) {
	this.decision = decision;
}
public int getIdIns() {
	return idIns;
}
public void setIdIns(int idIns) {
	this.idIns = idIns;
}
public int getIdStudents() {
	return idStudents;
}
public void setIdStudents(int idStudents) {
	this.idStudents = idStudents;
}
public String getNomS() {
	return nomS;
}
public void setNomS(String nomS) {
	this.nomS = nomS;
}
public String getPrenomS() {
	return prenomS;
}
public void setPrenomS(String prenomS) {
	this.prenomS = prenomS;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
}
