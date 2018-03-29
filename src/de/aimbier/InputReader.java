package de.aimbier;

import DelibJava.DelibJNI64;

import javax.swing.*;

public class InputReader {

    //Variables
    private int handle;
    private int channel;
    boolean execute = false;

    //Constructor
    public InputReader() {}

    //Methode to start an InputReader
    public void startReader() {
        //Open module
        handle = DelibJNI64.DapiOpenModule(DelibJNI64.USB_OPTOIN_8, 1);
        System.out.println("Handle: " + handle);                                              //debug
        if( handle == 0) {
            JOptionPane.showOptionDialog(null, "Modul konnte nicht geladen werden!", "Ueberwachung",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,new String[] {"Ok"}, "B");
            return;
        } else {
            JOptionPane.showOptionDialog(null, "Modul erfolgreich geladen!", "Ueberwachung",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,new String[] {"Ok"}, "B");
            while(true) {
                for (channel = 0; channel < 6; channel = channel + 2) {
                    System.out.println("==================================");
                    System.out.println("=                                =");
                    if (lesenCh(handle, channel) == 1 && lesenCh(handle, channel+1) == 0) {
                        JOptionPane.showOptionDialog(null, "Stickmaschiene " + (channel/2+1) + ": Fertig!", "Ueberwachung",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,new String[] {"Ok"}, "B");
                    } else if (lesenCh(handle, channel) == 1 && lesenCh(handle, channel+1) == 1) {
                        JOptionPane.showOptionDialog(null, "Stickmaschiene " + (channel/2+1) + ": Fehler! ", "Ueberwachung",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,new String[] {"Ok"}, "B");
                    }
                    System.out.println("=                                =");
                    System.out.println("==================================");
                }
            }
        }
    }

    public int lesenCh(int handle, int channel) {
        int a = DelibJNI64.DapiDIGet1(handle, channel);
        return a;
    }

    public int lesenCh0(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 0);
        return a;
    }
    public int lesenCh1(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 1);
        return a;
    }
    public int lesenCh2(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 2);
        return a;
    }
    public int lesenCh3(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 3);
        return a;
    }
    public int lesenCh4(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 4);
        return a;
    }
    public int lesenCh5(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 5);
        return a;
    }
    public int lesenCh6(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 6);
        return a;
    }
    public int lesenCh7(int handle) {
        int a = DelibJNI64.DapiDIGet1(handle, 7);
        return a;
    }
}
