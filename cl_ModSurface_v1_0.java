/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_ModSurface_v1_0 {
    // Implementing manual timecode system
    // Planungstool und �bersicht f�r differenzielle Berechnungen auf Fuzzylogik 0,1,-1
    // Jeder Vektor mit dem Gleichen KnotenInhalt (Nodes) kann als Replik referenziert werden
    // Das spart Rechenleistung
    // Vektroen werden pro Kreisschicht erweitert, wenn entweder ein neuer Suchschritt mit den
    // gleichen Semantischen Komponenten festgelegt wird oder eine automatisch Timingfunktion
    // immer wieder die Ver�nderung der mit gleichen Suchangaben versehenen Schicht erweitert

    private cl_Vector_v1_0[] cl_vecArr;
    private int sizeID = 3;
    // --------------------------------------------------------------------------
    private String surfTag = null;
    private char[] typeID = new char[]{'s', 'r', 'f'};
    private char[] surfID = null;
    private char[] surfTC = null;
    // --------------------------------------------------------------------------

    public cl_ModSurface_v1_0() {
    }

    public cl_ModSurface_v1_0(String surfTag) {
        this.surfTag = surfTag;
    }

    public cl_ModSurface_v1_0(char[] surfID, char[] surfTC) {
        this.surfTC = surfTC;
        this.surfID = surfID;
    }

    public cl_ModSurface_v1_0(cl_Vector_v1_0[] cl_vecArr) {
        this.cl_vecArr = cl_vecArr;
    }

    public cl_Vector_v1_0[] getCl_vecArr() {
        return cl_vecArr;
    }

    public void setCl_vecArr(cl_Vector_v1_0[] cl_vecArr) {
        this.cl_vecArr = cl_vecArr;
    }

    public char[] getSurfID() {
        if (this.surfTag != null) {
            for (int it_id = 4; it_id < 4 + this.sizeID; it_id++) {
                this.surfID[it_id - 4] = this.surfTag.charAt(it_id);
            }
        }
        return surfID;
    }

    public void setSurfID(char[] surfID) {
        this.surfID = surfID;
    }

    public char[] getSurfTC() {
        return surfTC;
    }

    public void setSurfTC(char[] surfTC) {
        this.surfTC = surfTC;
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }

    public String getSurfTag() {
        return surfTag;
    }

    public void setSurfTag(String surfTag) {
        this.surfTag = surfTag;
    }
}
