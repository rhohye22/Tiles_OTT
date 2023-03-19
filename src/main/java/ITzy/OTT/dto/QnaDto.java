package ITzy.OTT.dto;

import java.io.Serializable;

public class QnaDto implements Serializable{

	private int seq;
	private String id;
	private String title;
	private String content;
	private String wdate;
	
	public QnaDto() {}

	public QnaDto(int seq, String id, String title, String content, String wdate) {
		super();
		this.seq = seq;
		this.id = id;
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
		return "QnaDto [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content + ", wdate=" + wdate + "]";
	}
	
	
	
}
