/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
class cl_StearableGUI_v1_0 extends cl_Grid_v1_0 {

    public cl_StearableGUI_v1_0(int testSwitch) {
        switch(testSwitch) {
            case 0: super.getGridElemArr();
                break;
            case 1: super.getModElemArr();
                break;
        }
        
    }
    
    
}
