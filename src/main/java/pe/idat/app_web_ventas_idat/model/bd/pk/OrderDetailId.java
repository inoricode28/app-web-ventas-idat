package pe.idat.app_web_ventas_idat.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Embeddable
public class OrderDetailId implements Serializable {
    private Integer orderid;
    private Integer productid;

}
