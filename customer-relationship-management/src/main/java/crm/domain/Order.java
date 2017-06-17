package crm.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by liyikun on 2017/6/17.
 */
@Entity
@Table
@Data
public class Order {

    private Customer customer;

    private Date date;

    private String status;

    private String shippingAddress;

    private String billingAddress;

    private List<LineItem> lineItems;
}
