package com.oliver.myfirstapplication.service;

import com.oliver.myfirstapplication.model.IFernsehSender;

import java.util.List;

public interface ISendeplatzService {

    /**
     * Fuegt einen TV-Sender zur Liste hinzu.
     *
     * @param iFernsehSender
     */
     void addSender(IFernsehSender iFernsehSender);

    /**
     * Gibt alle Tv-Sender aus.
     *
     * @return - Liste mit allen Sendern.
     */
    List<IFernsehSender> getAllSender();
}
