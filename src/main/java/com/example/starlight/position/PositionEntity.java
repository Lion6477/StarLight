package com.example.starlight.position;

import com.example.starlight.talent.TalentEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PositionEntity {
    @Id
    String position;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "talent_id", nullable = false)
    @JsonBackReference
    TalentEntity talent;

    String shortDescription;
    String fullDescription;
}
