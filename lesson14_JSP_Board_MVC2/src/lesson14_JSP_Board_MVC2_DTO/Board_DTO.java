package lesson14_JSP_Board_MVC2_DTO;

public class Board_DTO {
//	멤버변수
	private int board_idx;
	private String board_title;
	private String board_writer;
	private String board_writedate;
	private String board_count;
	private String board_content;

//	기본생성자
	public Board_DTO() {
		// TODO Auto-generated constructor stub
	}

//	커스텀생성자
	public Board_DTO(int board_idx, String board_title, String board_writer, String board_writedate, String board_count,
			String board_content) {
		super();
		this.board_idx = board_idx;
		this.board_title = board_title;
		this.board_writer = board_writer;
		this.board_writedate = board_writedate;
		this.board_count = board_count;
		this.board_content = board_content;
	}

//	GETTER & SETTER
	public int getBoard_idx() {
		return board_idx;
	}

	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public String getBoard_writedate() {
		return board_writedate;
	}

	public void setBoard_writedate(String board_writedate) {
		this.board_writedate = board_writedate;
	}

	public String getBoard_count() {
		return board_count;
	}

	public void setBoard_count(String board_count) {
		this.board_count = board_count;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	
	
}
