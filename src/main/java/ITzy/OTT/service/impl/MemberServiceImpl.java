package ITzy.OTT.service.impl;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ITzy.OTT.dao.MemberDao;
import ITzy.OTT.dao.impl.MemberDaoImpl;
import ITzy.OTT.dto.MemberDto;
import ITzy.OTT.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	// Dao 접근(생성) == MemberDao dao = new MemberDaoImpl();를 auto로
	@Autowired
	MemberDao dao;
	

	@Override
	public List<MemberDto> allMember() {
		return dao.allMember();
	}


	@Override
	public boolean idCheck(String id) {
		int count = dao.idCheck(id);
		return count>0?true:false;
	}


	@Override
	public boolean addMember(MemberDto dto) {
		int count = dao.addMember(dto);
		return count>0?true:false;
	}


	@Override
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	@Override
	public boolean BizAadmember(MemberDto dto) {
		int count = dao.BizAadmember(dto);
		return count>0?true:false;
	}
	@Override
	public MemberDto Bizlogin(MemberDto dto) {
		
		return dao.Bizlogin(dto);
	}

//	마이페이지
	@Override
	public boolean update_mypage(MemberDto dto){
		
		return dao.update_mypage(dto);
	}


	@Override
	public MemberDto mypage(String id) {
		return dao.mypage(id);
	}
	
	@Override
	public boolean pwdupdateAf(MemberDto dto){
		
		return dao.pwdupdateAf(dto);			
	}


	@Override
	public MemberDto pwdUpdate(String id) {
		return dao.pwdUpdate(id);
	}
}