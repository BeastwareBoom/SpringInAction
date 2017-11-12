package com.ascland.chapter03.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dinner {

    private Dessert dessert;

    @Autowired
//    @Qualifier("iceCream")
//    @Qualifier("cold")
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }


    @Bean
//    @Primary
//    @Qualifier("cold")
    @Cold
    @Creamy
    public Dessert iceCream() {
        return new IceCream();
    }

//    @Qualifier("cold")
    @Bean
    @Cold
    public Dessert cookies() {
        return new Cookies();
    }

    @Bean
    public Dessert cake() {
        return new Cake();
    }


}
