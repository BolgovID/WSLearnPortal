package ua.ws.learnportal.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Data
@Entity
@Table(name = "customer")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Customer extends AbstractEntity {

    @Column(length = 40)
    private String name;

    @Email
    @Column(length = 40)
    private String email;


}
