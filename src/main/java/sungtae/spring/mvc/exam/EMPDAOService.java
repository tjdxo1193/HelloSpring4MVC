package sungtae.spring.mvc.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EMPDAOService implements EMPDAOInterface{
    @Override
    public String insertEmp(EMPVO em) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        String result = "사원데이터 처리중....?!?";
        conn = EMPJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EMPJDBC.insertEmp);
            pstmt.setString(1, em.getENAME());
            pstmt.setString(2, em.getJOB());
            pstmt.setInt(3, em.getMGR());
            pstmt.setString(4, em.getHIREDATE());
            pstmt.setInt(5, em.getSAL());
            pstmt.setDouble(6, em.getCOMM());
            pstmt.setInt(7, em.getDEPTNO());
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) result = "사원데이터 저장완료!";
        } catch (SQLException ex) {
            System.out.println("insertSQL문 오류!!");
        }
        EMPJDBC.destoryConn(conn, pstmt);
        return result;
    }

    @Override
    public ArrayList<EMPVO> selectEmp() {
        ArrayList<EMPVO> eml = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = EMPJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EMPJDBC.selectEmp);
            rs  = pstmt.executeQuery();
            while(rs.next()){
                EMPVO em = new EMPVO(
                        rs.getInt(1), // EMPNO
                        rs.getString(2), //ENAME
                        rs.getString(3), //JOB
                        rs.getInt(4));// MGR
                eml.add(em);
            }
        } catch (SQLException ex) {
            System.out.println("selectEmp에서 오류발생!!");
            ex.printStackTrace();
        }
        EMPJDBC.destoryConn(conn, pstmt);
        return eml;
    }

    @Override
    public EMPVO selectOneEmp(int empno) {
        EMPVO em = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = EMPJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(EMPJDBC.selectOneEmp);
            pstmt.setInt(1, empno);
            rs  = pstmt.executeQuery();
            if (rs.next()){
                em = new EMPVO(rs.getInt(1), // EMPNO
                        rs.getString(2), // EMPNAME
                        rs.getString(3), // JOB
                        rs.getInt(4), // MGR
                        rs.getString(5), // HIREDATE
                        rs.getInt(6), // SAL
                        rs.getInt(7), // COMM
                        rs.getInt(8)); // DEPTNO
            }
        } catch (SQLException ex) {
            System.out.println("selectOneEmp에서 오류발생!!");
            ex.printStackTrace();
        }
        EMPJDBC.destoryConn(conn,pstmt,rs);
        return em;
    }
}