package ITzy.OTT.service;

import java.util.List;

import ITzy.OTT.dto.QnaDto;

public interface QnaService {
	List<QnaDto> myQna();
	boolean addQna(QnaDto dto);

}
