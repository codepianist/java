package com.codepianist.springbatch.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
@Entity
@Table(name= "asset_prices")
@Data @NoArgsConstructor
public class AssetEntity {

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String label;
    private LocalDate moment;

//    public void setMoment(String moment) {
//        this.moment = LocalDate.of(extract(moment, 0, 3), extract(moment, 4,5), extract(moment, 6,7));
//    }

    //public enum Hit { TOP, DOWN }
    private String hit;
    private Double price;

    public AssetEntity(String label, LocalDate moment, String hit, Double price) {
        log.info("Full args");
        this.label = label;
        this.moment = moment;
        this.hit = hit;
        this.price = price;
    }

    public AssetEntity(String label, String moment, String hit, String price) {
        log.info("Full Sting args");
        this.label = label;
        this.moment = LocalDate.of(extract(moment, 0, 3), extract(moment, 4,5), extract(moment, 6,7));
        //this.hit = AssetEntity.Hit.valueOf(hit);;
        this.hit = hit;
        this.price = Double.valueOf(price);
    }

    public AssetEntity(String ...args) {
        log.info("Full Sting args");
        this.label = label;
        this.moment = LocalDate.of(extract(args[1], 0, 3), extract(args[1], 4,5), extract(args[1], 6,7));
        //this.hit = AssetEntity.Hit.valueOf(args[2]);;
        this.hit = args[2];
        this.price = Double.valueOf(args[3]);
    }

    private int extract(String str, int from, int to){
        return Integer.parseInt(str.substring(from, to));
    }

}
