package in.pelligent.amazonbook.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order")
public class Review {

    @Id
    @Column(name = "review")
    private Integer review;

    @Column(name = "book_id")
    private BookEntity bookEntityId;

    @Column(name = "review_title")
    private String reviewTitle;

    @Column(name = "review_text")
    private String reviewText;

    @Column(name = "user_id")
    private User userId;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "stars")
    private Integer Stars;

    @Column(name = "helpful")
    private boolean helpful;

    @Column(name = "reported")
    private boolean reported;

}
