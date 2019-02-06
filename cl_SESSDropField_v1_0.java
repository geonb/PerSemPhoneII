/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_SESSDropField_v1_0 extends cl_baseDropField_v1_0 {

    private cl_DataDisc_v1_0[] cl_DDiscArr;
    private cl_Modul_v1_0[] cl_ModArr;
    
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    public cl_SESSDropField_v1_0() {
    }
    public cl_SESSDropField_v1_0(cl_DataDisc_v1_0[] cl_DDiscArr) {
        this.cl_DDiscArr = cl_DDiscArr;
    }
    public cl_SESSDropField_v1_0(cl_Modul_v1_0[] cl_ModArr) {
        this.cl_ModArr = cl_ModArr;
    }

    public cl_DataDisc_v1_0[] getCl_DDiscArr() {
        return cl_DDiscArr;
    }

    public void setCl_DDiscArr(cl_DataDisc_v1_0[] cl_DDiscArr) {
        this.cl_DDiscArr = cl_DDiscArr;
    }

    public cl_Modul_v1_0[] getCl_ModArr() {
        return cl_ModArr;
    }

    public void setCl_ModArr(cl_Modul_v1_0[] cl_ModArr) {
        this.cl_ModArr = cl_ModArr;
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
