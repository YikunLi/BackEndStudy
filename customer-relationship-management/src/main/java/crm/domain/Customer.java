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
public class Customer {

    private String firstName;

    private String lastName;

    private String email;

    private Address address;


}
