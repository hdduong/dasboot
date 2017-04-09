package com.boot.bootstrap;

import com.boot.model.Shipwreck;
import com.boot.service.ShipwreckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by HienD on 4/8/2017.
 */
@Component
public class ShipwreckBootstrapData implements ApplicationListener<ContextRefreshedEvent> {

    private ShipwreckService shipwreckService;

    @Autowired
    public void setShipwreckService(ShipwreckService shipwreckService) {
        this.shipwreckService = shipwreckService;
    }

    public void onApplicationEvent(ContextRefreshedEvent event) {

        Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
        shipwreckService.saveOrUpdate(a);

        Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
        shipwreckService.saveOrUpdate(b);

        Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
        shipwreckService.saveOrUpdate(c);
    }
}
