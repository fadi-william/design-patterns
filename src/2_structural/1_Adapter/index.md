---
name: 1. Adapter
route: /structural/adapter
menu: Structural
---

# Adapter

## Description

The adapter should be used when you want to use an existing class but it doesn't fit into the class hierarchy.

Examples in the JDK:

- java.util.Collections.list()
- java.util.Collections.enumeration()
- java.util.Arrays.asList()

## Sample Code

In this sample, we have a CarPriceCalculator interface. We are using an external library that calculates the car price that diosn't conform to our interface class hierarchy. So, the solution is to implement an Adapter that could let the uk car price conform to the interface of our class hirerarchy.

```kotlin
package structural.classes.adapter.pattern

import org.example.UKCarPriceCalculator
import structural.classes.adapter.domain.PriceCalculator

class PriceCalculatorAdapter(private val ukCarPriceCalculator: UKCarPriceCalculator) : PriceCalculator {

    override fun calculatePrice(): String {
        return ukCarPriceCalculator.price.toString() + "GBP";
    }
}
```
