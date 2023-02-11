package model.service;

import java.util.List;
import java.util.Map;

import model.dao.BoardDAO;
import model.dto.BoardDTO;

public class BoardService {

	public List<BoardDTO> selectAll() {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> data=dao.selectAll();
		return data;
	}

	public int totalRowNum() {
		BoardDAO dao = new BoardDAO();
		int row=dao.totalRowNum();
		return row;
	}

	public List<BoardDTO> selectByPage(Map<String,Integer> map) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> data =dao.selectByPage (map);
		return data;
	}



}
