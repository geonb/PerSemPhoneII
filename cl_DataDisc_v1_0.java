/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_DataDisc_v1_0 extends cl_Matrix_v1_0 {

    private char[] typeID = new char[] {'d','s','c'};
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    // Standardkonstruktor der Klasse cl_DataDisc_v1_0
    public cl_DataDisc_v1_0() {
    }
    // Implementierung der Klasse DataDisc
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // 001 --- Anforderungen der Konstruktorschnittstelle: ---
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // Zeitdifferenz erfordert Zeitangabe in den Suchparametern
    // Konfiguration der Suchparameter sind ausschlaggebend f�r den Zusammenhang 
    // der semantischen Ordnung der Datendiscs - (gleichartiges "content evolution tracking" bilded
    // die Versionen der Datandiscs vertikal - (Modulketten, die einem Stapel von Datendiscs angeh�ren
    // werden bei evolviertem Inhalt neu angelegt und bei gleichbleibenden Ergebnissen ausgelassen
    // dadurch entstehen vergleichbare abweichungen in den Lochmatrizzen der chronologisch
    // georneten Modulketten, ergo der Modulebenen einer mehrere Datendiscs umfassenden Suchanfrage.
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    public cl_DataDisc_v1_0(cl_Modul_v1_0[] moduls) {
        
    }
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // 002 --- Anforderung an die Konstuktorschnittstelle: ---
    // -------------------------------------------------------------------------------------------------------------------------------------------------

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
    //---------------------------------------------------------------------------

    public cl_Color_v1_0 getColor() {
        return color;
    }

    public void setColor(cl_Color_v1_0 color) {
        this.color = color;
    }

    public cl_EdgesObj_v1_0 getEdges() {
        return edges;
    }

    public void setEdges(cl_EdgesObj_v1_0 edges) {
        this.edges = edges;
    }

    public cl_ObjShapes_v1_0 getShape() {
        return shape;
    }

    public void setShape(cl_ObjShapes_v1_0 shape) {
        this.shape = shape;
    }
    
}
