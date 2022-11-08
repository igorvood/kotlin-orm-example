package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "META_PROPERTY_FUNCTION", schema = "LOCALDEV", catalog = "")
public class MetaPropertyFunctionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 256)
    private String id;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 512)
    private String description;
    @OneToMany(mappedBy = "metaPropertyFunctionByFunctionId")
    private Collection<DictFlinkPropValueEntity> dictFlinkPropValuesById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetaPropertyFunctionEntity that = (MetaPropertyFunctionEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    public Collection<DictFlinkPropValueEntity> getDictFlinkPropValuesById() {
        return dictFlinkPropValuesById;
    }

    public void setDictFlinkPropValuesById(Collection<DictFlinkPropValueEntity> dictFlinkPropValuesById) {
        this.dictFlinkPropValuesById = dictFlinkPropValuesById;
    }
}
