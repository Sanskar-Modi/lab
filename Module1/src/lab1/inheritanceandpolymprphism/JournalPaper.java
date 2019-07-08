package lab1.inheritanceandpolymprphism;

public class JournalPaper extends WrittenItem {
	JournalPaper(int idNum, int noOfCopies, String title) {
		super(idNum, noOfCopies, title);
		// TODO Auto-generated constructor stub
	}
	public JournalPaper() {
		// TODO Auto-generated constructor stub
	}

	// variables
	private String yearPublished;

	// getters and setters
	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	// overrided methods
	@Override
	public String getAuthor() {

		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {

		super.setAuthor(author);
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getYearPublished()=" + getYearPublished()
				+ ", getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + ", getIdNum()=" + getIdNum()
				+ ", getNoOfCopies()=" + getNoOfCopies() + ", getTitle()=" + getTitle() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
