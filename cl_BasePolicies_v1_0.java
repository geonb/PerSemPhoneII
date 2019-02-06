/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_BasePolicies_v1_0 extends cl_BaseSystem_v1_0 {
    // 0,1,-1
    private int init_policy = 0;
    public cl_BasePolicies_v1_0(int init_policy) {
        this.init_policy = init_policy;
    }

    public int getInit_policy() {
        return init_policy;
    }

    public void setInit_policy(int init_policy) {
        this.init_policy = init_policy;
    }
        
}
