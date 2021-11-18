package com.kh.almin.admin.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.almin.admin.model.dao.AdminDao;
import com.kh.almin.member.model.vo.Company;
import com.kh.almin.member.model.vo.Member;
import com.kh.almin.recruit.model.vo.Recruit;

@Service
public class AdminServiceImpl implements AdminService {
	private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);
	@Autowired
	private AdminDao adminDao;

	public List<Member> getMembers() throws Exception {
		logger.info("Service 로깅 확인");
		List<Member> members = adminDao.getMembers();
		return members;
	}

	public List<Company> getCompanies() throws Exception {
		logger.info("Service 로깅 확인");
		List<Company> companies = adminDao.getCompanies();
		return companies;
	}
	
	public List<Recruit> getReport() throws Exception {
		logger.info("Service 로깅 확인");
		List<Recruit> recruits = adminDao.getReport();
		return recruits;
	}
	
	public void deleteMember(String memberId) throws Exception {
		adminDao.deleteMember(memberId);

	}

	public void deleteCompany(String companyId) throws Exception {
		adminDao.deleteCompany(companyId);
	}
	
	public void deleteReport(String rtno) throws Exception {
		adminDao.deleteReport(rtno);
	}

}
