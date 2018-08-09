package com.ssowens.android.homefornow.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.ssowens.android.homefornow.models.HotelOffersResponse;

import java.lang.reflect.Type;

/**
 * Created by Sheila Owens on 8/7/18.
 */
public class HotelOffersListDeserializer implements JsonDeserializer<HotelOffersResponse> {
    @Override
    public HotelOffersResponse deserialize(
            JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        JsonArray jsonArray = json.getAsJsonArray();
        return new Gson().fromJson(jsonArray, HotelOffersResponse.class);
    }
}
