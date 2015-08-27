
public final class Book extends Product {
    private String author;
    private int pages;
	
    public Book() {
    	super();
    	count++;
    }
    
    public String getAuthor() {
		return author;
	}
    
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
    public String getDisplayText() {
        return super.toString() + "Author:      " + author + "\n" +
               "pages:       " + pages + "\n";
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Book other = (Book) obj;
		
		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}
		if (pages != other.pages) {
			return false;
		}
		return true;
	}
	
}