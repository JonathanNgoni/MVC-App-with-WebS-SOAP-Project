package scola;

public class Students {
	public String name;
	public String surname;
	public String dob;
	public int level;
	public String specialite;
	public String email;
	public String year;
	public int idStudents;
	public Students (int idStudents,String name,String surname,String dob,  String email,String specialite,
			int level,String year){
		this.idStudents = idStudents;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.level = level;
		this.specialite = specialite;
		this.email = email;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getIdStudents() {
		return idStudents;
	}
	public void setIdStudents(int idStudents) {
		this.idStudents = idStudents;
	}
	
	
	
	

}
