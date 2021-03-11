package org.group8.bostonmetrosystem;

public class Station {
    /**
     * An {@code int} which stores the stations ID
     */
    private int id;
    /**
     * A {@code String} which stores the station name
     */
    private String name;
    /**
     * A {@code String} which stores which line the metro takes
     */
    private String metroLine;

    /**
     * Constructs a station with the specified ID and Name
     * @param id the ID of a Station
     * @param name the name of the station
     */
    Station(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the station ID
     * @return station ID
     */
    public int getID(){
        return id;
    }

    /**
     * Gets the station name
     * @return station name
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the Metro Line
     * @return the metro line
     */
    public String getMetroLine(){
        return metroLine;
    }

    /**
     * Sets the line for the metro
     * @param line the line the metro is going to take from the station
     */
    public void setMetroLine(String line){
        metroLine = line;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * Overrides equals method to allow station objects to be properly compared
     * @param obj The object you're checking this station object is equal to
     * @return {@code true} if the objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.getID() == ((Station) obj).getID();
    }

    /**
     * Overrides the hashcode to allow proper equality checking
     * @return {@code int} the hascode of the object
     */
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}