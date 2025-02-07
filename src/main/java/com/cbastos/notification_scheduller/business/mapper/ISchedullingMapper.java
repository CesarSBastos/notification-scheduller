/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.cbastos.notification_scheduller.business.mapper;

import org.mapstruct.Mapper;


import com.cbastos.notification_scheduller.controller.dto.in.SchedullingRecord;
import com.cbastos.notification_scheduller.controller.dto.out.OutScheddulingRecord;
import com.cbastos.notification_scheduller.infrastructure.entities.Schedulling;

/**
 *
 * @author cesar
 */
@Mapper(componentModel = "spring")
public interface ISchedullingMapper {

    Schedulling toEntity(SchedullingRecord schedulling);

    OutScheddulingRecord toOut(Schedulling schedulling);

}
