/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_ThBinDBL_v1_0 extends Thread {
    
    private double decValueD;
    private int minElem = 1;
    private double maxPred = 64;
    // private int[] resBinD = new int[(int) this.maxPred];
    private int[] resBinC = new int[(int) (this.maxPred)];
    private double maxElem = Math.pow(2.0, 64.0);

    public cl_ThBinDBL_v1_0() {
    }

    public cl_ThBinDBL_v1_0(double decValueD) {
        this.decValueD = decValueD;
    }

    public int[] getResBinC() {
        return resBinC;
    }

    public void setResBinC(int[] resBinC) {
        this.resBinC = resBinC;
    }

    @Override
    public void run() {
        double helpDecD = this.decValueD;
        int helpExpLin = (int) (this.maxPred / 2.0 * this.minElem) - 1;
        for (int it_e0 = helpExpLin - 1, it_e1 = 0; it_e0 > -helpExpLin; it_e0--, it_e1++) {
            if (helpDecD - Math.pow(2.0, (double) it_e0) < 0.0) {
                this.resBinC[it_e1] = 0;
            }
            if (helpDecD - Math.pow(2.0, (double) it_e0) == 0.0) {
                this.resBinC[it_e1] = 1;
                helpDecD -= Math.pow(2.0, (double) it_e0);
            }
            if (helpDecD - Math.pow(2.0, (double) it_e0) > 0.0) {
                this.resBinC[it_e1] = 1;
                helpDecD -= Math.pow(2.0, (double) it_e0);
            }
        }
    }

//    private void meth_IntBin(int decValueD) {
//        int helpDecD = decValueD;
//        int helpExpLin = (int) (this.maxPred * this.minElem) - 1;
//        int helpPtLMinD = this.minElem;
//        this.resBinD = new int[(int) (this.maxPred * this.minElem)];
//        for (int it_e0 = helpExpLin, it_e1 = 0; it_e0 >= 0; it_e0--) {
//            if (helpDecD - (double) this.minElem >= -1.0) {
//                while (((int) helpPtLMinD << 1) <= helpDecD) {
//                    helpPtLMinD <<= 1;
//                    if (helpDecD == 0.0) {
//                        this.resBinD[0] = 0;
//                    }
//                    if (helpDecD - (double) this.minElem == 0.0) {
//                        this.resBinD[0] = 1;
//                    }
//                    it_e1++;
//                }
//                if (helpPtLMinD <= helpDecD) {
//                    this.resBinD[it_e1] = 1;
//                }
//                helpDecD -= helpPtLMinD;
//                helpPtLMinD = this.minElem;
//                it_e1 = 0;
//            }
//        }
//    }
}
