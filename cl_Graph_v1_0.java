/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_Graph_v1_0 extends Thread {
    private cl_QGroup_v1_0[] cl_qGroup = null; // Ein oder mehrere Suchbegriffe
    private int MAX_CVec = 0; // Maximale anzahl von Vektoren in einer Schicht
    private int transPole[] = null; // GatterPolung dynmic
    private int[] graphAngle = null;
    private cl_ScalarTransfPos_v1_0[] scalarTransPosArr = null;
    private int sizeID;
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    // --------------------------------------------------------------------------
    private String graphTag = null;
    private char[] typeID = new char[] {'g','r','p'};
    private char[] graphID = null;
    private char[] graphDescr = null;
    // --------------------------------------------------------------------------
    public cl_Graph_v1_0() {
    }
    public cl_Graph_v1_0(char[] graphID, char[] graphDescr, int[] graphAngle) {
        this.graphID = graphID;
        this.graphDescr = graphDescr;
        this.graphAngle = graphAngle;
    }
    public cl_Graph_v1_0(cl_QGroup_v1_0[] cl_qGroup, int[] transPole) {
        this.cl_qGroup = cl_qGroup;
        this.transPole = transPole;
    }
    public cl_Graph_v1_0(cl_ScalarTransfPos_v1_0[] scalarTransPosArr) {
        this.scalarTransPosArr = scalarTransPosArr;
    }

    public int getMAX_CVec() {
        return MAX_CVec;
    }

    public void setMAX_CVec(int MAX_CVec) {
        this.MAX_CVec = MAX_CVec;
    }

    public int[] getGraphAngle() {
        if(this.scalarTransPosArr != null) {
            for(int it_p0 = 0; it_p0 < this.scalarTransPosArr.length; it_p0++) {
                for(int it_p1 = 0; it_p1 < this.scalarTransPosArr[it_p0].getGphAngle().length; it_p1++) {
                    setGraphAngle(this.scalarTransPosArr[it_p0].getGphAngle()[it_p1]);
                }  
            }
            return graphAngle;
        } else {
            return graphAngle;
        }
    }

    public void setGraphAngle(int[] graphAngle) {
        this.graphAngle = graphAngle;
    }

    public int[] getTransPole() {
        return transPole;
    }

    public void setTransPole(int[] transPole) {
        this.transPole = transPole;
    }

    public char[] getVecID() {
        if(this.graphTag != null) {
            for(int it_id = 4; it_id < 4 + this.sizeID; it_id++) {
                this.graphID = new char[it_id - 4 + 1];
                this.graphID[it_id - 4] = this.graphTag.charAt(it_id);
            }
        }
        return graphID;
    }

    public void setGraphID(char[] vecID) {
        this.graphID = vecID;
    }
    public char[] getGraphDescr() {
        if(this.graphTag != null) {
           for(int it_dc = 4 + this.sizeID + 1; this.graphTag.charAt(it_dc) != ')'; it_dc++) {
               this.graphDescr = new char[it_dc + 1];
               this.graphDescr[it_dc] = this.graphTag.charAt(it_dc);
           } 
        }
        return graphDescr;
    }

    public void setGraphDescr(char[] vecDescr) {
        this.graphDescr = vecDescr;
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }

    

    public String getGraphTag() {
        return graphTag;
    }

    public void setGraphTag(String vecTag) {
        this.graphTag = vecTag;
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
    
    @Override
    public void run() {
        
    }
    
    
}
