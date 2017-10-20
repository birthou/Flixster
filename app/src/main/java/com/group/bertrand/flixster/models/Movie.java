package com.group.bertrand.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Bertrand on 10/18/2017.
 */

public class Movie {

    //values from API
    private String title;
    private String overview;
    private String posterpath; //only the path

    public Movie(JSONObject object) throws JSONException {
        title=object.getString("title");
        overview=object.getString("overview");
        posterpath=object.getString("posterpath");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterpath() {
        return posterpath;
    }
}
