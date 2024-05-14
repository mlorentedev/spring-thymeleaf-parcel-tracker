package com.dam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "packets")
@Data
public class Packet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private PacketType type;

    private Double weight;

    private Double height;

    private Double width;

    private Double length;

}
