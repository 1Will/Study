package com.s2sh.annotation.entity;

import java.util.List;

public class PageBean {
	
	private Integer totalRecords;
	private Integer totalPages;
	private Integer pageSize;
	private Integer currentPage;
	private List<?> list;
	/**
	 * @return the totalRecords
	 */
	public Integer getTotalRecords() {
		return totalRecords;
	}
	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	/**
	 * @return the totalPages
	 */
	public Integer getTotalPages() {
		return totalPages;
	}
	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the list
	 */
	public List<?> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<?> list) {
		this.list = list;
	}
	
	
}
