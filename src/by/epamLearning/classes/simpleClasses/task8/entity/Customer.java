package by.epamLearning.classes.simpleClasses.task8.entity;

public class Customer {

	private long id;
	private String surname;
	private String fistname;
	private String patronymic;
	private String adress;
	private long creditCardNumber;
	private long bankAcountNumber;

	public Customer() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getBankAcountNumber() {
		return bankAcountNumber;
	}

	public void setBankAcountNumber(long bankAcountNumber) {
		this.bankAcountNumber = bankAcountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", fistname=" + fistname + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", creditCardNumber=" + creditCardNumber + ", bankAcountNumber="
				+ bankAcountNumber + "]";
	}

}
