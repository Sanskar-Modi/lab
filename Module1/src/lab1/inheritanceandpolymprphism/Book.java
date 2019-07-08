package lab1.inheritanceandpolymprphism;

public class Book extends WrittenItem {
	
	
      Book(int idNum, int noOfCopies, String title) {
		super(idNum, noOfCopies, title);
		// TODO Auto-generated constructor stub
	}
      Book()
      {
    	  
      }
	public static void main(String[] args) {
	
	}
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
		return "Book [getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + ", getIdNum()=" + getIdNum()
				+ ", getNoOfCopies()=" + getNoOfCopies() + ", getTitle()=" + getTitle() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
