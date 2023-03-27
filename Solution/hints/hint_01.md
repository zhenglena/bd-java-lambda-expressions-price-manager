`PriceManager` contains three methods that need to be implemented, `calculateStateTotalPrices`. You must call the 
`PriceCalculator` method `calculateTotalPrices`. `calculateTotalPrices` takes a `Function` interface as an input 
argument and must be supplied to the method like so:

```java
PriceCalculator newPriceCalculator = new PriceCalculator();
return newPriceCalculator.calculatePrices(...);
```

Inside the method call for `calculatePrices` you must put your implementing code. The lambda expression should be 
written in-line, not assigned to a variable.
