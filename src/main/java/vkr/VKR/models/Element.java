package vkr.VKR.models;

import javax.persistence.*;

@Entity
@Table
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Double number;

    @ManyToOne(cascade = CascadeType.ALL)
    private TimeSeries ts;
}
