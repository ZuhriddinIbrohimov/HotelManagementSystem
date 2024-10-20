package zuhriddinscode.entity;

import jakarta.persistence.*;


@Entity
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private Integer rating; // 1 dan 5 gacha reyting

    @OneToOne
    private Order order;
}
