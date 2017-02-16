package com.s2sh.annotation.book.service;

import com.s2sh.annotation.entity.BookInfo;
import com.s2sh.annotation.entity.PageBean;

/**
 * 书本信息的业务接口
 * @author Administrator
 *
 */
public interface BookInfoService {
	void addBookInfo(BookInfo book);
	void deleteBookInfo(BookInfo book);
	void updateBookInfo(BookInfo book);
	PageBean getPagingByBookInfo(PageBean pageBean,BookInfo book);
	BookInfo getBookInfoByBookId(BookInfo book);
	
}
