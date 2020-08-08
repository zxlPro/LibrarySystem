package vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BookInfoVo {

    private Long bookId;

    private String name;

    private String author;

    private String publish;

    private String isbn;

    private String language;

    private BigDecimal price;

    private Date pubDate;

    private Integer classId;

    private Integer number;

    private String introduction;
}
