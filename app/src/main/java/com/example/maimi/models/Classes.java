package com.example.maimi.models;

import android.widget.TextView;

/**
 * Created by minhtien on 8/1/2016.
 */
public class Classes {
    private String txtName;
    private String txtLevel;
    private String txtDes;
    private int idImgTank;

    public Classes(String txtName, String txtLevel, String txtDes, int idImgTank) {
        this.txtName = txtName;
        this.txtLevel = txtLevel;
        this.txtDes = txtDes;
        this.idImgTank = idImgTank;
    }

    public String getTxtName() {
        return txtName;
    }

    public String getTxtLevel() {
        return txtLevel;
    }

    public String getTxtDes() {
        return txtDes;
    }

    public int getIdImgTank() {
        return idImgTank;
    }
}
