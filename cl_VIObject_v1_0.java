/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_VIObject_v1_0 {
    // Sichtbare Objekte (build Wireframes for Joglspace) (r, s/w)
    // Zwei Mï¿½glichkeiten sind zu beachten -> Persistenz in einem JoglObjectstorageSystem (Daten liegen in gezeichneter Form vor)
    // Datenbank spielt daten in den Zeichenraum -> entweder oder
    // Zukunftsperspektive (layerfittings --> hardcopy - software state caputing model - sessioncopy) anhand der die Persistenz entschieden werden muss
    // Vorteil am 3 stateLayer -> sessions kï¿½nnen Replicen von Virtuellen Ressourcen erzeugen und sind unabhï¿½nig in der session parallel erstellbar bis sie
    // in die hardcopy geschrieben werden. (virtual machines rule - option)
    // OPObjekte sind auf VIObjekte anwendbar -> Dualismus Operationalitï¿½t
    private cl_BaseObj_v1_0[] baseObjArr = null;
    private cl_BasePolicies_v1_0 cl_basePlcy = null;
    // Integriert jegliche Objekte in die Session-Registry -> Capturing
    public cl_VIObject_v1_0() {
    }
    // Ein virtuelles Objekt besteht aus einem oder mehreren Basisobjekten,
    // an dessen Konstruktor die jeweilige Klasse des Inhaltobjekts
    // übergeben wird.
    // Für ein virtuelles Objekt sind die basisObjekte die Teile (Komponenten)
    // des gesamtobjekts, so wie es zum Beispiel im GUI dargestellt wird.
    // Jedes VIObj bedarf einer eigenen Definition seiner Bestandteile
    // Z.B. Ecken, Form und Farbe des Teilobjekts
    // dazu kommen die Interaktiven oder passiven Teile der Teilobjekte
    // D.h. Basisobjekte haben die Eigenschaft interaktiv oder passiv ereugt zu werden
    public cl_VIObject_v1_0(cl_BaseObj_v1_0[] baseObjArr) {
        this.baseObjArr = baseObjArr;
    }
    
    
}
