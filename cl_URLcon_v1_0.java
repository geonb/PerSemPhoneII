/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_URLcon_v1_0 {
    // Suchadressen eingeben (Array, oder einzeln)
    // eine URL kann dem Crawler �bergeben werden, der in das Netz schaut
    // um eine Seite auszuforschen (2 Modis text, sniplet evtl -> audio)
    // Differenziell kann aus dem Snipplet bei Evaluierung des Kontrasts
    // Text extrahiert werden -> Zukunftsperskektive (Framegrabbing �ber das Modulsystem)
    // videoframes k�nnen nach Textinformation gescannt werden.
    // Das geht jetzt noch sehr gut debirius hacks :)
    private String strURLcon;
    private char[] typeID = new char[] {'u','r','l'};
    public cl_URLcon_v1_0() {
    }

    public cl_URLcon_v1_0(String strURLcon) {
        this.strURLcon = strURLcon;
    }

    public String getStrURLcon() {
        return strURLcon;
    }

    public void setStrURLcon(String strURLcon) {
        this.strURLcon = strURLcon;
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
   
}
