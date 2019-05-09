package com.bootdo.proposal.dao;

import com.bootdo.proposal.domain.FhhzDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 复函回执
 * @author shipan
 * @email 
 * @date 2018-10-24 15:13:09
 */
@Mapper
public interface FhhzDao {

	FhhzDO get(Integer id);
	
	List<FhhzDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(FhhzDO fhhz);
	
	int update(FhhzDO fhhz);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	
	List<Map<String, Object>> listMap(Map<String,Object> map);
	
	int countMap(Map<String,Object> map);
}
