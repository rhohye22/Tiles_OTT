package ITzy.OTT.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ITzy.OTT.dao.QnaDao;
import ITzy.OTT.dto.QnaDto;

@Repository
public class QnaDaoImpl implements QnaDao {

	@Autowired
	SqlSession session;

	String ns = "Qna.";

	@Override
	public List<QnaDto> myQna() {
		return session.selectList("Qna.myQna");
	}

	@Override
	public int addQna(QnaDto dto) {
		return session.insert(ns+"addQna");
	}
}
