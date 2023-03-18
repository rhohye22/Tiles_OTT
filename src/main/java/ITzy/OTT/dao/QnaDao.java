package ITzy.OTT.dao;

import java.util.List;

import ITzy.OTT.dto.QnaDto;

public interface QnaDao {
	List<QnaDto> myQna();
	int addQna(QnaDto dto);

}