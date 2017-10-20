package com.group.bertrand.flixster.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Bertrand on 10/18/2017.
 */

public class Config {

    //the base URL for the loading images
    String imageBaseUrl;
    //the poster size to use when fetching images, part of the url
    String posterSize;

    public Config(JSONObject object) throws JSONException {
        JSONObject images=object.getJSONObject("images");
        //get the image base url
        imageBaseUrl=images.getString("secure_base_url");
        //get the poster size
        JSONArray posterSizeOption =images.getJSONArray("poster_sizes");
        //use the option at index 3 or w342 as a fallback
        posterSize = posterSizeOption.optString(3,"w342");
    }

    //helper method for creating urls
    public String getImageUrl(String size, String path){
        return String.format("%s%s%s", imageBaseUrl, size,path); //concatenate all three

    }

    public String getImageBaseUrl() {
        return imageBaseUrl;
    }

    public String getPosterSize() {
        return posterSize;
    }
}
