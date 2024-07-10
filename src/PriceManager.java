import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

/**
 * Computes total prices/costs that incorporate fees/taxes that apply
 * in different states. Provides methods for computing the total price
 * for different scenarios including multiple fees and/or a sales tax.
 */
public class PriceManager {
    private PriceCalculator priceCalculator = new PriceCalculator();

    /**
     * Main method. When completed it should print to standard output the new prices of the items.
     * @param args Parameters for main method.
     */
    public static void main(String[] args) {
        PriceManager priceManager = new PriceManager();

        List<BigDecimal> prices = new ArrayList<>();
        prices.add(new BigDecimal("19.99"));
        prices.add(new BigDecimal(10));
        prices.add(new BigDecimal("24.99"));

        BigDecimal salesTaxStateOne = new BigDecimal("1.05");

        List<BigDecimal> newPricesStateOne = priceManager.calculateStateTotalPrices(prices, salesTaxStateOne);
        System.out.println(newPricesStateOne);

        BigDecimal setupFeeStateTwo = new BigDecimal(3);
        BigDecimal salesTaxStateTwo = new BigDecimal("1.08");

        List<BigDecimal> newPricesStateTwo = priceManager.calculateStateTotalPrices(prices, setupFeeStateTwo,
                salesTaxStateTwo);
        System.out.println(newPricesStateTwo);

        BigDecimal setupFeeStateThree = new BigDecimal(5);
        BigDecimal salesFeeStateThree = new BigDecimal("2.25");
        BigDecimal countyFeeStateThree = new BigDecimal("0.99");

        List<BigDecimal> newPricesStateThree = priceManager.calculateStateTotalPrices(prices, setupFeeStateThree,
                salesFeeStateThree, countyFeeStateThree);
        System.out.println(newPricesStateThree);
    }

    /**
     * Calculates new prices with tax.
     * @param prices List of prices.
     * @param salesTax Tax to be added to prices.
     * @return List of new prices calculated
     */
    public List<BigDecimal> calculateStateTotalPrices(List<BigDecimal> prices, BigDecimal salesTax) {
        // TODO Call PriceCalculator's method calculateTotalPrices by giving an argument that is a lambda expression
        //  implementing the Function interface. Alter the return statement to return the total prices calculated. Refer
        //  to the README for assistance in calculating the prices correctly.
<<<<<<< HEAD
=======
        PriceCalculator priceCalculator = new PriceCalculator();
>>>>>>> 6008b94432049c6441b2cc0faeffd2d2d5db8e30

        return priceCalculator.calculateTotalPrices(prices, price -> price.multiply(salesTax));
    }

    /**
     * Calculates new prices with taxes and fees.
     * @param prices List of prices.
     * @param setupFee Fee to be added to prices.
     * @param salesTax Tax to be added to prices.
     * @return List of new prices calculated
     */
    public List<BigDecimal> calculateStateTotalPrices(List<BigDecimal> prices, BigDecimal setupFee, BigDecimal
            salesTax) {
        // TODO Call PriceCalculator's method calculateTotalPrices by giving an argument that is a lambda expression
        //  implementing the Function interface. Alter the return statement to return the total prices calculated. Refer
        //  to the README for assistance in calculating the prices correctly.
<<<<<<< HEAD
        return priceCalculator.calculateTotalPrices(prices, price -> price.add(setupFee).multiply(salesTax));
=======
        PriceCalculator priceCalculator = new PriceCalculator();

        return priceCalculator.calculateTotalPrices(prices, price -> (price.add(setupFee)).multiply(salesTax));
>>>>>>> 6008b94432049c6441b2cc0faeffd2d2d5db8e30
    }

    /**
     * Calculates new prices with fees.
     * @param prices List of prices.
     * @param setupFee Fee to be added to prices.
     * @param salesFee Fee to be added to prices.
     * @param countyFee Fee to be added to prices.
     * @return List of new prices calculated
     */
    public List<BigDecimal> calculateStateTotalPrices(List<BigDecimal> prices, BigDecimal setupFee, BigDecimal salesFee,
                                                 BigDecimal countyFee) {
        // TODO Call PriceCalculator's method calculateTotalPrices by giving an argument that is a lambda expression
        //  implementing the Function interface. Alter the return statement to return the total prices calculated. Refer
        //  to the README for assistance in calculating the prices correctly.
<<<<<<< HEAD
        return priceCalculator.calculateTotalPrices(prices, price -> price.add(setupFee).add(salesFee).add(countyFee));
=======
        PriceCalculator priceCalculator = new PriceCalculator();

        return priceCalculator.calculateTotalPrices(prices,
                price -> price.add(setupFee)
                        .add(salesFee)
                        .add(countyFee));
>>>>>>> 6008b94432049c6441b2cc0faeffd2d2d5db8e30
    }
}
