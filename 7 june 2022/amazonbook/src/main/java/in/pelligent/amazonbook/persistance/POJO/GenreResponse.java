package in.pelligent.amazonbook.persistance.POJO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenreResponse {

    private Integer id;
    private String type;

}
