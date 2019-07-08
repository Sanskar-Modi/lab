package lab1.inheritanceandpolymprphism;

public class CD extends MediaItem {
	CD(int idNum, int noOfCopies, String title) {
		super(idNum, noOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	// variable
	private String artist,genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// getters and setters
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
//overrided method

	@Override
	public int getRunTime() {
		// TODO Auto-generated method stub
		return super.getRunTime();
	}

	@Override
	public void setRunTime(int runTime) {
		// TODO Auto-generated method stub
		super.setRunTime(runTime);
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", getGenre()=" + getGenre() + ", getArtist()="
				+ getArtist() + ", getRunTime()=" + getRunTime() + ", getIdNum()=" + getIdNum() + ", getNoOfCopies()="
				+ getNoOfCopies() + ", getTitle()=" + getTitle() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public int getIdNum() {
		// TODO Auto-generated method stub
		return super.getIdNum();
	}

	@Override
	public void setIdNum(int idNum) {
		// TODO Auto-generated method stub
		super.setIdNum(idNum);
	}

	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}

	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	void addItem(int idNum, int noOfCopies, String title) {
		// TODO Auto-generated method stub
		super.addItem(idNum, noOfCopies, title);
	}
}
