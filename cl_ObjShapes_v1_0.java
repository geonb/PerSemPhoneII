/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_ObjShapes_v1_0 {
    // wireframes for dynmical initalised Objects
    // don�t forget -> Jogl dynmic initialisation Polygon must be generic
    // 1.0 / xyz -> screen float
    private cl_EdgesObj_v1_0[] cl_EdgesArr = null;
    private char[] typeID = new char[] {'s','h','p'};
    public cl_ObjShapes_v1_0() {
    }
    public cl_ObjShapes_v1_0(cl_EdgesObj_v1_0[] cl_EdgesArr) {
        // Combines Object condition (interaktive, static)
        this.cl_EdgesArr = cl_EdgesArr;
    }

    public cl_EdgesObj_v1_0[] getCl_EdgesArr() {
        return cl_EdgesArr;
    }

    public void setCl_EdgesArr(cl_EdgesObj_v1_0[] cl_EdgesArr) {
        this.cl_EdgesArr = cl_EdgesArr;
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
    
            
}
