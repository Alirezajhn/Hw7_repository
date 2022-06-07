package com.maktabsharif74.domain;

import javax.persistence.Entity;

@Entity

public class Radio extends ElectricalAppliances{
    private String waveRange;

    public Radio() {

    }

    public Radio(int id, int unit, int price, String powerSource, String brand, String model, String waveRange) {
        super(id, unit, price, powerSource, brand, model);
        this.waveRange = waveRange;

    }

    public String getWaveRange() {
        return waveRange;
    }

    public void setWaveRange(String waveRange) {
        this.waveRange = waveRange;
    }


    @Override
    public String toString() {
        return "Radio{" +
                super.toString() +
                "waveRange='" + waveRange + '\'' +
                '}';
    }
}
