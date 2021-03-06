package com.ssowens.android.homefornow.models;

import android.text.TextUtils;

import java.util.List;

/**
 * Created by Sheila Owens on 8/13/18.
 */
public class HotelDetailData {

    private String type;
    private Hotel hotel;
    private boolean available;
    private List<Offers> offers;
    private String imageUrl;
    private String guests;
    private String price;
    public String description;
    private String bed;
    private String bedType;
    private Float latitude;
    private Float longitude;


    public String getType() {
        if (!TextUtils.isEmpty(type)) {
            return type;
        } else return "";
    }

    public Hotel getHotel() {
        return hotel;
    }

    public boolean isAvailable() {
        return available;
    }

    public List<Offers> getOffersList() {
        return offers;
    }

    public List<Offers> getOffers() {
        return offers;
    }

    public String getImageUrl() {
        return getHotel().getMedia().get(0).getHotelPhotoUrl();
    }


    public String getGuests() {
        if (getOffers() != null) {
            if (!TextUtils.isEmpty(getOffers().get(0).getGuests().getAdults()))
                return getOffers().get(0).getGuests().getAdults() + " " + "guests";
        }
        return "0";
    }

    public String getPrice() {
        String price = "$0.00";
        if (getOffers() != null) {
            if (!TextUtils.isEmpty(getOffers().get(0).getPrice().getTotal())) {
                price = "$" + getOffers().get(0).getPrice().getTotal()
                        + " " + getOffers().get(0).getPrice()
                        .getCurrency();
            }
        }
        return price;
    }

    public String getDescription() {
        if (getOffers() != null) {
            if (!TextUtils.isEmpty(getOffers().get(0).getRoom().getDescription().getText())) {
                return getOffers().get(0).getRoom().getDescription().getText();
            }

        }
        return "";
    }


    public int getBed() {
        return getOffers().get(0).getRoom().getTypeEstimated().getBeds();
    }

    public String getBedType() {
        if (getOffers().get(0).getRoom().getTypeEstimated().getBedType() != null) {
            return getOffers().get(0).getRoom().getTypeEstimated().getBedType();
        }
        return "";
    }

    public Float getLatitude() {
        latitude = 0.0f;
        if (getHotel() != null) {
            if (getHotel().getLatitude() != 0.0) {
                return getHotel().getLatitude();
            }
        }
        return latitude;
    }

    public Float getLongitude() {
        longitude = 0.0f;
        if (getHotel() != null) {
            if (getHotel().getLongitude() != 0.0) {
                return getHotel().getLongitude();
            }
        }
        return longitude;
    }

    @Override
    public String toString() {
        return "HotelDetailData{" +
                "type='" + type + '\'' +
                ", hotel=" + hotel +
                ", available=" + available +
                ", offers=" + offers +
                ", imageUrl='" + imageUrl + '\'' +
                ", guests='" + guests + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", bed='" + bed + '\'' +
                ", bedType='" + bedType + '\'' +
                '}';
    }
}
