package com.project.E_Notes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseModel {
    private Boolean isActive;
    private Boolean isDeleted;

    @Column(name = "created_date", columnDefinition = "DATETIME(0)")
    private LocalDateTime  createdDt;

    private Integer createdBy;

    private Integer updatedBy;

    @Column(name = "updated_date", columnDefinition = "DATETIME(0)")
    private LocalDateTime updatedDt;
}
