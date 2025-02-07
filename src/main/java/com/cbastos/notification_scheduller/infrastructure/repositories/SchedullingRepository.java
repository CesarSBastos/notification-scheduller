/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.cbastos.notification_scheduller.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbastos.notification_scheduller.infrastructure.entities.Schedulling;

/**
 *
 * @author cesar
 */
public interface SchedullingRepository extends JpaRepository<Schedulling, Long> {

}
