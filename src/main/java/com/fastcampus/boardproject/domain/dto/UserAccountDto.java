package com.fastcampus.boardproject.domain.dto;

import com.fastcampus.boardproject.domain.UserAccount;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.fastcampus.boardproject.domain.UserAccount} entity
 */
public record UserAccountDto(Long ID, String userId, String userPassword, String email, String nickname, String memo,
                             LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
    public static UserAccountDto of(Long ID, String userId, String userPassword, String email, String nickname, String memo, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        return new UserAccountDto(ID, userId, userPassword, email, nickname, memo, createdAt, createdBy, modifiedAt, modifiedBy);
    }
    public static UserAccountDto from(UserAccount entity) {
        return new UserAccountDto(
                entity.getID(),
                entity.getUserId(),
                entity.getUserPassword(),
                entity.getEmail(),
                entity.getNickname(),
                entity.getMemo(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy()
        );
    }
    public UserAccount toEntity() {
        return UserAccount.of(
                userId,
                userPassword,
                email,
                nickname,
                memo
        );
    }
}
