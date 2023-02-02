package model.service;

import java.util.List;

import model.dao.MemberDAO;
import model.dto.MemberDTO;

public class MemberService {

	public List<MemberDTO> selectAll() {
		MemberDAO dao= new MemberDAO();
		List<MemberDTO> data= dao.selectAll();
		return data;
	}


}
