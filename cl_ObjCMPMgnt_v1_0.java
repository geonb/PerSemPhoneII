/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_ObjCMPMgnt_v1_0 {
    // Diese Klasse dient der Anordnung der Objekte im 3D Raum von Jogl
    // Positions�berpr�fung implementieren (DDiscs, Mods, Vectors, Nodes, [Matrix]) Operational Objects Dynamic
    // Zoomstatus des Main Vieports (3 Modi VP)
    private cl_CMPObject_v1_0[] cl_CMPObjArr = null;
    private cl_OPObject_v1_0[] cl_OPObjArr = null;
    public cl_ObjCMPMgnt_v1_0() {
    }

    public cl_ObjCMPMgnt_v1_0(cl_CMPObject_v1_0[] cl_CMPObjArr, cl_OPObject_v1_0[] cl_OPObjArr) {
        this.cl_CMPObjArr = cl_CMPObjArr;
        this.cl_OPObjArr = cl_OPObjArr;
    }
    public float[][] meth_DynObjPosCol() {
       // initial to dynamic obj position (stearing Objects) 
       return null; 
    }
       
}
