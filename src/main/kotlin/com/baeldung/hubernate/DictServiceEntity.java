package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_SERVICE", schema = "LOCALDEV", catalog = "")
public class DictServiceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 255)
    private String id;
    @Basic
    @Column(name = "MAIN_CLASS", nullable = false, length = 255)
    private String mainClass;
    @OneToMany(mappedBy = "dictServiceByServiceId")
    private Collection<DictServiceNodeEntity> dictServiceNodesById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictServiceEntity that = (DictServiceEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(mainClass, that.mainClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mainClass);
    }

    public Collection<DictServiceNodeEntity> getDictServiceNodesById() {
        return dictServiceNodesById;
    }

    public void setDictServiceNodesById(Collection<DictServiceNodeEntity> dictServiceNodesById) {
        this.dictServiceNodesById = dictServiceNodesById;
    }
}
