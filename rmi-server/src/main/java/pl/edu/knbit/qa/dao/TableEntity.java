package pl.edu.knbit.qa.dao;

import javax.persistence.*;

@javax.persistence.Table(name = "table", schema = "public", catalog = "postgres")
@Entity
@NamedQueries({
        @NamedQuery(name="Table.selectAll", query = "SELECT t FROM TableEntity t ORDER BY t.key DESC")
})
public class TableEntity {
    private String key;
    private String value;

    @javax.persistence.Column(name = "key")
    @Id
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @javax.persistence.Column(name = "value")
    @Basic
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableEntity that = (TableEntity) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}