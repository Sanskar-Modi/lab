package lab1.inheritanceandpolymprphism;

public class MediaItem extends Item {
	MediaItem(int idNum, int noOfCopies, String title) {
		super(idNum, noOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + ", getRunTime()=" + getRunTime() + ", toString()=" + super.toString()
				+ ", getIdNum()=" + getIdNum() + ", getNoOfCopies()=" + getNoOfCopies() + ", getTitle()=" + getTitle()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	// variable
	private int runTime;

	// getters and setters
	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
}
