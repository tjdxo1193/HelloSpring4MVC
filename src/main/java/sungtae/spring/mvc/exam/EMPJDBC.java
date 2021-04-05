package sungtae.spring.mvc.exam;

public class EMPJDBC extends JDBCUtil{
    public static String insertEmp =
            "insert into EMP (ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)"+
                    "values (?,?,?,?,?,?,?);";
    public static String selectEmp =
            " select EMPNO, ENAME, JOB, MGR " +
                    "from EMP ";
    public static String selectOneEmp =
            " select * from EMP where EMPNO = ? ";
}