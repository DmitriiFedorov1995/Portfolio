package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;

/** Объект тикета (POJO) */
public class Ticket {

    // todo: serialized поля, геттеры и сеттеры
    @SerializedName("id")
    //@JsonIgnore
     private Integer id;
    @SerializedName("due_date")
    @JsonIgnore
     private String due_date;
    @SerializedName("assigned_to")
    @JsonIgnore
     private String assigned_to;
    @SerializedName("title")
     private String title;
    @SerializedName("created")
    @JsonIgnore
     private String created;
    @SerializedName("modified")
    @JsonIgnore
     private String modified;
    @SerializedName("submitter_email")
    @JsonIgnore
     private String submitter_email;
    @SerializedName("status")
     private Integer status;
    @SerializedName("on_hold")
    @JsonIgnore
     private Boolean on_hold;
    @SerializedName("description")
    @JsonIgnore
     private String description;
    @SerializedName("resolution")
    @JsonIgnore
     private String resolution;

    @SerializedName("priority")
     private Integer priority;
    @SerializedName("last_escalation")
    @JsonIgnore
     private String last_escalation;
    @SerializedName("secret_key")
    @JsonIgnore
     private String secret_key;
    @SerializedName("queue")
     private Integer queue;
    @SerializedName("kbitem")
    @JsonIgnore
     private Integer kbitem;
    @SerializedName("merged_to")
    @JsonIgnore
     private Integer merged_to;

    public Ticket() {

    }

    public Ticket(String title, Integer queue) {
        this.title = title;
        this.queue = queue;
    }


    public Ticket(String title, Integer queue, Integer status, Integer priority) {
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.queue = queue;
    }

    public Integer getId() {
        return id;
    }

    public String getDue_date() {
        return due_date;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public String getTitle() {
        return title;
    }

    public String getCreated() {
        return created;
    }

    public String getModified() {
        return modified;
    }

    public String getSubmitter_email() {
        return submitter_email;
    }

    public Integer getStatus() {
        return status;
    }

    public Boolean getOn_hold() {
        return on_hold;
    }

    public String getDescription() {
        return description;
    }

    public String getResolution() {
        return resolution;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getLast_escalation() {
        return last_escalation;
    }

    public String getSecret_key() {
        return secret_key;
    }

    public Integer getQueue() {
        return queue;
    }

    public Integer getKbitem() {
        return kbitem;
    }

    public Integer getMerged_to() {
        return merged_to;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void setSubmitter_email(String submitter_email) {
        this.submitter_email = submitter_email;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setOn_hold(Boolean on_hold) {
        this.on_hold = on_hold;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setLast_escalation(String last_escalation) {
        this.last_escalation = last_escalation;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public void setKbitem(Integer kbitem) {
        this.kbitem = kbitem;
    }

    public void setMerged_to(Integer merged_to) {
        this.merged_to = merged_to;
    }

    @Override
    public boolean equals(Object o) {
        // todo
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Ticket eqTick = (Ticket) o;
        return ((title != null && title.equals(eqTick.getTitle()))
                && (status != null && status.equals(eqTick.getStatus()))
                && (priority != null && priority.equals(eqTick.getPriority()))
                && (queue != null && queue.equals(eqTick.getQueue())));
    }


    @Override
    public int hashCode() {
        // todo
        return 0;
    }
}
