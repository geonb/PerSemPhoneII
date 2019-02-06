/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_Matrix_v1_0 extends cl_Grid_v1_0{
    // Der Klasse Matrix kann eine Patrizze �bergeordnet werden, die
    // ein bestimmtes Ergebnis verlangt
    // die Matrix ist ein 3D Raum deren Komponenten Datendiscs und
    // Module in Form eines Ebenensystems beinhaltet
    // Jede Ebene stellt eine Zeitschicht oder eine Anordnung dar, deren x-Achse -> ModulAchse
    // und deren y-Achse -> DatadiscAchse und deren zAchse -> Zeitachse ->
    // zeitlich zur�ckliegende Datendiscs oder einfach zAchse -> ben�tigte
    // Datendiscs in der zAchse ohne Zeitver�nderung f�r einen Patrizzevergleich
    // Der Verglich kann nach der Fuzzylogik eine Form von �hnlichkeit berechnen 0,1,-1
    // Der Normale Vorgang beim Anlegen einer Datendisc wird sein, dass eine Gruppe von Suchw�rtern
    // zu einem bestimmten Datum (+ UhrZeit) angelegt wird und sich die Ergebnisse in dynamisch 
    // allozierte Module einf�gen (aus Graphen werden Vectoren mit Nodeinhalten generiert solange
    // das Suchkriterium erf�llt ist. Bei Abweichungen k�nnen �ber Differenzierungen �bereinstimmungen
    // nach Fuzzylogik evaluiert werden welches den Winkel der angelegten Vektoren an die Graphen
    // beeinflusst (�ber Module ist die mathematische Vollst�ndigkeit bez�glich Differenzialrechnungen gegeben - denn die Suchkriterien
    // k�nnen �ber Iterationen auch GleitkommazahlenArrays sein)
    // Bei textuellen oder Wert�hnlichen Ergebnissen k�nnen Vektoren innerhalb zweier bereits evaluierten Themen (also bereits angelegten momentan benachbarten 
    // Vektoren eingef�gt werden (dies geschieht �ber faktorielle Erweiterung des Auffassungsverm�gens einer Schicht)
    // Damit ist das mathematische Kriterium der dynamischen Erweiterbarkeit erf�llt.
    // Indem Vektoren (Knoten) an einer beliebigen Schicht eingef�gt werden k�nnen, muss 1. das Graphensystem nur eine
    // Ausgangsmenge an Graphen enthalten, die so erweitert werden muss, dass sich das Modulsystem den Maximalwert der vorkommenden
    // Vektoren daraus ablesen kann. Es kann n�mlich sein, dass in einer weiteren Schicht weniger Vektoren ben�tigt werden, weil Teilergebnisse
    // gel�scht wurden und dadurch wegfallen. D.h. ein Graph eines Moduls enth�lt immer den Maximalwert der momentan gebildeten Vektorkreisschichten
    // Es muss also gegen sein, dass jeder Vektor3dWinkel in einem Modul auch in der Initialposition nicht im Ursprung liegen muss, sondern
    // bei semantischer Suche auch ein Ergebniss anh�ngen (besser einh�ngen) kann und auch nicht bis zum Ende der Analyse fortgef�hrt werden muss, falls
    // die Suche oder der Algorithmus es anders beinhaltet.
    // Die Verl�ngerung eines Vectors geschieht �ber eine linearisierten optimierten Algorithmus �nlich dem des Streckenabtragens.
    // Der Vektor enth�lt immer die zwei Winkel phi0 und phi1, die �ber zwei For-SChleifen und der Jogl Rotation in die gew�nschte richtung zu bringen sind
    // Um einen Vector gleichen Betrages zu verl�ngern, also einen Gleichwertigen daraufzusetzen, wird der Tangens linear abstrahiert
    // Beschreibung --> tan 45� == 1.0 solange phi0,1 unter 45� ist ist jede Elementare Einheit auf der x-Achse gleich der auf der y-Achse zu sehen.
    // Dadurch entsteht immer ein Quadrat --> E0 bis E27 -> 27 Einheiten in x-Richtung ensprechen 27 - Einheiten in y-Richtung
    // tan 45� ist 1.0 -> d.h ist der Winkel eines Vektors gegeben kann mit (1.0 / phi(0||1) * deltaE0 - E27) ein Betragsgleicher Vector in die neue Schicht geschoben werden
    // In der Regel ist En == 1.0 Schichten haben immer den gleichen Vektorbetrag zu haben.
    // Ist der Winkel zwischen 0� und 360� auf den i* (45 - 90) liegenden Bereichen, wird von x = 1.0 zur�ckgerechnet und dadurch der Tangens umgangen
    // Durch das bedingte Kippen der Koordinatenachsen ist die Komplexit�t der Berechnung verschiebbar und kann bei bedarf dann in Form einer Komplexit�tsklasse (Funktion)
    // angepasst werden -> dies sollte auch mit der Komplexit�tsklasse der Visualisierung geschehen (aber dazu sp�ter) (Was k�mmert mi a ludlfleck wenn i dann die fudlleck)
    private cl_DataDisc_v1_0[][] cl_dDiscArr = null;
    private cl_Modul_v1_0[][] cl_ModArr = null;
    private char[] typeID = new char[] {'m','t','x'};
    public cl_Matrix_v1_0() {
    }
    public cl_Matrix_v1_0(cl_DataDisc_v1_0[][] cl_dDiscArr) {
        this.cl_dDiscArr = cl_dDiscArr;
    }

    public cl_Matrix_v1_0(cl_Modul_v1_0[][] cl_modArr) {
        this.cl_ModArr = cl_modArr;
    }

    public cl_Modul_v1_0[][] getCl_ModArr() {
        return cl_ModArr;
    }

    public void setCl_ModArr(cl_Modul_v1_0[][] cl_ModArr) {
        this.cl_ModArr = cl_ModArr;
    }

    public cl_DataDisc_v1_0[][] getCl_dDiscArr() {
        return cl_dDiscArr;
    }

    public void setCl_dDiscArr(cl_DataDisc_v1_0[][] cl_dDiscArr) {
        this.cl_dDiscArr = cl_dDiscArr;
    }

    public char[] getTypeID() {
        return typeID;
    }
    
    
    
}
