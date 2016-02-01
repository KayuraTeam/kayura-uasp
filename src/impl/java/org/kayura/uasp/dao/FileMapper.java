/**
 * Copyright 2015-2016 the original author or authors.
 * HomePage: http://www.kayura.org
 */
package org.kayura.uasp.dao;

import java.util.List;
import java.util.Map;

import org.kayura.core.BaseDao;
import org.kayura.uasp.po.FileInfo;
import org.kayura.uasp.po.FileRelation;

/**
 * @author liangxia@live.com
 */
public interface FileMapper extends BaseDao {

	// FileInfo

	/**
	 * 保存一条文件信息记录至数据库.
	 * 
	 * @param fileInfo {@link FileInfo } 实例对象.
	 */
	void insertFileInfo(FileInfo fileInfo);

	/**
	 * 获取一个符合条件的文件信息记录.
	 * 
	 * @param fileId 文件主键Id.
	 * @return 返回 {@link FileInfo }
	 */
	FileInfo getFileInfoById(String fileId);

	/**
	 * 更新文件信息字段.
	 * 
	 * @param args 指定的字段名及更新值.
	 */
	void updateFileInfo(Map<String, Object> args);

	/**
	 * 通过文件的Md5值读取到主键值信息.
	 * 
	 * @param md5 文件生成的Md5值.
	 * @return 返回相应的主键值 或者为 null.
	 */
	String getFileInfoKeyByMd5(String md5);

	/**
	 * 检查指定条件下的文件信息是否存在.
	 * 
	 * @param args 支持条件有: fileId, md5.
	 * @return 若存在返回 true 否则返回 false.
	 */
	Boolean fileInfoExistsByMap(Map<String, Object> args);

	// FileRelation

	/**
	 * 保存一个文件关系记录.
	 * 
	 * @param fileRelation {@link FileRelation} 实例对象.
	 */
	void insertFileRelation(FileRelation fileRelation);

	/**
	 * 更新文件关联信息字段.
	 * 
	 * @param args 指定的字段名及更新值.
	 */
	void updateFileRelation(Map<String, Object> args);

	/**
	 * 获取单条文件关系记录.
	 * 
	 * @param frId 文件关系ID.
	 * @return 返回一条文件关系记录.
	 */
	FileRelation getFileRelationById(String frId);

	/**
	 * 获取文件关联信息的标签内容.
	 * 
	 * @param frId 文件关系ID.
	 * @return 返回标签内容.
	 */
	String getFileRelationTagsById(String firId);
	
	/**
	 * 查找所有符件条件的文件关系记录集.
	 * 
	 * @param args 支持条件有: fileId (文件Id), bizId (关联业务Id), category (分类), uploader
	 *            (上传者), tags (标签）
	 * @return 返回所有符件条件的记录
	 */
	List<FileRelation> findFileRelationsByMap(Map<String, Object> args);

}
