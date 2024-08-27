package br.com.dbccompany.factory.data;

import br.com.dbccompany.dto.ProductDto;

public class ProductData {

    public ProductDto produtoExistente() {
        ProductDto productDto = new ProductDto();

        productDto.setName("Blouse");

        return productDto;
    }

    public ProductDto produtoInexistente() {
        ProductDto productDto = new ProductDto();

        productDto.setName("foobaa");

        return productDto;
    }
}
