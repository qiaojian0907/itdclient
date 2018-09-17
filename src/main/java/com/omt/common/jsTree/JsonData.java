package com.omt.common.jsTree;

import java.util.List;

/**
 * @author wangbl
 *
 * @Date  2015年8月31日 下午2:52:32
 */
public class JsonData {
	int total_rows=0;
	List page_data;
	String filter_error="";
	String debug_message="";
	/**
	 * @return the total_rows
	 */
	public int getTotal_rows() {
		return total_rows;
	}
	/**
	 * @param total_rows the total_rows to set
	 */
	public void setTotal_rows(int total_rows) {
		this.total_rows = total_rows;
	}
	/**
	 * @return the page_data
	 */
	public List getPage_data() {
		return page_data;
	}
	/**
	 * @param page_data the page_data to set
	 */
	public void setPage_data(List page_data) {
		this.page_data = page_data;
	}
	
	/**
	 * @return the filter_error
	 */
	public String getFilter_error() {
		return filter_error;
	}
	/**
	 * @param filter_error the filter_error to set
	 */
	public void setFilter_error(String filter_error) {
		this.filter_error = filter_error;
	}
	/**
	 * @return the debug_message
	 */
	public String getDebug_message() {
		return debug_message;
	}
	/**
	 * @param debug_message the debug_message to set
	 */
	public void setDebug_message(String debug_message) {
		this.debug_message = debug_message;
	}

}
