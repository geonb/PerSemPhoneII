/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_Patrix_v1_0 {
    // Parizzen sind Negativmatrizzen, die einen Inhalt vorgeben, der Tautologische
    // d.h. Identit�t mit der zu berechnenden Matrizze haben soll
    // Jedes Modul kann �ber sich selbst wahr, falsch, oder �hnlich (fuzzy) aussagen
    // Mit den Werten 0,1,-1
    // Durch diesen Vergleich kann zum Beispiel ein grafisches Objekt auf �hnlichkeit
    // oder genaue Identit�t abgestimmt werden - was bedeutet, dass es herausgefunden werden kann,
    // wenn es bereits vorhanden ist (gleiches gilt f�r den inneren Modulbereich (Fuzzylogik)
    // Bildet zum Beispiel eine Modulebene eine Form (Figur), durch die Patrizze werden dabei
    // die Module an den Rasterpositionen auf true oder false oder nicht f�r die Erkennung notwendig
    // fuzzy gestellt und ein Frame kann zum Beispiel dar�ber verglichen werden oder auf Abweichungen
    // �berpr�ft. 
    // Das Beispiel zeigt, dass das Zeichen A (im Unicode) durch die �berpr�fung durch die Pixelanordnung
    // nicht nur auf Typografische �bereinstimmung und als A verifiziert werden k�nnte, sondern
    // durch die Ebenentechnik ein Werkzeug zur Verf�gung stellt, die mehrere Frames auf einmal analysieren l�sst
    // Das Kalk�l, das dadurch mathematisch Logische Grafische Beweise bez�glich einer Form und der Beschaffenheit von
    // Pixelgrafiken darstellt, kann mannigfaltig eingesetzt werden und z�hlt zu der Familie der erweiterten OCR-Tools
    private cl_DataDisc_v1_0[] cl_DDiscArr = null;
    private char[] typeID = new char[] {'p','t','x'};
    public cl_Patrix_v1_0() {
    }

    public cl_Patrix_v1_0(cl_DataDisc_v1_0[] cl_DDiscArr) {
        this.cl_DDiscArr = cl_DDiscArr;
        // Schleife f�r setzen der fuzzyLogischen Elemente (Moduls, Vektoren ...) 
        // aus DDiscArr herausholen
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
    
    
    
}
