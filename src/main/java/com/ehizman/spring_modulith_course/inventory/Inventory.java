package com.ehizman.spring_modulith_course.inventory;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Ehis Edemakhiota
 * @code @created: Jan 3, 2025
*/
@Getter
@Setter
@ToString
@Entity
@Table(indexes = {@Index(name = "inv_name_Idx", columnList = "name")})
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    private String description;
    private long price;
}
