package sungtae.spring.mvc.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sungtae.spring.mvc.vo.MemberVO;

import java.util.List;

@Repository("mdao04")
public class MemberDAO04 implements MemberDAO{

    @Autowired
    private SqlSession sqlSession;
    // mybatis 사용하기 위해
    // SqlSession 객체를 MemberDAO03에 DI함

    // 회원정보 생성
    public int insertMember(MemberVO mvo){
        return sqlSession.insert("member.insertMember", mvo);
    }

    // 회원정보 수정
    public int updateMember(MemberVO mvo) {
        return sqlSession.update("member.updateMember", mvo);
    }

    // 회원정보 삭제
    public int deleteMember(String name) {
        return sqlSession.delete("member.deleteMember", name);
    }

    // 회원정보 조회
    public List<MemberVO> selectMember() {
        return sqlSession.selectList("member.selectList");
    }

    // 회원정보 상세조회
    public MemberVO selectOneMember(String userid) {
        return sqlSession.selectOne("member.selectOne", userid);
    }


}
