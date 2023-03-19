package ITzy.OTT.dao;

import java.util.List;

import ITzy.OTT.dto.MemberDto;

public interface MemberDao {
	List<MemberDto> allMember();
	int idCheck(String id);
	int addMember(MemberDto dto);
	MemberDto login(MemberDto dto);
	int BizAadmember(MemberDto dto);
	MemberDto Bizlogin(MemberDto dto);
	
	public boolean update_mypage(MemberDto dto);
	MemberDto mypage (String id);
	
	MemberDto pwdUpdate (String id);
	public boolean pwdupdateAf(MemberDto dto);
}
