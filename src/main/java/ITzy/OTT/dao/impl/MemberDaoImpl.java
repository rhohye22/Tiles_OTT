package ITzy.OTT.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ITzy.OTT.dao.MemberDao;
import ITzy.OTT.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	// MyBatis 접근(생성)
	@Autowired	// 자동생성 mybatis에서 SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
				// + SqlSession session = factory.openSession();
	SqlSession session;
	
	String ns = "Member.";		//namespace
	

	@Override
	public List<MemberDto> allMember() {
//		return session.selectList("Member." + "allMember");
		return session.selectList("Member.allMember");
	}


	@Override
	public int idCheck(String id) {
		return session.selectOne(ns + "idcheck", id);
	}


	@Override
	public int addMember(MemberDto dto) {
		return session.insert(ns +"addmember", dto);
	}


	@Override
	public MemberDto login(MemberDto dto) {
		MemberDto mem = session.selectOne(ns + "login", dto);
		return mem;
	}
	
	@Override
	public int BizAadmember(MemberDto dto) {
		return session.insert(ns +"BizAadmember", dto);
	}
	
	@Override
	public MemberDto Bizlogin(MemberDto dto) {
		MemberDto mem = session.selectOne(ns + "Bizlogin", dto);
		return mem;
	}


//	마이페이지
	@Override
	public boolean update_mypage(MemberDto dto){
		int count = session.update(ns + "update_mypage", dto);
		return count>0?true:false;
	}


	@Override
	public MemberDto mypage(String id) {
		MemberDto dto = session.selectOne(ns + "mypage", id);
		return dto;
	}


	@Override
	public boolean pwdupdateAf(MemberDto dto) {
		int count = session.update(ns + "pwdupdateAf", dto);
		return count>0?true:false;
	}


	@Override
	public MemberDto pwdUpdate(String id) {
		MemberDto dto = session.selectOne(ns+ "pwdUpdate", id);
		return dto;
	}
}
