package sungtae.spring.mvc.service;


import sungtae.spring.mvc.vo.SungJukVO;

import java.util.List;

public interface SungJukV13Service {

    String newSungJuk(SungJukVO sj);
    List<SungJukVO> readSungJuk();
    SungJukVO readOneSungJuk(String sjno);
    String modifySungJuk(SungJukVO sj);
    String removeSungJuk(String sjno);

}
