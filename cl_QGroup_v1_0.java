/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_QGroup_v1_0 {
    // Semantische Suchgruppen
    // Ein Node in einem Modul kann eine Gruppe von Suchw�rtern enthalten
    // die das Graphensystem in genau einer Richtung mit Vectoren pro zeitlicher
    // Suchschicht aggregieren (erweitern) -> von den Ergebnissen erwatet man sich 
    // ein feststellbare �nderung in den Daten pro Schicht | d.h. sowohl
    // Graphen mit einem Suchwort als auch Graphen mit mehreren Suchw�rtern 
    // (semantische SuchwortGruppen) innerhalb einer Richtung sind m�glich
    // Ergebnis bei mehreren Suchwortgruppen sind Konstelationen (MetaSprache)
    // _______________"What constelation my constelation was in ?"______________
    // Sowohl Konstellationen als auch einzelne Suchw�rter sind �ber CMPObject
    // vergleichbar - die Auswertung geschieht jedoch nicht Differenziell
    // �ber die Vektoren sondern stellen einzelergebnisse zu einem gewissen Zeitpunkt dar
    private cl_Query_v1_0[] cl_QueryArr;
    public cl_QGroup_v1_0() {
    }
    // Constructor for QueryBundle
    // thinking about realisation over Node inversion ...
    // connected with crawler
    public cl_QGroup_v1_0(cl_Query_v1_0[] cl_QueryArr) {
        this.cl_QueryArr = cl_QueryArr;
    }

    public cl_Query_v1_0[] getCl_QueryArr() {
        return cl_QueryArr;
    }

    public void setCl_QueryArr(cl_Query_v1_0[] cl_QueryArr) {
        this.cl_QueryArr = cl_QueryArr;
    }
    
}
