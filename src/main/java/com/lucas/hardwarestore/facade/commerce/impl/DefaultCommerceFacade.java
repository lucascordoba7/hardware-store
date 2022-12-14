package com.lucas.hardwarestore.facade.commerce.impl;

import com.lucas.hardwarestore.facade.commerce.CommerceFacade;
import com.lucas.hardwarestore.service.calculation.CalculationService;
import com.lucas.hardwarestore.service.commerce.CommerceService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "commerceFacade")
public class DefaultCommerceFacade implements CommerceFacade {
    @Resource(name = "commerceService")
    private CommerceService commerceService;
    @Resource(name = "calculationService")
    private CalculationService calculationService;

    @Override
    public void addToCart(Long productId, Long quantity) {
        commerceService.addToCart(productId, quantity);
        calculationService.recalculate();
    }
}
