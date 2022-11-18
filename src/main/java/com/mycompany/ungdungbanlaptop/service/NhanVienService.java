/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.service;

import com.mycompany.ungdungbanlaptop.entity.NhanVien;
import java.util.List;

/**
 *
 * @author vinhnv
 */
public interface NhanVienService {

    String addNhanVien(NhanVien nv);

    String updateNhanVien(NhanVien nv);

    String deleteNhanVien(NhanVien nv);

    NhanVien getNhanVienByEmail(String email);
    
    List<NhanVien> getAll();
    

    List<NhanVien> search(List<NhanVien> list,String hoTen,String email,String soDienThoai);

    NhanVien getByTen(String ten);

}
