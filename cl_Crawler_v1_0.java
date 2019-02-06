/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerSemPhoneIILib;

/**
 *
 * @author geonb
 */
public class cl_Crawler_v1_0 {
    // crawler crawl (take a schork bag)
    // Der Crawler erh�lt eine Liste von URLs oder IP Adressen, die Besucht werden sollen
    // und dann nach einer gewissen Routine ausgewertet werden
    // Jedes Modul enth�lt einen Crawler und kann als Threadpaket parallel abgeschickt werden
    // Die Parallelen Prozesse k�nnen durch ein
    // Ressourcendiagramm predefiniert werden - dadurch kann das Betriebssystem
    // im Vorhinein �ber die Verschiebung des Nullpunkts bez�glich eines xy-Diagramms
    // Ressourcen - Zeit Diagramm alle freien Einheiten Verwenden, die mit dem
    // n�chsten Schritt nicht vom ProcedurVektor betroffen sind - d.h. auch alle
    // Resourcen, die unterhalb des hierarchischen Diagramms nicht in Verwendung sind
    // siehe -> Tan linearisierungsalgorithmus (cl_Matrix_v1_0)
    // Der Crawler kann wie erw�hnt ein Snipplet auf Text analysieren oder einen Text extrahieren
    // Er sollte nach g�ltigen Downloadlinks suchen k�nnen und diese nach zum Beispiel "Servergeschwindigkeit"
    // ordnen, oder parallel mehrere Quellen zum Downloaden verwenden (aber dazu sp�ter)
    // Der Crawler ist Teil des Browsers - beide weden am Schluss entworfen
    private cl_Query_v1_0[] queries;
    private cl_QGroup_v1_0[] quGroup;
    
    public cl_Crawler_v1_0() {
    }
    public cl_Crawler_v1_0(cl_URLcon_v1_0 urlCon) {        
    }
    public cl_Crawler_v1_0(cl_URLcon_v1_0 urlCon, cl_Query_v1_0[] queries) {
        this.queries = queries;
    }
    public cl_Crawler_v1_0(cl_URLcon_v1_0 urlCon, cl_QGroup_v1_0[] quGroup) {
        this.quGroup = quGroup;
    }
}
