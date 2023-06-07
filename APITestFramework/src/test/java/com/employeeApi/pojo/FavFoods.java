
package com.employeeApi.pojo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FavFoods {

    @JsonProperty("lunch")
    private String lunch;
    @JsonProperty("breakfast")
    private String breakfast;
    @JsonProperty("dinner")
    private List<String> dinner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("lunch")
    public String getLunch() {
        return lunch;
    }

    @JsonProperty("lunch")
    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    @JsonProperty("breakfast")
    public String getBreakfast() {
        return breakfast;
    }

    @JsonProperty("breakfast")
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    @JsonProperty("dinner")
    public List<String> getDinner() {
        return dinner;
    }

    @JsonProperty("dinner")
    public void setDinner(List<String> dinner) {
        this.dinner = dinner;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
