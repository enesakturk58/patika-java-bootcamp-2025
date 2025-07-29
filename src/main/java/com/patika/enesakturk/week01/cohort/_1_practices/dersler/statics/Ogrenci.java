package com.patika.enesakturk.week01.cohort._1_practices.dersler.statics;

public class Ogrenci {

    private Long id ;
    private String ad;
    private String soyAd;
    public static String numara;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getSoyAd() {
        return soyAd;
    }
}
