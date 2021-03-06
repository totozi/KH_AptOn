package kh.teamproject.apton.common_energy_usage.model.service;

 

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kh.teamproject.apton.common_energy_usage.model.dao.CommonUsageDao;
import kh.teamproject.apton.common_energy_usage.model.vo.CommonUsage;

 

@Service("ComUsageService")

public class CommonUsageService {

	@Autowired
	private CommonUsageDao commonUsageDao;
	
	public CommonUsage selecet(int cost_num) {
		return commonUsageDao.selectOne(cost_num);
	}
//	public List<CommonUsage> price(String date) {

//		return commonUsageDao.allprice(date);

//	}

	public List<CommonUsage> price(int cost_num){
		return commonUsageDao.price(cost_num);
	}

}