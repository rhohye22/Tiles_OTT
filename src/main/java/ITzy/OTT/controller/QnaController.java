package ITzy.OTT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
}
