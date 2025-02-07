/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.cbastos.notification_scheduller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbastos.notification_scheduller.business.SchedullingService;
import com.cbastos.notification_scheduller.controller.dto.in.SchedullingRecord;
import com.cbastos.notification_scheduller.controller.dto.out.OutScheddulingRecord;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author cesar
 */

 @RestController
 @RequiredArgsConstructor
 @RequestMapping("/schedulling")
public class SchedullingController {

    private final SchedullingService service;

    @PostMapping()   
    public ResponseEntity<OutScheddulingRecord> saveSchedulling(@RequestBody SchedullingRecord schedulling) {
        return ResponseEntity.ok(service.saveSchedulling(schedulling));        
    }
}
