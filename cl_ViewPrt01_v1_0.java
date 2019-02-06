/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_ViewPrt01_v1_0 {
    // Der Viewport 01 ist das MainGUI des Systems das das Datendiscsystem
    // abstahiert darstellt (siehe Drafts PSPII -> dia_001(Operational_Layout_raw)[txt_000]
    // Der Viewport enth�lt zwei innerliche Viewports 
    // (Dropfields Viewport zum hineinziehen der Module -> Bearbeitung (hardcopy, sessioncopy) 
    // + ModMagneticNeedle f�r rotationen (phi0, phi1) und zoom zwei finger ausziehen der Module
    // siehe Drafts PSPII -> dia_002_poster_4_v3_3_croped
    // Die ModMAgneticNeedle ist im Rechten Viewport mit den Dropfields (Quadratisches Layout 2D)
    // Unterhalb im rechten Viewport ist eine Liste der in die Dropfields gedragten Module
    // Die NodeView enth�lt den Bezeichner der zugeh�rigen Datadisc und die die Inhalte beinhaltenden Module als vertikale scrollbare Leiste 
    // Zur Leiste werden die Policies dargestellt (Vorteil f�r Controller -> Abschnitte zwar f�r Coder sichtbar, Aufgabenbereich [Editierbarkeit]
    // jeodch klar abgrenzbar und definierbar.
    // die M�glichkeit Datan in die Bearbeitungsliste aufzunehmen ist auch im Operationsmen� des PickingDialogs m�glich
    
    public cl_ViewPrt01_v1_0() {
    }
}
