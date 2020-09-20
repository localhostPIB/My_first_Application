package com.oliver.myfirstapplication.model;


/**
 * (Interface) Bildet einen TV-Sender vom Fernsehgeraet ab.
 */
public interface IFernsehSender {

     void setSendeplatz(int sendeplatz);

     int getSendeplatz();

     void setSenderName(String name);

     String getSenderName();
}
