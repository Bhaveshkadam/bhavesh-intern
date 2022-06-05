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
public class Order {

    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_address_id")
    private UserAddress userAddressId;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "total")
    private Float total;

    @Column(name = "seller_id")
    private Integer sellerId;

}
