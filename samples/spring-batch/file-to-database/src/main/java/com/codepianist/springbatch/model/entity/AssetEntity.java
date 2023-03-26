package com.codepianist.springbatch.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name= "asset_prices")
@Data @NoArgsConstructor //@AllArgsConstructor
public class AssetEntity {

    @Id
    private String label;
    private LocalDate moment;

    public void setMoment(String moment) {
        this.moment = LocalDate.of(extract(moment, 0, 3), extract(moment, 4,5), extract(moment, 6,7));
    }

    public enum Hit { TOP, DOWN }
    private Hit hit;
    private Double price;

    public AssetEntity(String label, String moment, String hit, String price) {
        this.label = label;
        this.moment = LocalDate.of(extract(moment, 0, 3), extract(moment, 4,5), extract(moment, 6,7));
        this.hit = AssetEntity.Hit.valueOf(hit);;
        this.price = Double.valueOf(price);
    }

    private int extract(String str, int from, int to){
        return Integer.parseInt(str.substring(from, to));
    }

}
