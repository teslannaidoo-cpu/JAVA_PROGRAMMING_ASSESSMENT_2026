package com.teslan.productsalesexam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the ProductSales class.
 */
public class ProductSalesTest {

    // Create an object to test the ProductSales methods.
    ProductSales sales = new ProductSales();

    // Sample sales data for two years.
    int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    /**
     * Tests whether the total sales calculation is correct.
     */
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        int expectedTotal = 2200;

        int actualTotal = sales.TotalSales(productSales);

        assertEquals(expectedTotal, actualTotal);
    }

    /**
     * Tests whether the average sales calculation is correct.
     */
    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        double expectedAverage = 366.6667;

        double actualAverage = sales.AverageSales(productSales);

        assertEquals(expectedAverage, actualAverage, 0.01);
    }
}