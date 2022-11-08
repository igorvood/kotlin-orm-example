package com.baeldung.hubernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DictKafkaPropertyGrpEntityPK implements Serializable {
    @Column(name = "ID", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "TYPE_READ", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String typeRead;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeRead() {
        return typeRead;
    }

    public void setTypeRead(String typeRead) {
        this.typeRead = typeRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictKafkaPropertyGrpEntityPK that = (DictKafkaPropertyGrpEntityPK) o;
        return Objects.equals(id, that.id) && Objects.equals(typeRead, that.typeRead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeRead);
    }
}
