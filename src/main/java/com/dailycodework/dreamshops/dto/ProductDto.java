package com.dailycodework.dreamshops.dto;

import com.dailycodework.dreamshops.model.Category;
import com.dailycodework.dreamshops.model.Image;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {







        private Long id;

        private String name;


        private String brand;


        private BigDecimal price;


        private int inventory;


        private String description;


        //類別不依賴產品 但是圖片依賴產品

//ex 販賣三星電腦 我們有專門的分類
//如果我們決定不再銷售三星筆記型電腦 那麼指向該三星的類別應該刪除 如果該類別不適用於其他不同品牌的其他產品

        //    private List<Product> products;

        private Category category;


        private List<ImageDto> images;






}
