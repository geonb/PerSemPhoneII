/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
class cl_BaseSystem_v1_0 extends cl_ObjCMPMgnt_v1_0 {
    // Das Basissystem ist ein 3D Abschnitt im Jogl3D-Raum
    // Jeglicher Vektorbetrag in einer ModulSurface (KreisSchicht)
    // Kann nach dem Zeitabschnitt und G�ltigkeitsBereich k�rzer oder l�nger
    // angelegt werden -> sp�tere Implementierung der Konsole -> Editor
    // Dadurch werden zum Beispiel Knotenpunkte in Intervallen hintereinander
    // abgearbeitet -> Parallele Analyse des Scheduling algorithmus ... 
    // Das hei�t, das die Kreisschichten nicht mehr gleich lange Vektoren
    // beinhalten sondern diese nach Bogenabschnitten verschiedene Gr��en beinhalten k�nnen
    // Damit ist mathematisch ein Interpreter (*?) m�glich (siehe Minkovsky Diagramme (nicht euklidische Diagramme)
    // Das baseSystem wird als 3D integerArray entweder als hardcopy + registry statecapure mirror oder als sessioncopy abgespeichert
    // Alles andere wird �ber das GUI erledigt (d.h. der 3DRaum von Jogl indem das 
    // Packet PersemPhoneII liegt wird in die 3 Columnen des Db_PerSemPhoneII abgelegt
    private cl_BaseObj_v1_0[][] baseObjArr = null;
    
    public cl_BaseSystem_v1_0() {
    }
    public cl_BaseSystem_v1_0(cl_BaseObj_v1_0[][] baseObjArr) {
        this.baseObjArr = baseObjArr;
    }

}
