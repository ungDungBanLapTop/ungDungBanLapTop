/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.repository;

import com.mycompany.ungdungbanlaptop.entity.DoiTRa;
import com.mycompany.ungdungbanlaptop.model.resquest.SeachDoiTraRequest;
import java.util.List;

/**
 *
 * @author vinhnv
 */
public interface DoiTraRepository {
    List<DoiTRa> getList(SeachDoiTraRequest request);
}
