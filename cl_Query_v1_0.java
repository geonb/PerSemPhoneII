/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_Query_v1_0 {
    // Datenbank anbindung (Hybridsprache)
    // Arraysearch implementation 
    // Sowohl Vectorb�schel als auch TeilSchichten, Modul und Datendiscs k�nnen
    // gesucht werden -> die geb�ndelten Suchanfragen m�ssen f�r die Datenbank
    // in einzelne Queries umgewandelt werden -> zusammenhang ASM_i/o_fetcher
    private String strQuery;
    public cl_Query_v1_0() {
    }

    public cl_Query_v1_0(String strQuery) {
        this.strQuery = strQuery;
    }

    public String getStrQuery() {
        return strQuery;
    }

    public void setStrQuery(String strQuery) {
        this.strQuery = strQuery;
    }
    
    
}
