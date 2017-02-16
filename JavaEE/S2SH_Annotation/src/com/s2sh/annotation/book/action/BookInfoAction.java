/**
 * 
 */
package com.s2sh.annotation.book.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.s2sh.annotation.book.service.BookInfoService;
import com.s2sh.annotation.entity.BookInfo;
import com.s2sh.annotation.entity.PageBean;

/**
 * @author Administrator
 *
 */
@Controller // 标注控制层对象
public class BookInfoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Resource(name="bookInfoServiceImpl")
	private BookInfoService bookInfoService;
	
	private List<BookInfo> books;
	private PageBean pageBean;
	private BookInfo book;
	
	
	/**
	 * @return the book
	 */
	public BookInfo getBook() {
		return book;
	}



	/**
	 * @param book the book to set
	 */
	public void setBook(BookInfo book) {
		this.book = book;
	}



	/**
	 * @return the pageBean
	 */
	public PageBean getPageBean() {
		return pageBean;
	}



	/**
	 * @param pageBean the pageBean to set
	 */
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}



	/**
	 * @return the books
	 */
	public List<BookInfo> getBooks() {
		return books;
	}



	/**
	 * @param books the books to set
	 */
	public void setBooks(List<BookInfo> books) {
		this.books = books;
	}



	public String showBookInfoList() {
		pageBean.setPageSize(5);
		this.setPageBean(bookInfoService.getPagingByBookInfo(pageBean, book));
		return SUCCESS;
	}

}
