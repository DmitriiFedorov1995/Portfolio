package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/** Объект тикета (POJO) */
public class Ticket {

    // todo: serialized поля, геттеры и сеттеры
    @SerializedName("id")
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return  Objects.equals(getDue_date(), ticket.getDue_date())
                && Objects.equals(getAssigned_to(), ticket.getAssigned_to())
                && Objects.equals(getTitle(),
                ticket.getTitle()) && Objects.equals(getCreated(), ticket.getCreated()) && Objects.equals(getModified(),
                ticket.getModified()) && Objects.equals(getSubmitter_email(), ticket.getSubmitter_email()) && Objects.equals(getStatus(),
                ticket.getStatus()) && Objects.equals(getOn_hold(), ticket.getOn_hold()) && Objects.equals(getDescription(),
                ticket.getDescription()) && Objects.equals(getResolution(), ticket.getResolution()) && Objects.equals(getPriority(),
                ticket.getPriority()) && Objects.equals(getLast_escalation(), ticket.getLast_escalation()) && Objects.equals(getSecret_key(),
                ticket.getSecret_key()) && Objects.equals(getQueue(), ticket.getQueue()) && Objects.equals(getKbitem(),
                ticket.getKbitem()) && Objects.equals(getMerged_to(), ticket.getMerged_to());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDue_date(), getAssigned_to(), getTitle(), getCreated(), getModified(), getSubmitter_email(), getStatus(), getOn_hold(), getDescription(), getResolution(), getPriority(), getLast_escalation(), getSecret_key(), getQueue(), getKbitem(), getMerged_to());
    }
}
