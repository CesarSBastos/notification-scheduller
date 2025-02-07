/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.cbastos.notification_scheduller.infrastructure.entities;

import java.time.LocalDateTime;

import com.cbastos.notification_scheduller.infrastructure.enums.notificationStatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author cesar
 */
@Table(name = "scheduling")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Schedulling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipient;
    private LocalDateTime sendDateTime;
    private LocalDateTime scheduleDateTime;
    private LocalDateTime modificationDateTime;
    private String message;
    private notificationStatusEnum statusNotification;

    @PrePersist
    private void prePersist() {
        this.scheduleDateTime = LocalDateTime.now();
        this.statusNotification = notificationStatusEnum.SCHEDULED;
    }

}
