package dev.mvc.notice;

public class Member_Notice_VO {
//	SELECT m.memberno as m_memberno, m.mname as m_mname,
//    b.boardno, b.memberno, b.title, b.content, b.board_passwd, b.visible, b.cnt
//FROM member m, board b
//WHERE (m.memberno = b.memberno) AND m.memberno = 1;
	
	// member table
	private int m_memberno;
	private String m_mname;
	
	// board table
	/** 글 번호 */
	private int boardno;
	
	/** 회원 번호 */
	private int memberno;
	
	/** 제목 */
	private String title;
	
	/** 글 내용 */
	private String content;
	
	/** 비밀번호 */
	private String board_passwd;
	
	/** 조회수 */
	private int cnt;

	public int getM_memberno() {
		return m_memberno;
	}

	public void setM_memberno(int m_memberno) {
		this.m_memberno = m_memberno;
	}

	public String getM_mname() {
		return m_mname;
	}

	public void setM_mname(String m_mname) {
		this.m_mname = m_mname;
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
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

	public String getBoard_passwd() {
		return board_passwd;
	}

	public void setBoard_passwd(String board_passwd) {
		this.board_passwd = board_passwd;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
