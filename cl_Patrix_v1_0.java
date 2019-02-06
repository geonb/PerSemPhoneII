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
    // d.h. Identitï¿½t mit der zu berechnenden Matrizze haben soll
    // Jedes Modul kann ï¿½ber sich selbst wahr, falsch, oder ï¿½hnlich (fuzzy) aussagen
    // Mit den Werten 0,1,-1
    // Durch diesen Vergleich kann zum Beispiel ein grafisches Objekt auf ï¿½hnlichkeit
    // oder genaue Identitï¿½t abgestimmt werden - was bedeutet, dass es herausgefunden werden kann,
    // wenn es bereits vorhanden ist (gleiches gilt fï¿½r den inneren Modulbereich (Fuzzylogik)
    // Bildet zum Beispiel eine Modulebene eine Form (Figur), durch die Patrizze werden dabei
    // die Module an den Rasterpositionen auf true oder false oder nicht fï¿½r die Erkennung notwendig
    // fuzzy gestellt und ein Frame kann zum Beispiel darï¿½ber verglichen werden oder auf Abweichungen
    // ï¿½berprï¿½ft. 
    // Das Beispiel zeigt, dass das Zeichen A (im Unicode) durch die ï¿½berprï¿½fung durch die Pixelanordnung
    // nicht nur auf Typografische ï¿½bereinstimmung und als A verifiziert werden kï¿½nnte, sondern
    // durch die Ebenentechnik ein Werkzeug zur Verfï¿½gung stellt, die mehrere Frames auf einmal analysieren lï¿½sst
    // Das Kalkï¿½l, das dadurch mathematisch Logische Grafische Beweise bezï¿½glich einer Form und der Beschaffenheit von
    // Pixelgrafiken darstellt, kann mannigfaltig eingesetzt werden und zï¿½hlt zu der Familie der erweiterten OCR-Tools
    private cl_DataDisc_v1_0[] cl_DDiscArr = null;
    private char[] typeID = new char[] {'p','t','x'};
    public cl_Patrix_v1_0() {
    }

    public cl_Patrix_v1_0(cl_DataDisc_v1_0[] cl_DDiscArr) {
        this.cl_DDiscArr = cl_DDiscArr;
        // Schleife für setzen der fuzzyLogischen Elemente (Moduls, Vektoren ...) 
        // aus DDiscArr herausholen
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
    
    
    
}
