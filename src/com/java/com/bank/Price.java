package com.java.com.bank;

import java.math.BigDecimal;
import java.util.Objects;

public class Price {


    private BigDecimal marketPrice;

    private BigDecimal value;

    private BigDecimal limitPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(marketPrice, price.marketPrice) &&
                Objects.equals(value, price.value) &&
                Objects.equals(limitPrice, price.limitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketPrice, value, limitPrice);
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }
}
