package in.pelligent.amazonbook.persistance.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "genre")
public class GenreEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "genre_id")
    private Integer genreId;

    @Column(name = "genre")
    private String genre;
}
