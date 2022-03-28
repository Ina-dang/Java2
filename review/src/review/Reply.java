package review;

public class Reply {
	/*
	 * String content, String date, String writer, int score
	 */
	
	private String content;
	private String date;
	private String writer;
	int score;
	
	float avg;
	
	public Reply () {	}
	
	public Reply(String content, String date, String writer, int score) {
		this.content = content;
		this.date = date;
		this.writer = writer;
		this.score = score;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %s %n", content, date, writer, score);
	}

	public int getScore() {
		return (int)((score * 100) - 0.5) / 100;
	}
	
}
