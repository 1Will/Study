package com.s2sh.annotation.book.dao;

import java.util.List;

import com.s2sh.annotation.entity.BookInfo;
import com.s2sh.annotation.entity.PageBean;

public interface BookInfoDao {
	void addBookInfo(BookInfo book);
	void deleteBookInfo(BookInfo book);
	void updateBookInfo(BookInfo book);
	List<BookInfo> getBookInfos(PageBean pageBean,BookInfo book);
	Integer getTotalRecords(BookInfo book);
	BookInfo getBookInfoByBookId(BookInfo book);
	
	// 获取所有的图书类型信息
}
