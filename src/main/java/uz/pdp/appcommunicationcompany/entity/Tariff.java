package uz.pdp.appcommunicationcompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tariff {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String description;

    @ManyToMany
    private Set<Detail> detail;

    @Column(nullable = false)
    private String ussd;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Integer countDateOfExpire;

}
