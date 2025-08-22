package io.lrsystem.lrcomerce.dto;

import io.lrsystem.lrcomerce.entities.Product;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class ProductDTO {

    private Long id;

    @Size(min = 3,max = 80,message = "Nome deve ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo não pode ser em branco")
    private String name;

    @Size(min = 10, message = "Campo de ter no minimo 10 caracters")
    @NotBlank(message = "Campo não pode ser em branco")
    private String description;

    @PositiveOrZero(message = "Prço deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO () {}

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
