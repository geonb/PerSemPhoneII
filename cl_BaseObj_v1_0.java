/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author student
 */
public class cl_BaseObj_v1_0 {

    private char[] typeID = null;
    private int[][] objPos = null;
    private int init_policy;
    // classTypes ---------------------------------------------------------------
    private cl_Vector_v1_0 vector = null;
    private cl_Graph_v1_0 graph = null;
    private cl_Modul_v1_0 modul = null;
    private cl_ModSurface_v1_0 modSurface = null;
    private cl_File_v1_0 file = null;
    private cl_CMPObject_v1_0 cmpObject = null;
    private cl_OPObject_v1_0 opObject = null;
    private cl_vNode_v1_0 node = null;
    private cl_Matrix_v1_0 matrix = null;
    private cl_Patrix_v1_0 patrix = null;
    private cl_URLcon_v1_0 url = null;
    private cl_BaseObj_v1_0 baseObj = null;
    private cl_ObjShapes_v1_0 shapeObj = null;
    private cl_EdgesObj_v1_0 edgeObj = null;
    // Jedes Objekt wird als Basisobjekt registriert und ist 
    // über die Methoden scale und shape sowie drag und drop verschiebbar
    // Jedes Objekt ist also von einem Basisobjekt gekapselt 
    // dadurch verliert es die eigentliche Beschaffenheit nicht und kann
    // über die Methoden des Basisobjekts maipuliert werden
    // Zur Regisrierung: Jedes Objekt enthält eine TypeID und kann
    // von der Klasse cl_TypeId_v1_0 erkannt und richtig interpretiert werden
    //---------------------------------------------------------------------------
    private cl_ObjShapes_v1_0 shapeBObj = null;
    private cl_EdgesObj_v1_0 edgeBObj = null;
    private cl_Color_v1_0 colorBObj = null;
    //---------------------------------------------------------------------------
    private int iAMode = 0; // 0 passive, 1 aktive, (perhaps in use ... draged)
    //---------------------------------------------------------------------------
    public cl_BaseObj_v1_0() {
    }

    public cl_BaseObj_v1_0(cl_Vector_v1_0 vector, int iAMode) {
        this.vector = vector;
        this.iAMode = iAMode;
        //---------------------------------- impl 4 all visible objects
        this.shapeBObj = vector.getShape();
        this.edgeBObj = vector.getEdges();
        this.colorBObj = vector.getColor();
        //----------------------------------
        this.typeID = vector.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_Graph_v1_0 graph, int iAMode) {
        this.graph = graph;
        this.iAMode = iAMode;
        this.typeID = graph.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_Modul_v1_0 modul, int iAMode) {
        this.modul = modul;
        this.iAMode = iAMode;
        this.typeID = modul.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_ModSurface_v1_0 modSurface, int iAMode) {
        this.modSurface = modSurface;
        this.iAMode = iAMode;
        this.typeID = modSurface.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_File_v1_0 file, int iAMode) {
        this.file = file;
        this.iAMode = iAMode;
        this.typeID = file.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_CMPObject_v1_0 cmpObject, int iAMode) {
        this.cmpObject = cmpObject;
        this.iAMode = iAMode;
        this.typeID = cmpObject.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_OPObject_v1_0 opObject, int iAMode) {
        this.opObject = opObject;
        this.iAMode = iAMode;
        this.typeID = opObject.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_vNode_v1_0 node, int iAMode) {
        this.node = node;
        this.iAMode = iAMode;
        this.typeID = node.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_Matrix_v1_0 matrix, int iAMode) {
        this.matrix = matrix;
        this.iAMode = iAMode;
        this.typeID = matrix.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_Patrix_v1_0 patrix, int iAMode) {
        this.patrix = patrix;
        this.iAMode = iAMode;
        this.typeID = patrix.getTypeID();
    }

