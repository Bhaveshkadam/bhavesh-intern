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
@Table(name = "language")
public class LanguageEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "language")
    private String language;
}
