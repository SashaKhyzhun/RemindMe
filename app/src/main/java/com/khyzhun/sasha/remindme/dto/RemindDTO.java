package com.khyzhun.sasha.remindme.dto;

//Data transfer object
import java.util.Date;

public class RemindDTO {

    private long id;
    private String title;
    private Date remindDate;

    public RemindDTO(String title) {
        this.title = title;
    }

    //обязательно должен быть пустой, потому что когда мы создаем новый конструктор,
    // то конструктор по умолчанию - перетирается
    public RemindDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}