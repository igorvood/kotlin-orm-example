package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_PLACE_HOLDER", schema = "LOCALDEV", catalog = "")
public class DictPlaceHolderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 255)
    private String id;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    private String description;
    @Basic
    @Column(name = "DEFAULT_VALUE", nullable = false, length = 256)
    private String defaultValue;
    @OneToMany(mappedBy = "dictPlaceHolderByPlaceHolderId")
    private Collection<DictPlaceHolderByServiceEntity> dictPlaceHolderByServicesById;

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

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictPlaceHolderEntity that = (DictPlaceHolderEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(description, that.description) && Objects.equals(defaultValue, that.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, defaultValue);
    }

    public Collection<DictPlaceHolderByServiceEntity> getDictPlaceHolderByServicesById() {
        return dictPlaceHolderByServicesById;
    }

    public void setDictPlaceHolderByServicesById(Collection<DictPlaceHolderByServiceEntity> dictPlaceHolderByServicesById) {
        this.dictPlaceHolderByServicesById = dictPlaceHolderByServicesById;
    }
}
