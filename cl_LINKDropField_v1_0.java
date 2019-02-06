/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_LINKDropField_v1_0 extends cl_baseDropField_v1_0 {
    private cl_NodeLinker_v1_0[] cl_NodeLinkerArr = null;
    public cl_LINKDropField_v1_0() {
    }
    public cl_LINKDropField_v1_0(cl_NodeLinker_v1_0[] cl_NodeLinkerArr) {
        this.cl_NodeLinkerArr = cl_NodeLinkerArr;
    }

    public cl_NodeLinker_v1_0[] getCl_NodeLinkerArr() {
        return cl_NodeLinkerArr;
    }

    public void setCl_NodeLinkerArr(cl_NodeLinker_v1_0[] cl_NodeLinkerArr) {
        this.cl_NodeLinkerArr = cl_NodeLinkerArr;
    }
    
    
}
