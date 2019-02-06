/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_EdgesObj_v1_0 {
    private int amtEdges;
    private int[][] dim3DPos = null;
    private int[][] colorEdge = null;
    private char[] typeID = new char[] {'e','d','g'};
    public cl_EdgesObj_v1_0() {
    }
    public cl_EdgesObj_v1_0(int amtEdges, int [][] dim3DPos, int[][] colorEdge) {
        this.amtEdges = amtEdges;
        this.dim3DPos = dim3DPos;
        this.colorEdge = colorEdge;
    }
    public float[][] meth_getFloatShapeCol() {
        float[][] floatShapeCol = new float[amtEdges][7];
        for(int it_f = 0; it_f < this.amtEdges; it_f++) {
            // Position
            floatShapeCol[it_f][0] = (float) (1.0 / dim3DPos[it_f][0]); // x
            floatShapeCol[it_f][1] = (float) (1.0 / dim3DPos[it_f][1]); // y
            floatShapeCol[it_f][2] = (float) (1.0 / dim3DPos[it_f][2]); // z
            // color
            floatShapeCol[it_f][3] = (float) (1.0) / colorEdge[it_f][3]; // r
            floatShapeCol[it_f][4] = (float) (1.0) / colorEdge[it_f][4]; // g
            floatShapeCol[it_f][5] = (float) (1.0) / colorEdge[it_f][5]; // b
            floatShapeCol[it_f][6] = (float) (1.0) / colorEdge[it_f][6]; // a
        }
        return floatShapeCol;
    }

    public int getAmtEdges() {
        return amtEdges;
    }

    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
    
    
    
}
