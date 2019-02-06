/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_ScalarTransfPos_v1_0 {

    private cl_Vector_v1_0[] cl_VecArr = null;
    private cl_Graph_v1_0[] cl_GraphArr = null;
    private int[][] vecAngle = null;
    private int [][] graphAngle = null;
    public cl_ScalarTransfPos_v1_0(cl_Vector_v1_0[] cl_VecArr) {
        this.cl_VecArr = cl_VecArr;
    }
    public cl_ScalarTransfPos_v1_0(cl_Graph_v1_0[] cl_GraphArr) {
        this.cl_GraphArr = cl_GraphArr;
    }

    public int[][] getGphAngle() {
        return graphAngle;
    }

    public void setGphAngle(int[][] graphAngle) {
        this.graphAngle = graphAngle;
    }

    public int[][] getVecAngle() {
        return vecAngle;
    }

    public void setVecAngle(int[][] vecAngle) {
        this.vecAngle = vecAngle;
    }
    
    
    
}
