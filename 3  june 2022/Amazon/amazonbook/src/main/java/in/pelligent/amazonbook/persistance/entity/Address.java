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
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "address_id")
    private Integer addressID;

    @Column(name = "addressline1")
    private String addressLine1;

    @Column(name = "addressline2")
    private String addressLine2;

    @Column(name = "addressline3")
    private String addressLine3;

    @Column(name = "addressline4")
    private String addressLine4;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private Integer pinCode;

    @Column(name = "landmark")
    private String landmark;
}
