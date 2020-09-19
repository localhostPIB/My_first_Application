package com.oliver.myfirstapplication.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Bildet einen TV-Sender vom Fernsehgeraet ab.
 */
@Getter
@Setter
@AllArgsConstructor
public class FernsehSender implements IFernsehSender {

    /**
     * Auf welchem Platz ist der Sender gespeichert.
     */
    private int sendeplatz;

    /**
     * Name des Tv-Senders.
     */
    private String senderName;
}
