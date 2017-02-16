/**
 * 
 */
package com.s2sh.annotation.book.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.s2sh.annotation.entity.BookInfo;
import com.s2sh.annotation.entity.PageBean;

/**
 * @author Administrator
 *
 */
@Repository // 标注数据持久层
@SuppressWarnings("all")
public class BookInfoDaoImpl implements BookInfoDao {
	
	// 把spring容器中实例化的sessionFactory对象注入到该类中
	@Resource(name="hibernateSessionFactory")
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.dao.BookInfoDao#addBookInfo(com.s2sh.annotation.entity.BookInfo)
	 */
	@Override
	public void addBookInfo(BookInfo book) {
		sessionFactory.getCurrentSession().persist(book);

	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.dao.BookInfoDao#deleteBookInfo(com.s2sh.annotation.entity.BookInfo)
	 */
	@Override
	public void deleteBookInfo(BookInfo book) {
		sessionFactory.getCurrentSession().delete(book);

	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.dao.BookInfoDao#updateBookInfo(com.s2sh.annotation.entity.BookInfo)
	 */
	@Override
	public void updateBookInfo(BookInfo book) {
		sessionFactory.getCurrentSession().update(book);

	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.dao.BookInfoDao#getBookInfos(com.s2sh.annotation.entity.PageBean, com.s2sh.annotation.entity.BookInfo)
	 */
	
	@Override
	public List<BookInfo> getBookInfos(PageBean pageBean, BookInfo book) {
		// 创建分页的StringBuffer对象
		StringBuffer condition = new StringBuffer("FROM BookInfo where 1=1");
		if(book!=null) {
			if(null!=book.getBookId()) {
				condition.append(" AND bookId="+book.getBookId());
			} 
			if(!"".equals(book.getBookName())) {
				condition.append(" AND bookName like '%"+book.getBookName()+"%'");
			}
			
			if(null!=book.getBookType() && book.getBookType().getBookTypeId()!=null) {
				condition.append(" AND bookType.bookTypeId="+book.getBookType().getBookTypeId());
			}
		}
		return sessionFactory.getCurrentSession().createQuery(condition.toString())
				.setFirstResult((pageBean.getCurrentPage()-1)*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize())
				.list();
	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.dao.BookInfoDao#getTotalRecords(com.s2sh.annotation.entity.BookInfo)
	 */
	@Override
	public Integer getTotalRecords(BookInfo book) {
		// 创建分页的StringBuffer对象
		StringBuffer condition = new StringBuffer("FROM BookInfo where 1=1");
		if(book!=null) {
			if(null!=book.getBookId()) {
				condition.append(" AND bookId="+book.getBookId());
			} 
			if(!"".equals(book.getBookName())) {
				condition.append(" AND bookName like '%"+book.getBookName()+"%'");
			}
			
			if(null!=book.getBookType() && book.getBookType().getBookTypeId()!=null) {
				condition.append(" AND bookType.bookTypeId="+book.getBookType().getBookTypeId());
			}
		}
		
		return sessionFactory.getCurrentSession().createQuery(condition.toString()).list().size();
	}

	/* (non-Javadoc)
	 * @see com.s2sh.annotation.book.dao.BookInfoDao#getBookInfoByBookId(com.s2sh.annotation.entity.BookInfo)
	 */
	@Override
	public BookInfo getBookInfoByBookId(BookInfo book) {
		return (BookInfo)sessionFactory.getCurrentSession().get(BookInfo.class, book.getBookId());
	}

}
