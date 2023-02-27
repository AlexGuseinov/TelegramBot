package com.example.frontapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Entity
@Table(name = "userdata")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserData {

    @Id
    Long id;

    @Column
    String name;

    @Column
    String surname;

    @Column
    String username;

    @Column
    Timestamp registeredAt;
}
