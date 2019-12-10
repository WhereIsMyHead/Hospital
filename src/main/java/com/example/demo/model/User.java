package com.example.demo.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String no;
    private String id;
    private String name;
    private String Med;
    private Integer num;
    //alt+Insert
}
