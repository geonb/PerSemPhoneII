/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_CMPObject_v1_0 extends cl_BaseObj_v1_0 {
    // Referenceable or new init
    // Matrizze Patrizze Vergleich
    // Vergleich zweier Objekte auf 0,1,-1 --> int
    private cl_BasePolicies_v1_0 cl_basePlcy = null;
    private cl_ObjShapes_v1_0 cl_ObjShapes = null;
    private char[] typeID = new char[] {'c','m','p'};
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    public cl_CMPObject_v1_0() {
    }

    public cl_ObjShapes_v1_0 getCl_ObjShapes() {
        return cl_ObjShapes;
    }

    public void setCl_ObjShapes(cl_ObjShapes_v1_0 cl_ObjShapes) {
        this.cl_ObjShapes = cl_ObjShapes;
    }

    public cl_BasePolicies_v1_0 getCl_basePlcy() {
        return cl_basePlcy;
    }

    public void setCl_basePlcy(cl_BasePolicies_v1_0 cl_basePlcy) {
        this.cl_basePlcy = cl_basePlcy;
    }

    public char[] getTypeID() {
        return typeID;
    }

//    public void setTypeID(char[] typeID) {
//        this.typeID = typeID;
//    }
//    
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
