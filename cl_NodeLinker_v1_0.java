/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_NodeLinker_v1_0 {
    // Alle Vektoren, die in der Schale - �brigens (evtl. Halbschale hardcopy, virtuelle sessioncopy viruelle Schale -> DisplayMode)
    // nicht auf der Schale selbst liegen, k�nnen �ber die Nodes verlinkt werden - d.h strahlsymmetrisch, iterativ, recursiv Ebenentechnisch algorithmisch
    // z.B. markierte files in andere module copieren, verschieben, session to hardcopy - inhalte markieren
    // neue module mit markierten inhalten generieren

    private cl_vNode_v1_0[] cl_vNodeArr = null;
    private cl_Modul_v1_0[] cl_ModulArr = null;

    public cl_NodeLinker_v1_0() {
    }

    public cl_NodeLinker_v1_0(cl_vNode_v1_0[] cl_vNodeArr) {
        this.cl_vNodeArr = cl_vNodeArr;
    }

    public cl_NodeLinker_v1_0(cl_Modul_v1_0[] cl_ModulArr) {
        this.cl_ModulArr = cl_ModulArr;
        for (int it_m = 0; it_m < cl_ModulArr.length; it_m++) {
            for (int it_v = 0; it_v < cl_ModulArr[it_m].getCl_VecArr().length; it_v++) {
                this.cl_vNodeArr = new cl_vNode_v1_0[it_v + 1];
                this.cl_vNodeArr[it_v] = cl_ModulArr[it_m].getCl_VecArr()[it_v].getCl_vNode();
            }
        }
    }

    public cl_Modul_v1_0[] getCl_ModulArr() {
        return cl_ModulArr;
    }

    public void setCl_ModulArr(cl_Modul_v1_0[] cl_ModulArr) {
        this.cl_ModulArr = cl_ModulArr;
    }

    public cl_vNode_v1_0[] getCl_vNodeArr() {
        return cl_vNodeArr;
    }

    public void setCl_vNodeArr(cl_vNode_v1_0[] cl_vNodeArr) {
        this.cl_vNodeArr = cl_vNodeArr;
    }
    
}
