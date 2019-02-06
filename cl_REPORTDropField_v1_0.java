/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_REPORTDropField_v1_0 extends cl_baseDropField_v1_0 {

    private cl_vNode_v1_0[] cl_vNodeArr = null;
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    public cl_REPORTDropField_v1_0() {      
    }

    public cl_REPORTDropField_v1_0(cl_vNode_v1_0[] cl_vNodeArr) {
        this.cl_vNodeArr = cl_vNodeArr;
    }

    public cl_vNode_v1_0[] getCl_vNodeArr() {
        return cl_vNodeArr;
    }

    public void setCl_vNodeArr(cl_vNode_v1_0[] cl_vNodeArr) {
        this.cl_vNodeArr = cl_vNodeArr;
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
