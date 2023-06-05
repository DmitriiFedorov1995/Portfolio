package models;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {

    /* Класс Ticket пакета models реализуем по аналогии c домашним заданием по тестированию API.
       Класс должен содержать набор полей, необходимый для заполнения формы создания тикета.
       Тип данных для каждого поля должен соответствовать документации swagger (см. раздел Models в документации). */

    // todo: остальные поля класса
    private String title;
    private String due_date;
    private File file;
    private Integer id = 3271;
    private String assigned_to;
    private String created;
    private String modified;
    private String submitter_email;
    private Integer status;
    private Boolean on_hold;
    private String description;
    private String resolution;
    private Integer priority;
    private String last_escalation;
    private Integer queue;
    private Integer kbitem;
    private Integer merged_to;

    public Ticket() {
    }

    // todo: остальные геттеры и сеттеры

    public Integer getId() {
        return id;
    }

    public String getAssigned_to() {
        return assigned_to;
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

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
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

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public void setKbitem(Integer kbitem) {
        this.kbitem = kbitem;
    }

    public void setMerged_to(Integer merged_to) {
        this.merged_to = merged_to;
    }

    //геттеры и сеттеры основных полей
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDue_date() {
        return due_date;
    }

    // обычный сеттер
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    // перегруженный сеттер, который принимает дату и форматирует её в строку по шаблону
    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
