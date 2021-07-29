package by.epamLearning.classes.simpleClasses.task9.entity;

import java.util.List;

public class Book {

	private long id;
	private String title;
	private List<String> authors;
	private String publishingHouse;
	private int yearOfPublishing;
	private int pagesQuantity;
	private double price;
	private Binding bindingType;

	public Book() {
		super();
	}

	public Book(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPagesQuantity() {
		return pagesQuantity;
	}

	public void setPagesQuantity(int pagesQuantity) {
		this.pagesQuantity = pagesQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Binding getBindingType() {
		return bindingType;
	}

	public void setBindingType(Binding bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + pagesQuantity;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublishing;
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (pagesQuantity != other.pagesQuantity)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", publishingHouse=" + publishingHouse
				+ ", yearOfPublishing=" + yearOfPublishing + ", pagesQuantity=" + pagesQuantity + ", price=" + price
				+ ", bindingType=" + bindingType + "]";
	}

}
