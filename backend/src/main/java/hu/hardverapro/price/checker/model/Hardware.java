package hu.hardverapro.price.checker.model;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long data_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Long max_price;

    @Column(nullable = false)
    private String base_url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getData_id() {
        return data_id;
    }

    public void setData_id(Long data_id) {
        this.data_id = data_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getMax_price() {
        return max_price;
    }

    public void setMax_price(Long max_price) {
        this.max_price = max_price;
    }

    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Hardware hardware)) return false;

        return new EqualsBuilder().append(id, hardware.id).append(data_id, hardware.data_id).append(name, hardware.name)
                .append(category, hardware.category).append(max_price, hardware.max_price).append(base_url, hardware.base_url).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(data_id).append(name)
                .append(category).append(max_price).append(base_url).toHashCode();
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "id=" + id +
                ", data_id=" + data_id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", max_price=" + max_price + '\'' +
                ", baseUrl=" + base_url +
                '}';
    }
}
