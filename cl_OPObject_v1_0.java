/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_OPObject_v1_0 extends cl_BaseObj_v1_0 {
    // Enth�lt eine Liste von Operationsobjekten ein Operationsobjekt unterscheidet sich
    // durch seine Interaktivit�t mit blo�en im Regelfall von Hand verschiebbaren objekten und von den statischen Objekten
    // wie Hintergrund oder BasissystemVisualisierung
    // den jeweiligen altTagNamen der beim dar�berrollen aufscheint
    // Picking algorithmus wie besprochen -> verschiebemechanismus �ber den altTag
    // D.H. Hoover altTagName -> Move Curser over altTagField -> schieben des Buttons hinter AltTag
    // von links nach rechts -> erzeugt Operations-Men�liste zum Ausw�hlen - wieder Verschieben innerhalb des Eintragsfeldes
    // OpObjekt -> Maskenwerkzeug f�r die Markierung von CMPObjekten im Haupmen� (mit + Shift k�nnen verschidene voneinander entfernte Module
    // gemeinsam in ein neues Modul gefasst werden u.s.w. (Konsolenbedienung siehe sp�ter)
    private cl_ObjShapes_v1_0 cl_ObjShapes = null;
    private char[] typeID = new char[] {'o','p','o'};
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    public cl_OPObject_v1_0() {
    }
    
    public cl_ObjShapes_v1_0 getCl_ObjShapes() {
        return cl_ObjShapes;
    }

    public void setCl_ObjShapes(cl_ObjShapes_v1_0 cl_ObjShapes) {
        this.cl_ObjShapes = cl_ObjShapes;
    }

    public char[] getTypeID() {
        return typeID;
    }

//    public void setTypeID(char[] typeID) {
//        this.typeID = typeID;
//    }
    
}
