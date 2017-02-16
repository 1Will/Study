package com.s2sh.annotation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="bookType_seq",initialValue=1,allocationSize=1)
public class BookType {
	private Integer bookTypeId;
	private String  bookTypeName;


	@Id
	@GeneratedValue(generator="bookType_seq",strategy=GenerationType.SEQUENCE)
	public Integer getBookTypeId() {
		return bookTypeId;
	}
	/**
	 * @param bookTypeId the bookTypeId to set
	 */
	public void setBookTypeId(Integer bookTypeId) {
		this.bookTypeId = bookTypeId;
	}
	/**
	 * @return the bookTypeName
	 */
	public String getBookTypeName() {
		return bookTypeName;
	}
	/**
	 * @param bookTypeName the bookTypeName to set
	 */
	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}
}	
