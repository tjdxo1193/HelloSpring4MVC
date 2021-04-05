package sungtae.spring.mvc.exam;

public class EMPVO {
    private int EMPNO;
    private String ENAME;
    private String JOB;
    private int MGR;
    private String HIREDATE;
    private int SAL;
    private int COMM;
    private int DEPTNO;

    public EMPVO() {
    }

    public EMPVO(int EMPNO, String ENAME, String JOB, int MGR, String HIREDATE, int SAL, int COMM, int DEPTNO) {
        this.EMPNO = EMPNO;
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.MGR = MGR;
        this.HIREDATE = HIREDATE;
        this.SAL = SAL;
        this.COMM = COMM;
        this.DEPTNO = DEPTNO;
    }

    public EMPVO(int EMPNO, String ENAME, String JOB, int MGR) {
        this.EMPNO = EMPNO;
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.MGR = MGR;
    }

    public EMPVO(String ENAME, String JOB, int MGR, String HIREDATE, int SAL, int COMM, int DEPTNO) {
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.MGR = MGR;
        this.HIREDATE = HIREDATE;
        this.SAL = SAL;
        this.COMM = COMM;
        this.DEPTNO = DEPTNO;
    }

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public int getMGR() {
        return MGR;
    }

    public void setMGR(int MGR) {
        this.MGR = MGR;
    }

    public String getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(String HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public int getSAL() {
        return SAL;
    }

    public void setSAL(int SAL) {
        this.SAL = SAL;
    }

    public int getCOMM() {
        return COMM;
    }

    public void setCOMM(int COMM) {
        this.COMM = COMM;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }
}
