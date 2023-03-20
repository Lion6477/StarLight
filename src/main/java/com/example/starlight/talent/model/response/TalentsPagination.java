package com.example.starlight.talent.model.response;

import com.example.starlight.talent.model.entity.TalentEntity;
import lombok.Builder;

import java.util.List;

@Builder
public record TalentsPagination(
        int totalPage,
        long totalTalents,
        List<TalentEntity> talents
) {
}
