package com.ing.nlsavings;

import com.ing.nlsavings.domain.Dealer;
import com.ing.nlsavings.service.CarDealerService;
import com.ing.nlsavings.service.CarDealerServiceImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CarDealerService carDealerService = new CarDealerServiceImpl();
        Dealer dealer = new Dealer("Wouter", "Haarlem", new ArrayList<>());
        carDealerService.addDealer(dealer);
        Dealer dealer2 = new Dealer("Henk", "Utrecht", new ArrayList<>());
        carDealerService.addDealer(dealer2);
        carDealerService.addCarToDealer("Wouter",);
    }

    }

