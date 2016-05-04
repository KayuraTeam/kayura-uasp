/**
 * Copyright 2015-2016 the original author or authors.
 * HomePage: http://www.kayura.org
 */
package org.kayura.uasp.service;

import java.util.List;

import org.kayura.type.GeneralResult;
import org.kayura.type.PageList;
import org.kayura.type.PageParams;
import org.kayura.type.Result;
import org.kayura.uasp.po.Company;
import org.kayura.uasp.po.OrganizeItem;

/**
 * @author liangxia@live.com
 */
public interface OrganizeService {

	/**
	 * 查询组织机构树型数据.
	 * 
	 * @param tenantId 租户Id,必需.
	 * @param parentId 可选值为 'NULL', null, 值.
	 * @return
	 */
	Result<List<OrganizeItem>> findOrgTree(String tenantId, String parentId);

	/**
	 * 以分页的方式获取组织机构数据.
	 * 
	 * @param tenantId 租户Id,必需.
	 * @param parentId 可选值.
	 * @param keyword 搜索关键字.
	 * @param pageParams 分页参数信息.
	 * @return
	 */
	Result<PageList<OrganizeItem>> findOrgItems(String tenantId, String parentId, String keyword, PageParams pageParams);

	GeneralResult removeOrgItem(String orgId);
	
	Result<Company> getCompanyById(String id);

	GeneralResult insertCompany(Company company);

	GeneralResult updateCompany(Company company);

	GeneralResult deleteCompany(String companyId);
}