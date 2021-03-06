package io.mycat.ice.domain;

import java.util.Date;

public class IceCluster {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.LABELS
     *
     * @mbggenerated
     */
    private String labels;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.ICE_VERSION
     *
     * @mbggenerated
     */
    private String iceVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.INSTALL_TYPE
     *
     * @mbggenerated
     */
    private Byte installType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_cluster.LAST_UPDATED
     *
     * @mbggenerated
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.ID
     *
     * @return the value of ice_cluster.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.ID
     *
     * @param id the value for ice_cluster.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.NAME
     *
     * @return the value of ice_cluster.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.NAME
     *
     * @param name the value for ice_cluster.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.LABELS
     *
     * @return the value of ice_cluster.LABELS
     *
     * @mbggenerated
     */
    public String getLabels() {
        return labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.LABELS
     *
     * @param labels the value for ice_cluster.LABELS
     *
     * @mbggenerated
     */
    public void setLabels(String labels) {
        this.labels = labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.ICE_VERSION
     *
     * @return the value of ice_cluster.ICE_VERSION
     *
     * @mbggenerated
     */
    public String getIceVersion() {
        return iceVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.ICE_VERSION
     *
     * @param iceVersion the value for ice_cluster.ICE_VERSION
     *
     * @mbggenerated
     */
    public void setIceVersion(String iceVersion) {
        this.iceVersion = iceVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.INSTALL_TYPE
     *
     * @return the value of ice_cluster.INSTALL_TYPE
     *
     * @mbggenerated
     */
    public Byte getInstallType() {
        return installType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.INSTALL_TYPE
     *
     * @param installType the value for ice_cluster.INSTALL_TYPE
     *
     * @mbggenerated
     */
    public void setInstallType(Byte installType) {
        this.installType = installType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.NOTE
     *
     * @return the value of ice_cluster.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.NOTE
     *
     * @param note the value for ice_cluster.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_cluster.LAST_UPDATED
     *
     * @return the value of ice_cluster.LAST_UPDATED
     *
     * @mbggenerated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_cluster.LAST_UPDATED
     *
     * @param lastUpdated the value for ice_cluster.LAST_UPDATED
     *
     * @mbggenerated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}