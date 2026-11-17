package com.teslan.productsalesexam;

public class ProductSalesExam {

    public static void main(String[] args) {

        // Two-dimensional array storing quarterly sales
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create ProductSales object using the interface
        IProduct sales = new ProductSales();

        // Display product sales report
        System.out.println("==============================================");
        System.out.println("          PRODUCT SALES REPORT - 2025");
        System.out.println("==============================================");

        // Display sales data in table format
        System.out.printf("%-12s %10s %10s %10s%n",
                "YEAR", "QUARTER 1", "QUARTER 2", "QUARTER 3");

        System.out.println("----------------------------------------------");

        for (int i = 0; i < productSales.length; i++) {
            System.out.printf("%-12s %10d %10d %10d%n",
                    "YEAR " + (i + 1),
                    productSales[i][0],
                    productSales[i][1],
                    productSales[i][2]);
        }

        System.out.println("----------------------------------------------");

        // Display calculated sales results
        System.out.println("Total Sales: " +
                sales.TotalSales(productSales));

        System.out.printf("Average Sales: %.0f%n",
                sales.AverageSales(productSales));

        System.out.println("Maximum Sale: " +
                sales.MaxSale(productSales));

        System.out.println("Minimum Sale: " +
                sales.MinSale(productSales));

        System.out.println("==============================================");
    }
}