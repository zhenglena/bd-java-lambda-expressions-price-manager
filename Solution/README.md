### Functional interfaces with lambda expressions Pre-work

**Branch Name:** lambdaexpressions-prework

RDE workflow: `lambdaexpressions-prework-function-pricemanagertest`

Expected time required: 20 min

In this scenario, you are modifying an application that processes prices of items and applies taxes and fees. You will
write implementing code for three methods in `PriceManager` and must alter one method in `PriceCalculator`.

You work at a retail store that sells cell phones. You have a `List` of prices, but would like to determine the new
prices after taxes and fees are applied. The class `PriceCalculator` completes the price changes in the method 
`calculateTotalPrices` but must be supplied with a lambda expression that implements the `Function` interface that does 
the actual work of adding the taxes and fees. 

Your store operates in three different states that each have different sets of taxes and fees.
- If the state has a fee it will be added to the price.
- If the state has a tax you will multiply the tax to the price to get the total.
- All fees are taxed, so fees must be added first before you multiply the tax.

Examples:
- If there is only sales tax, multiply the price by the sales tax:
  ```
  BigDecimal totalCost = price.multiply(salesTax);
  ``` 
- If there only fees (e.g. setupFee, salesFee), those are
  added to the price to compute the total: price + setupFee + salesFee.
  ```
  BigDecimal totalCost = price.add(setupFee).add(salesTax);
  ```
- If there are fees (e.g. setupFee, salesFee) *plus sales tax*, then add
  price + setupFee + salesFee, then multiply the result by the sales tax.  
  ```
  BigDecimal totalCost = price.add(setupFee).add(salesFee).multiply(salesTax);
  ```

Sales tax has been expressed as 1.00 + sales tax (e.g. a 10% tax is represented as 1.10),
so you can multiply by the sales tax to compute the total price.

You will be working with `BigDecimal`s to complete the solution. As demonstrated above,
`BigDecimal` requires you to use methods to complete math operations.
You must use the `add()` and `multiply()` methods.

Write a lambda expression that correctly calculates the 
new price based on input of the original price.

1. Implement the `calculateStateTotalPrices` methods in the `PriceManager` class including replacing the return 
statement. There are three methods that must be implemented differently depending on what taxes or fees are
supplied as arguments. See the examples above for help on how to calculate the total prices.
Implement the lambda expressions in-line.
2. Implement the `calculateTotalPrices` method of `PriceCalculator`. There is a TODO statement above the line that 
should change. `newPrices.add(price);` should alter so that it calls the `Function` interface's implemented method to 
return a new price.

HINTS:
* [I'm confused on where to put my code](./hints/hint-01.md)
