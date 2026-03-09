package com.example.praktikum2.mapper;

import com.example.praktikum2.dto.KtpDto;
import com.example.praktikum2.model.KtpEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface KtpMapper {
    @Mapping(target = "tanggalLahir", source = "tanggalLahir", dateFormat = "yyyy-MM-dd")
    KtpEntity toEntity(KtpDto dto);

    @Mapping(target = "tanggalLahir", source = "tanggalLahir", dateFormat = "yyyy-MM-dd")
    KtpDto toDto(KtpEntity entity);
}