package lastSeen.commonObjects;

import lastSeen.commonObjects.PersonalInfo;
import lastSeen.DataBase.dbObjects.Contact;
import lastSeen.DataBase.dbObjects.Trip;
import lastSeen.DataBase.dbObjects.MissingPerson;


/**
 * Created by Amir-Sk on 24/11/2015.
 */
public class User {
    private String id;
    private String password;
    private String gender;
    private String address;
    private String country;
    private String picUrl
    private PersonalInfo info;
    private Contact contact;
    private List<Trip> trips;
    private List<MissingPerson> missPersons;
    private boolean isRescueTeam;

    public User(){}

    public User(String id, String password, String gender, String address,
    String country, String picUrl, PersonalInfo info, Contact contact, List<Trip> trips,
    List<MissingPerson> missPersons, boolean isRescueTeam){
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.country = country;
        this.picUrl = picUrl;
        this.info = info;
        this.contact = contact;
        this.trips = trips;
        this.missPersons = missPersons;
        this.isRescueTeam = isRescueTeam;
    }

    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getPicurl(){
        return this.picUrl;
    }    

    public void setPicurl(String picUrl){
        this.picUrl = picUrl
    }

    public PersonalInfo getInfo(){
        return this.info;
    }

    public void setInfo(PersonalInfo info){
        this.info = info;
    }

    public Contact getContact(){
        return this.contact;
    }

    public void setContact(Contact contact){
        this.contact = contact;
    }

    public List<Trip> getTrips(){
        return this.trips;
    }

    public void setTrips(List<Trip> trips){
        this.trips = trips;
    }

    public List<MissingPerson> getMissperson (){
        return this.MissPerson;
    }

    public void setId(List<MissingPerson> missPersons){
        this.missPersons = missPersons;
    }

    public boolean getIsrescueteam(){
        return this.isRescueTeam;
    }    

    public void setIsrescueteam(boolean isRescueTeam){
        this.isRescueTeam = isRescueTeam;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id).append(", password:").append(password)
        .append(", gender: ").append(gender).append(", address: ").append(address)
        .append(", country: ").append(country).append(", picUrl: ").append(picUrl)
        .append(", info: ").append(info).append(", contact: ").append(contact)
        .append(", trips: ").append(trips).append(", missPerson: ").append(missPerson)
        .append(", isRescueTeam: ");
        return sb.toString();
    }

}
