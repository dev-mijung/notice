package dev.mvc.notice;

public class NoticeVO {
//      boardno      NUMBER(6) NOT NULL, 
//      title        VARCHAR(300)   NOT NULL, 
//      content      CLOB   NOT NULL, 
//      board_passwd       VARCHAR(15)  NOT NULL,
//      cnt         NUMBER(20)   NOT NULL
        
  /** 글 번호 */
  private int boardno;
  
  /** 회원 번호 */
  private int memberno;
  
  /** 제목 */
  private String title;
  
  /** 글 내용 */
  private String content;
  
  /** 비밀번호 설정 여부 */
  private String visible;
  
  /** 비밀번호 */
  private String board_passwd;
  
  /** 조회수 */
  private int cnt;
  
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
  
  public String getVisible() {
	return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
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