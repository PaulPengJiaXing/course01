package com.siebre.course01.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "url")
public class MicroServiceUrl {
    private String orderUrl;
    private String userUrl;
    private String shoppingUrl;

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public void setShoppingUrl(String shoppingUrl) {
        this.shoppingUrl = shoppingUrl;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public String getShoppingUrl() {
        return shoppingUrl;
    }
}
