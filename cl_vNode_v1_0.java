/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

import PerSemPhoneIILib.types.cl_DotNode_v1_0;

/**
 *
 * @author geonb
 */
public class cl_vNode_v1_0 {

    private cl_File_v1_0[] fileArr = null;
    private cl_DotNode_v1_0 dotNode = null;
    private char[] typeID = new char[]{'n', 'o', 'd'};
    private cl_Color_v1_0 color = null;
    private cl_EdgesObj_v1_0 edges = null;
    private cl_ObjShapes_v1_0 shape = null;

    public cl_vNode_v1_0(cl_File_v1_0[] fileArr) {
        this.fileArr = fileArr;
    }

    public cl_vNode_v1_0(cl_DotNode_v1_0 dotNode) {
        this.dotNode = dotNode;
    }

    // Knoten befinden sich an der Spitze jedes Vektors und stellen
    // ein Datanarray dar ->"[]" - die Knoten k�nnen nur in der Membran der Halbschale an
    // jeglicher Vektorspitze stehen
    // Dies geschieht damit Sie vom Linker als Verbindungslinien innerhalb der Halbschalen
    // verkn�pft werden k�nnen.
    // Jeder Link verifiziert die Identit�t der Verkn�pfung �ber das Nodesystem
    // Die Nodes enthalten alls Dataninformationen, die zu einem Suchergebnis oder einem
    // Thema (Algorithmus, Zeichnung, 3DKonstukt) erstellt werden.
    // Jedem File sind Permissions zugeodnet, d.h. innerhalb der Daten des Nodes
    // sind dann Bereiche mit gr�n, gelb und rot innerhalb der vertikalen Scrollbars vorzufinden
    // Der Inhalt eines Nodes kann zoomend und drehend auf das Desktop gelegt werden (siehe Animation sp�ter)
    public char[] getTypeID() {
        return typeID;
    }

    public void setTypeID(char[] typeID) {
        this.typeID = typeID;
    }

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
