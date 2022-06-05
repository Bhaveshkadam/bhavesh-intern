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
@Table(name = "book")
public class BookEntity {
    @Id
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "name")
    private String name;

    @Column(name = "book_description")
    private String bookDescription;

    @Column(name = "author_name")
    private User authorName;

    @Column(name = "author_id")
    private User authorId;

    @Column(name = "book_price")
    private Integer bookPrice;

    @Column(name = "book_language_id")
    private Language bookLanguageId;

    @Column(name = "genre_id")
    private Genre genreId;

    @Column(name = "book_availability")
    private boolean bookAvailability;

    @Column(name = "added_in_cart")
    private boolean addedInCart;

    @Column(name = "saved_for_later")
    private boolean savedForLater;

    @Column(name = "discount_id")
    private Discount discountId;


}
