package sungtae.spring.mvc.dao;

import sungtae.spring.mvc.vo.MemberVO;

import java.util.List;

public interface MemberDAO {

    int insertMember(MemberVO mvo);
    int updateMember(MemberVO mvo);
    public int deleteMember(String name);
    public List<MemberVO> selectMember();
    public MemberVO selectOneMember(String userid);
}
