/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
class cl_Grid_v1_0 {
    public int[][] gridElemArr = new int[2][3]; // 1 Dim -> disc oder modul [2]
                                             // 2 Dim -> modulNr oder VecElem xyz [0][2]xyz Mod || [1][3] xyz Elem
    private int[] modElemArr = new int[3];
    private int[] vecElemArr = new int[3];
    
    public cl_Grid_v1_0() {
    }

    public cl_Grid_v1_0(int[][] gridElemArr) {
        this.gridElemArr = gridElemArr;
    }
    public cl_Grid_v1_0(int[] modElemArr, int[] vecElemArr) {
       this.modElemArr = modElemArr;
       this.vecElemArr = vecElemArr;
    }

    public int[][] getGridElemArr() {
        return gridElemArr;
    }

    public void setGridElemArr(int[][] gridElemArr) {
        this.gridElemArr = gridElemArr;
    }

    public int[] getModElemArr() {
        return modElemArr;
    }

    public void setModElemArr(int[] modElemArr) {
        this.modElemArr = modElemArr;
    }

    public int[] getVecElemArr() {
        return vecElemArr;
    }

    public void setVecElemArr(int[] vecElemArr) {
        this.vecElemArr = vecElemArr;
    }
    
}
