package we.geee.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
    private int seq;
    private String category;
    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private int cnt;
}
