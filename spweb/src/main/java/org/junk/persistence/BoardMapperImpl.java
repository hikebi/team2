package org.junk.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junk.domain.BoardVO;
import org.junk.domain.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class BoardMapperImpl implements BoardMapper {

	@Autowired
	private SqlSession session;
	
	@Override
	public List<BoardVO> allList() throws Exception {
		List<BoardVO> list = new ArrayList();
		
		list = session.selectList("org.junk.persistence.BoardMapper.allList");
		
		return list;
	}

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert("org.junk.persistence.BoardMapper.create", vo);

	}

	@Override
	public BoardVO read(int bno) throws Exception {
		BoardVO vo = session.selectOne("org.junk.persistence.BoardMapper.read",bno);
		return vo;
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update("org.junk.persistence.BoardMapper.update",vo);

	}

	@Override
	public void delete(int bno) throws Exception {
		session.delete("org.junk.persistence.BoardMapper.delete",bno);

	}

	@Override
	public List<BoardVO> search(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList("org.junk.persistence.BoardMapper.search",cri);
	}

	@Override
	public int searchCount(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("org.junk.persistence.BoardMapper.searchCount", cri);
	}

}
