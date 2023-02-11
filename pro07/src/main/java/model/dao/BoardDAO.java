package model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import database.connect.OracleConnection;
import model.dto.BoardDTO;

public class BoardDAO {
	private SqlSession session= OracleConnection.getSqlSession();
	public void commit() {
		session.commit();
	}
	public void close() {
		
		session.close();
	}
	public void rollback() {
		session.rollback();
	}

	public List<BoardDTO> selectAll() {
		List<BoardDTO> data = session.selectList("boardMapper.selectAll");
		return data;
	}
	public int totalRowNum() {
		int row = session.selectOne("boardMapper.rowNum");
		return row;
	}
	public List<BoardDTO> selectByPage(Map<String,Integer> map) {
		List<BoardDTO> data = session.selectList("boardMapper.selectByPage",map);
		return data;
	}
}
