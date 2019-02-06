/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_CoreDistr_v1_0 extends cl_BaseSystem_v1_0 {
    // Kerndistibution Beschreibung
    // Das Betriebssystem ist so konzipiert, dass es auf einem optisch dynamischen
    // Chip aufsetzt, der in seinem Entwurf aus drei Teilen besteht
    // 1.) Polungsschicht f�r Graphen (Fer -> Eisenkern f�r Photonendiffusion -> Plasmonentheorie) -> TransisorGatter dynmisch anordenbar (Physical Emulators)
    // 2.) Gattersystem -> RegisterLochGatter mit PunktFiltern pro RasterLochPosition ==> (NEck bis Kreis -> Blende f�r Plasmonenfarbindexierung -> Skalarplasmonentheorie)
    // 3.) Modulsystem Kernspeicher in Form von Halbschalen im Petabytebereich pro Rasterpunkt -> Linkersystem (Alle LinkerPunkte der Halbschale sind verkn�pfbar (Ebene y, Iterativ,Rekursiv Funktional)
    // --> Maschinensprachkern -> 1:1 Graphensystem und Emulatorsystem (Gatter�bersetzer Allokator Gruppierer)
    public cl_CoreDistr_v1_0() {
    }
    // Die bootf�hige Virtuelle Maschine implementieren
}
