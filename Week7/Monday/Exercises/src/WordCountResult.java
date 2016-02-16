
public class WordCountResult {
	private int words;
	private int lines;
	private int chars;
		
	public WordCountResult(int words, int lines, int chars) {
		setWords(words);
		setLines(lines);
		setChars(chars);
	}
	
	public int getWords() {
		return this.words;
	}
	public void setWords(int words) {
		this.words = words;
	}
	public int getLines() {
		return this.lines;
	}
	public void setLines(int lines) {
		this.lines = lines;
	}
	public int getChars() {
		return this.chars;
	}
	public void setChars(int chars) {
		this.chars = chars;
	}
	
	
}
