package we.geee.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final static String BOARD_INSERT = "insert into BOARD2 (title,writer,content,category,cnt) values(?,?,?,?,?)";
    private final static String BOARD_DELETE = "delete from BOARD2 where seq=?";
    private final static String BOARD_UPDATE = "update BOARD2 set title=?, writer=?, content=?, category=?, cnt=? where seq=?";

    public int insertBoard(BoardVO vo){
        return jdbcTemplate.update(BOARD_INSERT,
                vo.getTitle(),vo.getWriter(),vo.getContent(),vo.getCategory(),vo.getCnt());
    }

    public int deleteBoard(int seq){
        return jdbcTemplate.update(BOARD_DELETE,seq);
    }

    public int updateBoard(BoardVO vo){
        return jdbcTemplate.update(BOARD_UPDATE,
                vo.getTitle(),vo.getWriter(),vo.getContent(),vo.getCategory(),vo.getCnt(),vo.getSeq());
    }

    public BoardVO getBoard(int seq){
        String sql = "select * from BOARD2 where seq = "+seq;
        return jdbcTemplate.queryForObject(sql,new BoardRowMapper());
    }

    public List<BoardVO> getBoardList(){
        String sql = "select * from BOARD2 order by regdate desc";
        return jdbcTemplate.query(sql,new BoardRowMapper());
    }
}