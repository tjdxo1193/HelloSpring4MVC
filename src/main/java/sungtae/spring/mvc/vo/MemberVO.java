package sungtae.spring.mvc.vo;

public class MemberVO {

    private String userid;
    private String passwd;
    private String name;
    private String grade;
    private int points;
    private String regdate;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String redgate) {
        this.regdate = redgate;
    }
}
