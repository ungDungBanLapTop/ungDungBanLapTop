/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.repository;

import com.mycompany.ungdungbanlaptop.model.viewModel.SanPhamCustomRespone;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author thang
 */
public interface KhuyenMaiSanPhamRepository {
    
    List<SanPhamCustomRespone> findSanPhamById(String id);
}