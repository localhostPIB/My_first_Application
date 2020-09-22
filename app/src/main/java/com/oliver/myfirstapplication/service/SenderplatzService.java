package com.oliver.myfirstapplication.service;

import com.oliver.myfirstapplication.model.FernsehSender;
import com.oliver.myfirstapplication.model.IFernsehSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Bearbeitet die Liste der App.
 */
public class SenderplatzService implements ISendeplatzService {
    private IFernsehSender iFernsehSender;

    /**
     * Liste mit allen Sender.
     */
    private List<IFernsehSender> tvListe;

    public SenderplatzService(){

        tvListe = new ArrayList<>();
    }

    /**
     * Fuegt einen TV-Sender zur Liste hinzu.
     *
     * @param iFernsehSender
     */
    @Override
    public void addSenderToList(IFernsehSender iFernsehSender) {

        tvListe.add(iFernsehSender);
    }

    @Override
    public void addSender(String sendername, int sendernummer) {

        iFernsehSender = new FernsehSender(sendernummer, sendername);
        addSenderToList(iFernsehSender);
    }

    /**
     * Gibt alle Tv-Sender aus.
     *
     * @return
     */
    @Override
    public List<IFernsehSender> getAllSender() {
        return  tvListe;
    }
}
