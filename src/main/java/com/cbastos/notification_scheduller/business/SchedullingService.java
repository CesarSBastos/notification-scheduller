/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.cbastos.notification_scheduller.business;

import org.springframework.stereotype.Service;

import com.cbastos.notification_scheduller.business.mapper.ISchedullingMapper;
import com.cbastos.notification_scheduller.controller.dto.in.SchedullingRecord;
import com.cbastos.notification_scheduller.controller.dto.out.OutScheddulingRecord;
import com.cbastos.notification_scheduller.infrastructure.repositories.SchedullingRepository;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author cesar
 */
@RequiredArgsConstructor
@Service
public class SchedullingService {

    private final SchedullingRepository repository;

    private final ISchedullingMapper schedullingMapper;

    public OutScheddulingRecord saveSchedulling(SchedullingRecord schedulling) {
        return schedullingMapper
                        .toOut(repository
                        .save(schedullingMapper
                        .toEntity(schedulling)));
    }   
}
