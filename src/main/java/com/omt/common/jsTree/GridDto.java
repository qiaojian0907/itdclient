package com.omt.common.jsTree;

import java.util.List;
import java.util.Map;

/**
 * @author wangbl
 *
 * @Date  2015年8月31日 下午11:35:35
 */
public class GridDto {
	int page_num =0;
	int rows_per_page=0;
	private List<Map> columns;
	private List<Map> sorting;
	private List<Map> page_par;
	String debug_mode="";
	/**
	 * @return the page_num
	 */
	public int getPage_num() {
		return page_num;
	}
	/**
	 * @param page_num the page_num to set
	 */
	public void setPage_num(int page_num) {
		this.page_num = page_num;
	}
	/**
	 * @return the rows_per_page
	 */
	public int getRows_per_page() {
		return rows_per_page;
	}
	/**
	 * @param rows_per_page the rows_per_page to set
	 */
	public void setRows_per_page(int rows_per_page) {
		this.rows_per_page = rows_per_page;
	}
	/**
	 * @return the columns
	 */
	public List<Map> getColumns() {
		return columns;
	}
	/**
	 * @param columns the columns to set
	 */
	public void setColumns(List<Map> columns) {
		this.columns = columns;
	}
	/**
	 * @return the sorting
	 */
	public List<Map> getSorting() {
		return sorting;
	}
	/**
	 * @param sorting the sorting to set
	 */
	public void setSorting(List<Map> sorting) {
		this.sorting = sorting;
	}
	/**
	 * @return the page_par
	 */
	public List<Map> getPage_par() {
		return page_par;
	}
	/**
	 * @param page_par the page_par to set
	 */
	public void setPage_par(List<Map> page_par) {
		this.page_par = page_par;
	}
	/**
	 * @return the debug_mode
	 */
	public String getDebug_mode() {
		return debug_mode;
	}
	/**
	 * @param debug_mode the debug_mode to set
	 */
	public void setDebug_mode(String debug_mode) {
		this.debug_mode = debug_mode;
	}

}
