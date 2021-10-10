
public class Teachers {
	int ID;
	String Name;
	String Email;
	int Budget;
	
	public Teachers(int ID, String Name, String Email, int Budget) {
		this.ID=ID;
		this.Name=Name;
		this.Email=Email;
		this.Budget=Budget;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getBudget() {
		return Budget;
	}

	public void setBudget(int budget) {
		Budget = budget;
	}
	

}
