package ITzy.OTT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ITzy.OTT.dto.QnaDto;
import ITzy.OTT.service.QnaService;

@Controller
public class QnaController {

	@Autowired
	QnaService service;
	
	@RequestMapping(value = "qna.do", method = RequestMethod.GET)
	public String qna() {
		return "qna/qna";
	}
	
	@RequestMapping(value = "qnawrite.do", method = RequestMethod.GET)
	public String qnawrite() {
		return "qna/qnawrite";
	}
	
	@RequestMapping(value = "qnawriteAf.do", method = RequestMethod.POST)
	public String qnawriteAf(QnaDto dto, Model model) {
		boolean isS = service.addQna(dto);
		String qnawriteAf = "";
		if (isS) {
			qnawriteAf = "Q_ADD_YES";
		}else {
			qnawriteAf = "Q_ADD_NO";
		}
		model.addAttribute("qnawriteAf", qnawriteAf);
		return "message";
		
	}
	
	
	
}
