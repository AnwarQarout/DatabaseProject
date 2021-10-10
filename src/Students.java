
public class Students {
	int ID;
	String Password;
	String Name;
	int PhoneNumber;
	String Email;
	int Budget;
	
	public Students(String Password, String Name, int PhoneNumber, String Email, int Budget) {
		
		this.Password=Password;
		this.Name=Name;
		this.PhoneNumber=PhoneNumber;
		this.Email=Email;
		this.Budget=Budget;
	}
	public Students(int ID, String Password, String Name, int PhoneNumber, String Email, int Budget ) {
		this.ID=ID;
		this.Password=Password;
		this.Name=Name;
		this.PhoneNumber=PhoneNumber;
		this.Email=Email;
		this.Budget=Budget;
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
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
