package lab1.inheritanceandpolymprphism;

public abstract class WrittenItem extends Item {
	
	WrittenItem(int idNum, int noOfCopies, String title) {
		super(idNum, noOfCopies, title);
		// TODO Auto-generated constructor stub
	}
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", getAuthor()=" + getAuthor() + ", toString()=" + super.toString()
				+ ", getIdNum()=" + getIdNum() + ", getNoOfCopies()=" + getNoOfCopies() + ", getTitle()=" + getTitle()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