    public cl_BaseObj_v1_0(cl_URLcon_v1_0 url, int iAMode) {
        this.url = url;
        this.iAMode = iAMode;
        this.typeID = url.getTypeID();
    }
    public cl_BaseObj_v1_0(cl_ObjShapes_v1_0 shape, int iAMode) {
        this.shapeObj = shape;
        this.iAMode = iAMode;
        this.typeID = shape.getTypeID();
    }
    public cl_BaseObj_v1_0(cl_EdgesObj_v1_0 edge, int iAMode) {
        this.edgeObj = edge;
        this.iAMode = iAMode;
        this.typeID = edge.getTypeID();
    }
     //---------------------------------------------------------------------------
    public char[] getCl_TypeID() {
        return typeID;
    }

    public void setCl_TypeID(char[] typeID) {
        this.typeID = typeID;
    }

    public int[][] getObjPos() {
        return objPos;
    }

    public void setObjPos(int[][] objPos) {
        this.objPos = objPos;
    }

    // super ! fetch Position
    public int getInit_policy() {
        return init_policy;
    }

    public void setInit_policy(int init_policy) {
        this.init_policy = init_policy;
    }
    //---------------------------------------------------------------------------
    // get suitable Objs
    public cl_BaseObj_v1_0 getBaseObj() {
        return baseObj;
    }

    public void setBaseObj(cl_BaseObj_v1_0 baseObj) {
        this.baseObj = baseObj;
    }

    public cl_Vector_v1_0 getVector() {
        return vector;
    }

    public void setVector(cl_Vector_v1_0 vector) {
        this.vector = vector;
    }

    public cl_Graph_v1_0 getGraph() {
        return graph;
    }

    public void setGraph(cl_Graph_v1_0 graph) {
        this.graph = graph;
    }

    public cl_Modul_v1_0 getModul() {
        return modul;
    }

    public void setModul(cl_Modul_v1_0 modul) {
        this.modul = modul;
    }

    public cl_ModSurface_v1_0 getModSurface() {
        return modSurface;
    }

    public void setModSurface(cl_ModSurface_v1_0 modSurface) {
        this.modSurface = modSurface;
    }

    public cl_CMPObject_v1_0 getCmpObject() {
        return cmpObject;
    }

    public void setCmpObject(cl_CMPObject_v1_0 cmpObject) {
        this.cmpObject = cmpObject;
    }

    public cl_File_v1_0 getFile() {
        return file;
    }

    public void setFile(cl_File_v1_0 file) {
        this.file = file;
    }

    public cl_Matrix_v1_0 getMatrix() {
        return matrix;
    }

    public void setMatrix(cl_Matrix_v1_0 matrix) {
        this.matrix = matrix;
    }

    public cl_vNode_v1_0 getNode() {
        return node;
    }

    public void setNode(cl_vNode_v1_0 node) {
        this.node = node;
    }

    public cl_OPObject_v1_0 getOpObject() {
        return opObject;
    }

    public void setOpObject(cl_OPObject_v1_0 opObject) {
        this.opObject = opObject;
    }

    public cl_Patrix_v1_0 getPatrix() {
        return patrix;
    }

    public void setPatrix(cl_Patrix_v1_0 patrix) {
        this.patrix = patrix;
    }

    public cl_URLcon_v1_0 getUrl() {
        return url;
    }

    public void setUrl(cl_URLcon_v1_0 url) {
        this.url = url;
    }

    public cl_EdgesObj_v1_0 getEdgeObj() {
        return edgeObj;
    }

    public void setEdgeObj(cl_EdgesObj_v1_0 edgeObj) {
        this.edgeObj = edgeObj;
    }

    public cl_ObjShapes_v1_0 getShapeObj() {
        return shapeObj;
    }

    public void setShapeObj(cl_ObjShapes_v1_0 shapeObj) {
        this.shapeObj = shapeObj;
    }
    //---------------------------------------------------------------------------
    
}
