package ITzy.OTT.dto;

import java.io.Serializable;

public class QnaDto implements Serializable{

	private int seq;
	private String id;
	private String qtype;
	private String title;	
	private String content;
	private String wdate;
	
	public QnaDto() {}

	public QnaDto(int seq, String id, String qtype, String title, String content, String wdate) {
		super();
		this.seq = seq;
		this.id = id;
		this.qtype = qtype;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
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

	@Override
	public String toString() {
		return "QnaDto [seq=" + seq + ", id=" + id + ", qtype=" + qtype + ", title=" + title + ", content=" + content + ", wdate=" + wdate + "]";
	}

	
}
