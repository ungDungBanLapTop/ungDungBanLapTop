/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.repository;

<<<<<<< HEAD
import com.mycompany.ungdungbanlaptop.entity.SanPham;
import com.mycompany.ungdungbanlaptop.model.viewModel.Top10KhachMuaNhieuNhat;
=======
>>>>>>> develop
import com.mycompany.ungdungbanlaptop.model.viewModel.Top10SanPhamBanChayViewModel;
import java.util.List;

/**
 *
 * @author Diệm DZ
 */
public interface ThongKeRepository {
    List<Top10SanPhamBanChayViewModel> top10SanPhamBanChay();
    List<Top10KhachMuaNhieuNhat>  Top10KhachMuaNhieuNhat();
}
