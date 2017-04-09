package com.boot.service;

import com.boot.model.Shipwreck;

import java.util.List;

/**
 * Created by HienD on 4/8/2017.
 */
public interface ShipwreckService {
    List<Shipwreck> listAll();

    Shipwreck getById(Long id);

    Shipwreck saveOrUpdate(Shipwreck shipwreck);

    Shipwreck delete(Long id);
}
