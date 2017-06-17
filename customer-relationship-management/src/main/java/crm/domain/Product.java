package crm.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by liyikun on 2017/6/15.
 */
@Entity
@Table
@Data
public class Product {

    private String name;

    private String description;

    private String price;

    private String attributes;
}
