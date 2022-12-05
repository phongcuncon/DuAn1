/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DauCungDuocHotel.DAO;

import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class HotelDAO<E, K> {
    abstract public void insert(E enity);
    abstract public void Update(E enity);
    abstract public void delete(K key);
    abstract public  List<E> selectAll();
    abstract public E selectByID(K key);
    abstract protected List<E> selectBySql(String sql, Object...args);
    

}
