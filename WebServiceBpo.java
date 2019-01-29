package com.yinhai.common.webservice.service;


import com.yinhai.common.webservice.domain.DataDomain;

/**
 * webservice业务逻辑接口，供银海系统内部调用
 * @author 罗炜
 *
 */
public interface WebServiceBpo {
	
	/**
	 * 查询信息的总控方法
	 * @param domain
	 * @return
	 */
	public DataDomain queryByService(DataDomain domain);
	
	/**
	 * 上传信息的总控方法
	 * @param domain
	 * @return
	 */
	public DataDomain uploadByService(DataDomain domain);
}
