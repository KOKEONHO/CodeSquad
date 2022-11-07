package precourse.week_01.mission02.presentation;

public class BoardChanged {

    private String title;
    private String content;
    private String writer;
    private String date;
    private int hitCnt;

    BoardChanged(String title) {
        this(title,"빼앵","로그인 한 회원 아이디");
    }

    BoardChanged(String title, String content) {
        this(title, content, "로그인 한 회원 아이디","현재 컴퓨터 날짜",0);
    }

    BoardChanged(String title, String content, String writer) {
        this(title, content, writer, "현재 컴퓨터 날짜", 0);
    }

    BoardChanged(String title, String content, String writer, String date) {
        this(title, content, writer, date, 0);
    }

    BoardChanged(String title, String content, String writer, String date, int hitCnt) {   // 공통 실행 코드
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitCnt = hitCnt;
    }

    @Override
    public String toString() {
        return "BoardChanged{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date='" + date + '\'' +
                ", hitCnt=" + hitCnt +
                '}';
    }
}
