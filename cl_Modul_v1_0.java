/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_Modul_v1_0 extends cl_DataDisc_v1_0 {
    // initial Graph

    private cl_Graph_v1_0 cl_graph = new cl_Graph_v1_0();
    private cl_Vector_v1_0[] cl_VecArr = null;
    private int fuzzState = 0;
    private cl_ModSurface_v1_0[] modSurfaceArr = null;
    // --------------------------------------------------------------------------
    private String modTag = null;
    private char[] typeID = new char[] {'m','o','d'};
    private char[] modDescr = null;
    private char[] modID = null; 
    private char[] modVer = null;

    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;
    
    public char[] getModVer() {
        return modVer;
    }

    public void setModVer(char[] modVer) {
        this.modVer = modVer;
    }
    // --------------------------------------------------------------------------
    public cl_Modul_v1_0() {
    }
    // Implementierung der Klasse cl_Moduls_v1_0
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // 001 --- Anforderungen der Konstruktorschnittstelle: ---
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // Die Module sind einem Schalenmodell nachempfunden und besitzen einen
    // Initialzustand in Form eines durch einen Ausgangspunkt dargestellten Graphensystem
    // die Menge der Graphen und die Richtungen, durch die diese Menge visualisiert wird,
    // richtet sich nach der Suchanfrage, die fï¿½r jede semantische Begriffsgruppe einen
    // Suchkegel bildet, der in Richtung des Ausgangspunktes zeigt. Es muss daher
    // eine Mï¿½glichkeit geben, dynamisch die Menge der entstehenden Vektoren zu generieren, 
    // wenn Informationen in die Knotenpunkte gespeichert werden.
    // Zusï¿½tzlich muss die Mï¿½glichkeit bestehen, dass von einer Schale zur nï¿½chsten
    // dynamisch Vektoren zwischen zwei bereits in der vorherigen Schale exisiterenden
    // auf den Graphenrichtungen fortgefï¿½hrte Vektoren, einzufï¿½gen (zu initialisieren)
    // obwohl diese in der vorhergehenden Schale noch nicht bestehen. 
    // Damit kann eine Verï¿½nderung der Bedeutung oder eine Erweiterung eines Suchthemas
    // verifiziert und in der Visualisierung deutbar gehalten werden.
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // 002 --- Anforderungen der Konstruktorschnittstelle: ---
    // -------------------------------------------------------------------------------------------------------------------------------------------------
    // Die Standardisierung legt fest, dass Module untereinander vergleichbar zu sein haben (Matrizze, Patrizze System)
    // Dadurch steht fest, dass jedes Modul eine boolsche Aussage ï¿½ber deren Inhalt oder deren Form ï¿½ber Differenzierungen
    // aussagen kann, sowie auch einzelne Vektoren vergleichbar sind.
    // Der dadurch entstehende Zusammenhang wird in der Hinsicht aus Effizienzgrï¿½nden dazu fï¿½hren, dass die Datendiscs,
    // die der chronologischen Ordnung von Modulketten dienen die Vektoren und daher die Module, die von einer Ebene
    // zur nï¿½chsten gleichen Inhalts bleiben auch nur als Replik abgebildet werden mï¿½ssen. (Performante Implementierung)
    // Inhaltlich hinzugewonnene Daten, werden neu Initialisiert und nach technisch logischer Semantik eingereiht.
    // "Content Evoliution Tracking"

    public cl_Modul_v1_0(char[] modID, char[] modVer, int fuzzState) {
        this.modID = modID;
        this.modVer = modVer;
        this.fuzzState = fuzzState;
    }

    public cl_Modul_v1_0(cl_Crawler_v1_0[] crawlers) {
    }

    public cl_Modul_v1_0(cl_Vector_v1_0[] cl_VecArr) {
        this.cl_VecArr = cl_VecArr;
    }

    public cl_Modul_v1_0(cl_ModSurface_v1_0[] modSurfaceArr) {
        this.modSurfaceArr = modSurfaceArr;
    }

    public cl_ModSurface_v1_0[] getModSurfaceArr() {
        return modSurfaceArr;
    }

    public void setModSurfaceArr(cl_ModSurface_v1_0[] modSurfaceArr) {
        this.modSurfaceArr = modSurfaceArr;
    }

    public cl_Vector_v1_0[] getCl_VecArr() {
        return cl_VecArr;
    }

    public void setCl_VecArr(cl_Vector_v1_0[] cl_VecArr) {
        this.cl_VecArr = cl_VecArr;
    }
    // get 0,1,-1

    public int getFuzzState() {
        return fuzzState;
    }

    public void setFuzzState(int fuzzState) {
        this.fuzzState = fuzzState;
    }
    // getGraph -> Maximum Vectors till state

    public cl_Graph_v1_0 getCl_graph() {
        return cl_graph;
    }
    // Getter for least overlay node (äußerster Vectorknoten in den Schichten 
    // wird beim Objektbauen gebraucht -> Alle Objekte werden als Reduktion aus einem
    // Modul heraus abgegrenzt (möglichkeit --> miteinbedacht, dass ein Vektor keine
    // Vorgänger haben muss um in einer Schicht einen Knoten zu beschreiben

    public cl_Vector_v1_0[] meth_getMaxVecNode_true() {
        for (int it_s0 = 0; it_s0 < modSurfaceArr.length; it_s0++) {
            for (int it_v0 = 0; it_v0 < modSurfaceArr[it_s0].getCl_vecArr().length; it_v0++) {
                if (modSurfaceArr[it_s0].getCl_vecArr()[it_v0].getFuzzState() == 1) {
                    return new cl_Vector_v1_0 [] {modSurfaceArr[it_s0].getCl_vecArr()[it_v0]};
                }
            }
        }
        return null;
    }
    public cl_Vector_v1_0[] meth_getMaxVecNode_fuzz() {
        for (int it_s0 = 0; it_s0 < modSurfaceArr.length; it_s0++) {
            for (int it_v0 = 0; it_v0 < modSurfaceArr[it_s0].getCl_vecArr().length; it_v0++) {
                if (modSurfaceArr[it_s0].getCl_vecArr()[it_v0].getFuzzState() == -1) {
                    return new cl_Vector_v1_0 [] {modSurfaceArr[it_s0].getCl_vecArr()[it_v0]};
                }
            }
        }
        return null;
    }
    public char[] getModDescr() {
        return modDescr;
    }

    public void setModDescr(char[] modDescr) {
        this.modDescr = modDescr;
    }

    public char[] getModID() {
        return modID;
    }

    public void setModID(char[] modID) {
        this.modID = modID;
    }
    public char[] getTypeID() {
        return this.typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }
   
    public String getModTag() {
        return modTag;
    }

    public void setModTag(String modTag) {
        this.modTag = modTag;
    }
    //---------------------------------------------------------------------------

    public cl_Color_v1_0 getColor() {
        return color;
    }

    public void setColor(cl_Color_v1_0 color) {
        this.color = color;
    }

    public cl_EdgesObj_v1_0 getEdges() {
        return edges;
    }

    public void setEdges(cl_EdgesObj_v1_0 edges) {
        this.edges = edges;
    }

    public cl_ObjShapes_v1_0 getShape() {
        return shape;
    }

    public void setShape(cl_ObjShapes_v1_0 shape) {
        this.shape = shape;
    }
    
    
}
