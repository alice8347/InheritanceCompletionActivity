import java.text.NumberFormat;

public abstract class Product {
	private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public static void setCount(int count) {
		Product.count = count;
	}

	// create public access for the count variable
    public static int getCount() {                              
        return count;
    }
    
    private String getFormattedPrice() {
		NumberFormat myFormatter = NumberFormat.getCurrencyInstance();
		return myFormatter.format(price);
		
	}
    
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString() {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }
    
    abstract String getDisplayText();
    
    public String className() {
    	return this.getClass().getSimpleName();
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Product other = (Product) obj;
		
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price)) {
			return false;
		}
		return true;
	}
    
}
