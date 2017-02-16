package com.s2sh.annotation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="bookInfo_seq",initialValue=1,allocationSize=1)
public class BookInfo {
	private Integer bookId;
	private String bookName="";
	private Float bookPrice;
	private String bookAuthor;
	private Date bookPublishDate;
	private BookType bookType;
	
	@ManyToOne
	@JoinColumn(name="bookTypeId")
	public BookType getBookType() {
		return bookType;
	}
	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	
	@Id
	@GeneratedValue(generator="bookInfo_seq",strategy=GenerationType.SEQUENCE)
	public Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the bookPrice
	 */
	public Float getBookPrice() {
		return bookPrice;
	}
	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 * @return the bookAuthor
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * @param bookAuthor the bookAuthor to set
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 * @return the bookPublishDate
	 */
	public Date getBookPublishDate() {
		return bookPublishDate;
	}
	/**
	 * @param bookPublishDate the bookPublishDate to set
	 */
	public void setBookPublishDate(Date bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}
	
	
}
