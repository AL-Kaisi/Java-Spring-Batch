package com.batchProcess.service;

import com.batchProcess.model.FlightTicket;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<FlightTicket,FlightTicket> {

    public FlightTicket process(FlightTicket item) throws Exception {
        System.out.printf("Processing %s...%n", item);
        item.setRoute(item.getRoute().toUpperCase());

        return item;
    }
}
