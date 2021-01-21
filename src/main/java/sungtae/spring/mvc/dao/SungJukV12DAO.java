package sungtae.spring.mvc.dao;

import sungtae.spring.mvc.vo.SungJukVO;

import java.util.List;

public interface SungJukV12DAO {
    String insertSungJuk(SungJukVO sj);
    List<SungJukVO> selectSungJuk();
    SungJukVO selectOneSungJuk(String sjno);
    String updateSungJuk(SungJukVO sj);
    String deleteSungJuk(int sjno);
}
