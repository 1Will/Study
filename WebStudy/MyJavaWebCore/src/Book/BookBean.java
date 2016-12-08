package Book;

public class BookBean {
	private String bookName="";
	private int BookNum=1;
	public BookBean(){
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookname) {
		bookName = bookname;
	}
	public int getBookNum() {
		return BookNum;
	}
	public void setBookNum(int bookNum) {
		BookNum = bookNum;
	}
}
