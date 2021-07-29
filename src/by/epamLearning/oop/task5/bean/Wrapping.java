package by.epamLearning.oop.task5.bean;

public class Wrapping {

	private String material;
	private String wrapingShape;
	private String lockType;
	private String color;
	private String image;
	private int volume;
	private int price;

	public Wrapping() {
	}

	public Wrapping(String material, String wrapingShape, String lockType, String color, String image, int volume,
			int price) {
		super();
		this.material = material;
		this.wrapingShape = wrapingShape;
		this.lockType = lockType;
		this.color = color;
		this.image = image;
		this.volume = volume;
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getWrapingShape() {
		return wrapingShape;
	}

	public void setWrapingShape(String wrapingShape) {
		this.wrapingShape = wrapingShape;
	}

	public String getLockType() {
		return lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((lockType == null) ? 0 : lockType.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + price;
		result = prime * result + volume;
		result = prime * result + ((wrapingShape == null) ? 0 : wrapingShape.hashCode());
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
		Wrapping other = (Wrapping) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (lockType == null) {
			if (other.lockType != null)
				return false;
		} else if (!lockType.equals(other.lockType))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (price != other.price)
			return false;
		if (volume != other.volume)
			return false;
		if (wrapingShape == null) {
			if (other.wrapingShape != null)
				return false;
		} else if (!wrapingShape.equals(other.wrapingShape))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wrapping [material=" + material + ", wrapingShape=" + wrapingShape + ", lockType=" + lockType
				+ ", color=" + color + ", image=" + image + ", volume=" + volume + ", price=" + price + "]";
	}

}
