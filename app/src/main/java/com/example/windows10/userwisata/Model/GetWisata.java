package com.example.windows10.userwisata.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetWisata {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private List<Wisata> result = null;

    public GetWisata(String status, List<Wisata> result) {
        super();
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetWisata withStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Wisata> getResult() {
        return result;
    }

    public void setResult(List<Wisata> result) {
        this.result = result;
    }

    public GetWisata withResult(List<Wisata> result) {
        this.result = result;
        return this;
    }

}
