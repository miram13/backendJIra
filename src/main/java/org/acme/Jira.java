
package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Jira extends PanacheEntity {
    @Column
    public String issue ;
    @Column
    public String summary;
    @Column
    public String label;
    @Column
    public  String request;
    @Column
    public String development;
    @Column
    public  String state;
//    @Column
//    public String fixversions = "";
//    @Column
//    public String Assigneename = "";
//    @Column
//    public String reportername = "";
//    @Column
//    public String status = "";



}



