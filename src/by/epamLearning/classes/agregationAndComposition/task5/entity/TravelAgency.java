package by.epamLearning.classes.agregationAndComposition.task5.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

	private List<Voucher> vouchers;

	public TravelAgency() {
		super();
		vouchers = new ArrayList<>();
	}

	public TravelAgency(List<Voucher> vouchers) {
		super();
		this.vouchers = vouchers;
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	public void addVoucher(Voucher voucher) {
		vouchers.add(voucher);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelAgency [vouchers=" + vouchers + "]";
	}

}
