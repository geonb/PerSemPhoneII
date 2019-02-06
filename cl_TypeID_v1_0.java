/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_TypeID_v1_0 extends cl_BaseObj_v1_0 {
    // Typenverwaltung -> optimiert
    // Jedes File hat einen erkennbaren, angelegten FileTyp und die n�tige 
    // Interpretationsroutine wird funktionell zur Verf�gung gestellt
    // Entweder dynamisch advanced --> einer einzigen if-Bedingung wird ein
    // zur Laufzeit erzeugtes Objekt zum Vergleich mit anderen TypObjekten
    // zum Vergleich geboten -> die Klasse cl_TypeID_v1_0 enth�lt daher eine Liste
    // der Interpretierbaren FileTypen und die notwendige Reduction auf die n�tigen 
    // Interpretationskomponenten, die es zur darstellung des Files ben�tigt

    private char[] typeID = new char[] {'t','p','y'};
    // Implementing Types
    private char[] vecID = new char[] {'v','e','c'};
    private char[] grpID = new char[] {'g','r','p'};
    private char[] modID = new char[] {'m','o','d'};
    private char[] srfID = new char[] {'s','r','f'};
    private char[] fileID = new char[] {'f','i','l'};
    private char[] matrixID = new char[] {'m','t','x'};
    private char[] patrixID = new char[] {'p','t','x'};
    private char[] URLID = new char[] {'u','r','l'};    
    private char[] cmpObjID = new char[] {'c','m','p'};
    private char[] opObjID = new char[] {'o','p','o'};
    private char[] nodeID = new char[] {'n','o','d'};
    private char[] shapeID = new char[] {'s','p','e'};
    private char[] edgeID = new char[] {'e','d','g'};
    
    public cl_TypeID_v1_0(char[] typeID) {
        this.typeID = typeID;
        for(int it_t = 0; it_t < 3; it_t++) {
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.vecID[it_t]) {
                meth_vecIPred(super.getBaseObj().getVector());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.grpID[it_t]) {
                meth_grpIPred(super.getBaseObj().getGraph());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.modID[it_t]) {
                meth_modIPred(super.getBaseObj().getModul());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.srfID[it_t]) {
                meth_srfIPred(super.getBaseObj().getModSurface());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.fileID[it_t]) {
                meth_srfIPred(super.getBaseObj().getFile());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.matrixID[it_t]) {
                meth_matrIPred(super.getBaseObj().getMatrix());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.patrixID[it_t]) {
                meth_patrIPred(super.getBaseObj().getPatrix());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.URLID[it_t]) {
                meth_urlIPred(super.getBaseObj().getUrl());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.cmpObjID[it_t]) {
                meth_cmpObjIPred(super.getBaseObj().getCmpObject());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.opObjID[it_t]) {
                meth_opObjIPred(super.getBaseObj().getOpObject());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.nodeID[it_t]) {
                meth_nodeIPred(super.getBaseObj().getNode());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.shapeID[it_t]) {
                meth_shapeIPred(super.getBaseObj().getShapeObj());
            }
            if(super.getBaseObj().getCl_TypeID()[it_t] == this.edgeID[it_t]) {
                meth_edgeIPred(super.getBaseObj().getEdgeObj());
            }
            
        }
    }

    public cl_TypeID_v1_0() {
    }

    private void meth_vecIPred(cl_Vector_v1_0 vecObj) {
        // 1.) winkel -> schicht ... 0 45 - 45 90
        // 2.) visualisierung Element xyz -> Interface Grid GUI
    }
    // implement all Types with interpret methods (reduced code)
    private void meth_grpIPred(cl_Graph_v1_0 grpObj) {
        // what graphs can do 
    }

    private void meth_modIPred(cl_Modul_v1_0 modul) {
        
    }

    private void meth_srfIPred(cl_ModSurface_v1_0 modSurface) {
        
    }

    private void meth_srfIPred(cl_File_v1_0 file) {
        
    }

    private void meth_matrIPred(cl_Matrix_v1_0 matrix) {
        
    }

    private void meth_patrIPred(cl_Patrix_v1_0 patrix) {
        
    }

    private void meth_cmpObjIPred(cl_CMPObject_v1_0 cmpObject) {
        
    }

    private void meth_opObjIPred(cl_OPObject_v1_0 opObject) {
        
    }

    private void meth_nodeIPred(cl_vNode_v1_0 node) {
        
    }

    private void meth_urlIPred(cl_URLcon_v1_0 url) {
        
    }

    private void meth_shapeIPred(cl_ObjShapes_v1_0 shapeObj) {
        
    }

    private void meth_edgeIPred(cl_EdgesObj_v1_0 edgeObj) {
        
    }
    
}
