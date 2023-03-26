package com.codepianist.springbatch.model;

import com.codepianist.springbatch.model.entity.AssetEntity;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import java.net.BindException;
import java.time.LocalDate;

public class AssetMapper implements FieldSetMapper<AssetEntity> {
    @Override
    public AssetEntity mapFieldSet(FieldSet fieldSet) {
        AssetEntity inst = new AssetEntity();
        inst.setLabel(fieldSet.readString("label"));
        String dt= fieldSet.readString("moment");
        inst.setMoment(LocalDate.of(extract(dt, 0, 3), extract(dt, 4,5), extract(dt, 6,7)));
        //inst.setHit(AssetEntity.Hit.valueOf(fieldSet.readString("hit")));
        inst.setHit(fieldSet.readString("hit"));
        inst.setPrice(Double.valueOf(fieldSet.readString("price")));
        return inst;
    }

    private int extract(String str, int from, int to){
        return Integer.parseInt(str.substring(from, to));
    }
}
