/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_File_v1_0 {
    // Die Klasse File ist ein DatanInhalt der einen Typ besitzt
    // und dargestellt werden kann.
    // Sie befindet sich in einem oder mehreren der Nodes
    // ~<- Die Inhalte der Files sind zun�chst in gepackter Darstellung sichtbar
    // Ein File ist ein Balken mit einer Bezeichnung und einer implementierten PickingDialog f�r Operationale Obejtktmanipulationen 
    // Klickbar sind am linken oberen Ende des Balkens nur Minimieren (Balkenliste mit den anderen Files), Maximieren (File klappt auf  -> Inhalt), Editieren, L�schen (je nach Permission ver�ndert dies die M�glichkeiten der Ver�nderung)
    // ->~ Files k�nnen �ber drag und drop verschoben werden (Reihungen m�glich)
    private cl_BasePolicies_v1_0 cl_basePlcy = null;
    private char[] typeID = new char[] {'f','i','l'};
    private int fuzzState = 0;
    private int init_policy;
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
        
    public cl_File_v1_0(int init_policy) {
        this.init_policy = init_policy;
    }
    
    public cl_File_v1_0(cl_TypeID_v1_0 cl_TypeID, int init_policy) {
        this.init_policy = init_policy;
    }
    
    // green, red, yellow
    
    // 0,1,-1
    public int getFuzzState() {
        return fuzzState;
    }

    public void setFuzzState(int fuzzState) {
        this.fuzzState = fuzzState;
    }

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
