package InfoUser;

import InfoUser.City;
import InfoUser.Country;
import InfoUser.RelationPartner;
import InfoUser.RelationRequest;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "first_name",
        "id",
        "last_name",
        "home_town",
        "status",
        "bdate",
        "bdate_visibility",
        "city",
        "country",
        "maiden_name",
        "phone",
        "relation",
        "relation_partner",
        "relation_requests",
        "screen_name",
        "sex"
})

public class Response {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("home_town")
    private String homeTown;
    @JsonProperty("status")
    private String status;
    @JsonProperty("bdate")
    private String bdate;
    @JsonProperty("bdate_visibility")
    private Integer bdateVisibility;
    @JsonProperty("city")
    private City city;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("maiden_name")
    private String maidenName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("relation")
    private Integer relation;
    @JsonProperty("relation_partner")
    private RelationPartner relationPartner;
    @JsonProperty("relation_requests")
    private List<RelationRequest> relationRequests = null;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("sex")
    private Integer sex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("home_town")
    public String getHomeTown() {
        return homeTown;
    }

    @JsonProperty("home_town")
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("bdate")
    public String getBdate() {
        return bdate;
    }

    @JsonProperty("bdate")
    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    @JsonProperty("bdate_visibility")
    public Integer getBdateVisibility() {
        return bdateVisibility;
    }

    @JsonProperty("bdate_visibility")
    public void setBdateVisibility(Integer bdateVisibility) {
        this.bdateVisibility = bdateVisibility;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("maiden_name")
    public String getMaidenName() {
        return maidenName;
    }

    @JsonProperty("maiden_name")
    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("relation")
    public Integer getRelation() {
        return relation;
    }

    @JsonProperty("relation")
    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    @JsonProperty("relation_partner")
    public RelationPartner getRelationPartner() {
        return relationPartner;
    }

    @JsonProperty("relation_partner")
    public void setRelationPartner(RelationPartner relationPartner) {
        this.relationPartner = relationPartner;
    }

    @JsonProperty("relation_requests")
    public List<RelationRequest> getRelationRequests() {
        return relationRequests;
    }

    @JsonProperty("relation_requests")
    public void setRelationRequests(List<RelationRequest> relationRequests) {
        this.relationRequests = relationRequests;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("sex")
    public Integer getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(Integer sex) {
        this.sex = sex;
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
