package ITzy.OTT.dto;

import java.io.Serializable;

public class QnaDto implements Serializable{
	
	private int seq;
	private int ref;
	private String id;
	private String qtype;
	private String title;	
	private String content;
	private String wdate;
	private String mngid;
	private String answer;
	private String ansdate;
	
	public QnaDto() {}

	public QnaDto(int seq, int ref, String id, String qtype, String title, String content, String wdate, String mngid, String answer, String ansdate) {
		super();
		this.seq = seq;
		this.ref = ref;
		this.id = id;
		this.qtype = qtype;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
		this.mngid = mngid;
		this.answer = answer;
		this.ansdate = ansdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getMngid() {
		return mngid;
	}

	public void setMngid(String mngid) {
		this.mngid = mngid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnsdate() {
		return ansdate;
	}

	public void setAnsdate(String ansdate) {
		this.ansdate = ansdate;
	}

	@Override
	public String toString() {
		return "QnaDto [seq=" + seq + ", ref=" + ref + ", id=" + id + ", qtype=" + qtype + ", title=" + title + ", content=" + content + ", wdate=" + wdate + ", mngid=" + mngid + ", answer=" + answer + ", ansdate=" + ansdate + "]";
	}
	
	

	
}