package ITzy.OTT.service;

import java.util.List;

import ITzy.OTT.dto.MemberDto;


public interface MemberService {
	List<MemberDto> allMember();
	MemberDto login(MemberDto dto);
	boolean idCheck(String id);
	boolean addMember(MemberDto dto);
	MemberDto Bizlogin(MemberDto dto);
	boolean BizAadmember(MemberDto dto);
	
	boolean update_mypage(MemberDto dto);
	MemberDto mypage (String id);
	boolean pwdupdateAf(MemberDto dto);
	MemberDto pwdUpdate(String id);
}
