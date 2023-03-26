package com.codepianist.springbatch.model;

import com.codepianist.springbatch.model.entity.AssetEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class AssetProcessor implements ItemProcessor<AssetEntity, AssetEntity> {

    @Override
    public AssetEntity process(AssetEntity item) throws Exception {
        log.info("Processing...");
//        log.info("Parsing {}...", String.join(", ", Arrays.asList(item)));
//        String label = item[0];
//        LocalDate moment = LocalDate.of(extract(item[1], 0, 3), extract(item[1], 4,5), extract(item[1], 6,7));
//        AssetEntity.Hit hit= AssetEntity.Hit.valueOf(item[2]);
//        Double price = Double.valueOf(item[3]);
//        return new AssetEntity(label, moment, hit, price);
        return item;
    }

    private int extract(String str, int from, int to){
        return Integer.parseInt(str.substring(from, to));
    }

}
