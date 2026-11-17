/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.teslan.productsalesexam;

/**
 *
 * @author tesla
 */
public interface IProduct {
    // Calculates total sales
int TotalSales(int[][] productSales);

// Calculates average sales
double AverageSales(int[][] productSales);

// Finds maximum sales
int MaxSale(int[][] productSales);

// Finds minimum sales
int MinSale(int[][] productSales);
}
