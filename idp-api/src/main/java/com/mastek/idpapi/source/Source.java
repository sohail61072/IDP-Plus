package com.mastek.idpapi.source;

import javax.persistence.*;

@Entity
@Table(name="manage_sources")
public class Source {
    private int sourceId;

    private String sourceName;
    private String sourceType;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
}
