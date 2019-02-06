/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_Vector_v1_0 extends cl_Graph_v1_0 {
    // preinitalised Graphsystem for Moduls extended
    // Ein Vektor setzt auf einem Graphen auf und enth�lt dadurch einen Winkel bez�glich des NullPunkts (phi0, phi1 -> gen�gen f�r eine 3D Information)
    // Zus�tzlich enthalt er eine Information in welchem Schicht (Surfaceabschnitt er sich befindet) E0-En x,y mit 1/ (phi / En_x) kann der Winkel nachvollzogen werden
    // und dadurch auch der Betrag des Vektors also die Segmentdicke der Kreisschicht
    // Nodes k�nnen Null sein -> dann wird der Vektor in der Kreisschicht nicht abgebildet
    private cl_vNode_v1_0 cl_vNode = null;
    private int fuzzState = 0;
    private int[] vectorAngle = new int[2]; // phi0, phi1
    private cl_ModSurface_v1_0 modSurface;
    private cl_ScalarTransfPos_v1_0[] scalarTransPosArr = null;
    //---------------------------------------------------------------------------
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    // --------------------------------------------------------------------------
    private String vecTag = null; // full vectorname typeID_xxx(Descr)[bc-(x)xx-(x)xx]
    private char vecSc[] = new char[] {'v','e','c'};  // compiler shortcut (typeID)
    private char vecID[] = null;  // 4 sorted order (nullerweiterung hashmap)
    private char vecDescr[] = null;
    // --------------------------------------------------------------------------
    private int sizeID = 3; // init 3 --> extend opt ? 1000 init * fact 10 == new 0
    public cl_Vector_v1_0() {
    }
    public cl_Vector_v1_0(char[] vecID, char[] vecDescr, int[] vectorAngle, int fuzzState) {
        this.vecID = vecID;
        this.vecDescr = vecDescr;
        this.vectorAngle = vectorAngle;
        this.fuzzState = fuzzState;
    }
    public cl_Vector_v1_0(String vecTag, int fuzzState) {
        this.vecTag = vecTag;
        this.fuzzState = fuzzState;
    }
    public cl_Vector_v1_0(cl_ModSurface_v1_0 modSurface) {
        this.modSurface = modSurface;
    }
    public cl_Vector_v1_0(cl_vNode_v1_0 cl_vNode) {
        this.cl_vNode = cl_vNode;
    }
    
    public cl_vNode_v1_0 getCl_vNode() {
        return cl_vNode;
    }

    public void setCl_vNode(cl_vNode_v1_0 cl_vNode) {
        this.cl_vNode = cl_vNode;
    }

    public int getFuzzState() {
        return fuzzState;
    }

    public void setFuzzState(int fuzzState) {
        this.fuzzState = fuzzState;
    }

    public int[] getVectorAngle() {
         if(this.scalarTransPosArr != null) {
            for(int it_p0 = 0; it_p0 < this.scalarTransPosArr.length; it_p0++) {
                for(int it_p1 = 0; it_p1 < this.scalarTransPosArr[it_p0].getVecAngle().length; it_p1++) {
                    setVectorAngle(this.scalarTransPosArr[it_p0].getGphAngle()[it_p1]);
                }  
            }
            return vectorAngle;
        } else {
            return vectorAngle;
        }
    }

    public void setVectorAngle(int[] vectorAngle) {
        this.vectorAngle = vectorAngle;
    } 

    public char[] getVecID() {
        if(this.vecTag != null) {
            for(int it_id = 4; it_id < 4 + this.sizeID; it_id++) {
                this.vecID = new char[it_id - 4 + 1];
                this.vecID[it_id - 4] = this.vecTag.charAt(it_id);
            }
        }
        return vecID;
    }

    public void setVecID(char[] vecID) {
        this.vecID = vecID;
    }
    public char[] getVecDescr() {
        if(this.vecTag != null) {
           for(int it_dc = 4 + this.sizeID + 1; this.vecTag.charAt(it_dc) != ')'; it_dc++) {
               this.vecDescr = new char[it_dc - (4 + this.sizeID) + 1];
               this.vecDescr[it_dc - (4 + this.sizeID)] = this.vecTag.charAt(it_dc);
           } 
        }
        return vecDescr;
    }

    public void setVecDescr(char[] vecDescr) {
        this.vecDescr = vecDescr;
    }

    public char[] getVecSc() {
        return vecSc;
    }

//    public void setVecSc(char[] vecSc) {
//        this.vecSc = vecSc;
//    }

    public String getVecTag() {
        return vecTag;
    }

    public void setVecTag(String vecTag) {
        this.vecTag = vecTag;
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
