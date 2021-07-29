package by.epamLearning.oop.task5.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gift {

	private long giftNumber;
	private String customer;
	private Date date;
	private List<Sweetness> sweets;
	private Wrapping wraping;

	public Gift() {
		this.sweets = new ArrayList<>();
		this.date = new Date();
	}

	public Gift(long giftNumber, String customer, List<Sweetness> sweets, Wrapping wraping) {
		this.date = new Date();
		this.giftNumber = giftNumber;
		this.customer = customer;
		this.sweets = sweets;
		this.wraping = wraping;
	}

	public long getGiftNumber() {
		return giftNumber;
	}

	public void setGiftNumber(long giftNumber) {
		this.giftNumber = giftNumber;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Sweetness> getSweets() {
		return sweets;
	}

	public void setSweets(List<Sweetness> sweets) {
		this.sweets = sweets;
	}

	public Wrapping getWraping() {
		return wraping;
	}

	public void setWraping(Wrapping wraping) {
		this.wraping = wraping;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (int) (giftNumber ^ (giftNumber >>> 32));
		result = prime * result + ((sweets == null) ? 0 : sweets.hashCode());
		result = prime * result + ((wraping == null) ? 0 : wraping.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gift other = (Gift) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (giftNumber != other.giftNumber)
			return false;
		if (sweets == null) {
			if (other.sweets != null)
				return false;
		} else if (!sweets.equals(other.sweets))
			return false;
		if (wraping == null) {
			if (other.wraping != null)
				return false;
		} else if (!wraping.equals(other.wraping))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gift [giftNumber=" + giftNumber + ", customer=" + customer + ", date=" + date + ", sweets=" + sweets
				+ ", wraping=" + wraping + "]";
	}

}
