package com.teslan.productsalesexam;

public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;

        for (int[] product : productSales) {
            for (int sale : product) {
                total += sale;
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = 0;

        for (int[] product : productSales) {
            count += product.length;
        }

        return (double) total / count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];

        for (int[] product : productSales) {
            for (int sale : product) {
                if (sale > max) {
                    max = sale;
                }
            }
        }

        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];

        for (int[] product : productSales) {
            for (int sale : product) {
                if (sale < min) {
                    min = sale;
                }
            }
        }

        return min;
    }
}