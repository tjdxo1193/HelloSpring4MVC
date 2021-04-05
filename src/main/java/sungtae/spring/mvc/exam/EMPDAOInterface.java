package sungtae.spring.mvc.exam;

import java.util.ArrayList;

public interface EMPDAOInterface {

    String insertEmp(EMPVO em);
    ArrayList<EMPVO> selectEmp();
    EMPVO selectOneEmp(int EMPNO);
}
