package com.bootdo.proposal.service;

import com.bootdo.proposal.domain.FhhzDO;

import java.util.List;
import java.util.Map;

/**
 * 复函回执
 * 
 * @author shipan
 * @email 
 * @date 2018-10-24 15:13:09
 */
public interface FhhzService {
	
	FhhzDO get(Integer id);
	
	List<FhhzDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FhhzDO fhhz);
	
	int update(FhhzDO fhhz);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	
	List<Map<String, Object>> listMap(Map<String,Object> map);
	
	int countMap(Map<String,Object> map);
}
