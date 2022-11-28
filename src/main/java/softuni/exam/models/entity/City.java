package softuni.exam.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City extends BaseEntity {

    private String cityName;
    private String description;
    private Integer population;
    private Country country;

    @Column(unique = true, nullable = false)
    public String getCityName() {
        return cityName;
    }

    public City setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public City setDescription(String description) {
        this.description = description;
        return  this;
    }

    @Column(nullable = false)
    public Integer getPopulation() {
        return population;
    }

    public City setPopulation(Integer population) {
        this.population = population;
    return this;
    }

    @ManyToOne
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
