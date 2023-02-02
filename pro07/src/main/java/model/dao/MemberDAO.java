package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import database.connect.OracleConnection;
import model.dto.MemberDTO;

public class MemberDAO {
	
	private SqlSession session= OracleConnection.getSqlSession();

	public List<MemberDTO> selectAll() {
		List<MemberDTO> data =session.selectList("memberMapper.selectAll");
		return data;
	}

}
