package we.geee.board;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardRowMapper implements RowMapper<BoardVO> {

    @Override
    public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new BoardVO(
                rs.getInt("seq"),
                rs.getString("category"),
                rs.getString("title"),
                rs.getString("writer"),
                rs.getString("content"),
                rs.getDate("regdate"),
                rs.getInt("cnt")
        );
    }
}
