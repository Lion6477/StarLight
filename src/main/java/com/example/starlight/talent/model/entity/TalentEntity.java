package com.example.starlight.talent.model.entity;


import com.example.starlight.talent.model.entity.PositionEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TalentEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long talentId;
    String fullName;
    String mail;
    //String password;
    Integer age;
    String avatarUrl;

    @OneToMany(mappedBy="talent",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<PositionEntity> positionEntities;
}
