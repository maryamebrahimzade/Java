package ir.mapsa.telepayer.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "merchantorderitem")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MerchantOrderItem extends AbstractEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "productId")
    private String productId;

    @Column(name = "unitPrice")
    private Integer unitPrice;
}