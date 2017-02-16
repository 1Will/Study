/**
 * 
 */
package com.s2sh.annotation.book.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.s2sh.annotation.book.dao.BookInfoDao;
import com.s2sh.annotation.entity.BookInfo;
import com.s2sh.annotation.entity.PageBean;

/**
 * @author Administrator
 *
 */
@Service // 标注业务层对象
public class BookInfoServiceImpl implements BookInfoService {
	
	@Resource(name="bookInfoDaoImpl")
	private BookInfoDao bookDao;

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.BookInfoService#addBookInfo(com.s2sh.annotation.entity.BookInfo)
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void addBookInfo(BookInfo book) {
		bookDao.addBookInfo(book);

	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.BookInfoService#deleteBookInfo(com.s2sh.annotation.entity.BookInfo)
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteBookInfo(BookInfo book) {
		bookDao.deleteBookInfo(book);

	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.BookInfoService#updateBookInfo(com.s2sh.annotation.entity.BookInfo)
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void updateBookInfo(BookInfo book) {
		bookDao.updateBookInfo(book);

	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.BookInfoService#getPagingByBookInfo(com.s2sh.annotation.entity.PageBean, com.s2sh.annotation.entity.BookInfo)
	 */
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public PageBean getPagingByBookInfo(PageBean pageBean, BookInfo book) {
		
		// 获取分页的总记录数
		Integer totalRecords = bookDao.getTotalRecords(book);
		// 计算总页数
		Integer totalPages = totalRecords%pageBean.getPageSize()==0?
				totalRecords/pageBean.getPageSize():
					totalRecords/pageBean.getPageSize()+1;
		// 构建分页对象
		PageBean page = new PageBean();
		page.setTotalRecords(totalRecords);
		page.setTotalPages(totalPages);
		page.setPageSize(pageBean.getPageSize());
		page.setCurrentPage(pageBean.getCurrentPage());
		page.setList(bookDao.getBookInfos(pageBean, book));
		
		return page;
	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.BookInfoService#getBookInfoByBookId(com.s2sh.annotation.entity.BookInfo)
	 */
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public BookInfo getBookInfoByBookId(BookInfo book) {
		return bookDao.getBookInfoByBookId(book);
	}

}
