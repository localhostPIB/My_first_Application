package com.oliver.myfirstapplication.model;


/**
 * (Interface) Bildet einen TV-Sender vom Fernsehgeraet ab.
 */
public interface IFernsehSender {

    public void setSendeplatz(int sendeplatz);

    public int getSendeplatz();

    public void setSenderName(String name);

    public String getSenderName();
}
