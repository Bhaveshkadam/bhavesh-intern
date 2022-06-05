package in.pelligent.amazonbook.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "discount_id")
    private Integer discountId;

    @Column(name = "discount_provider")
    private DiscountProvider discountProvider;

    @Column(name = "percentage")
    private float percentage;

}
