package com.bintang.ferry.resepmakanan;

/**
 * Created by Ferry on 11/10/2017.
 */

public class ListResep {
    private String judulResep, deskripsiResep, detailResep, judulDetail;
    private int gambarResep, gambarDetail;

    public ListResep(String judulResep, int gambarResep, String deskripsiResep, int gambarDetail,String detailResep, String judulDetail)
    {
        this.judulResep=judulResep;
        this.gambarResep=gambarResep;
        this.deskripsiResep=deskripsiResep;
        this.gambarDetail=gambarDetail;
        this.detailResep=detailResep;
        this.judulDetail=judulDetail;
    }
    public String getJudulResep()
    {
        return judulResep;
    }
    public String getDeskripsiResep()
    {
        return deskripsiResep;
    }
    public String getDetailResep()
    {
        return detailResep;
    }
    public  String getJudulDetail()
    {
        return judulDetail;
    }
    public int getGambarResep()
    {
        return gambarResep;
    }
    public int getGambarDetail()
    {
        return gambarDetail;
    }
}
