package sungtae.spring.mvc.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class EMPService extends GenericEMPService {


    public EMPDAOInterface empdao = new EMPDAOService();


    @Override
    public void newEMP() {
        String ENAME;
        String JOB;
        int MGR;
        String HIREDATE;
        int SAL;
        int COMM;
        int DEPTNO;

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 이름을 입력하시오 :");
        ENAME = sc.nextLine();
        System.out.print("직책을 입력하시오 :");
        JOB = sc.nextLine();
        System.out.print("입사일을 입력하시오 :");
        HIREDATE = sc.nextLine();
        System.out.print("상사번호를 입력하시오 :");
        MGR = sc.nextInt();
        System.out.print("연봉을 입력하시오 :");
        SAL = sc.nextInt();
        System.out.print("커미션을 입력하시오 :");
        COMM = sc.nextInt();
        System.out.print("부서번호를 입력하시오 :");
        DEPTNO = sc.nextInt();
        EMPVO em = new EMPVO(ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO);

        String result = empdao.insertEmp(em);
        System.out.println(result);
    }

    @Override
    public void showEMP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s\n";

        String result = String.format(fmt,
                "EMPNO", "ENAME", "JOB", "MGR");
        sb.append(result);

        ArrayList<EMPVO> emps = empdao.selectEmp();

        for (EMPVO emp : emps) {
            result = String.format(fmt, emp.getEMPNO(), emp.getENAME(),
                    emp.getJOB(), emp.getMGR());
            sb.append(result);
        }

    }

    public void showOneEMP() {
        String fmt = "직원 번호: %10s ,직원 이름: %10s ,직책: %10s ,입사 날짜: %10s ,\n" +
                "상사 번호: %10s ,연봉: %10s ,커미션: %10s,부서 번호: %10s \n";

        //상세조회할 사원번호 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사번 : ");
        int empno = sc.nextInt();

        EMPVO em = empdao.selectOneEmp(empno);

        String result = String.format(fmt, em.getEMPNO(), em.getENAME(), em.getJOB(), em.getHIREDATE(), em.getSAL(), em.getCOMM(),
                em.getMGR(), em.getDEPTNO());

        System.out.println(result);
    }


}

