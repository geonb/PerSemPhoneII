/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_HARDCOPYDropField_v1_0 extends cl_baseDropField_v1_0 {

    private cl_DataDisc_v1_0[] cl_DDiscArr;
    private cl_Modul_v1_0[] cl_ModArr;
    
    public cl_HARDCOPYDropField_v1_0() {
    }
    public cl_HARDCOPYDropField_v1_0(cl_DataDisc_v1_0[] cl_DDiscArr) {
        this.cl_DDiscArr = cl_DDiscArr;
    }
    public cl_HARDCOPYDropField_v1_0(cl_Modul_v1_0[] cl_ModArr) {
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
    
    
}