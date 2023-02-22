package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;
    @NotBlank(message = "Field can not be blank.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;
    @Size(max=500, message = "Description too long.")
    private String description;
    @NotBlank(message = "Field can not be blank.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;
    @NotBlank(message = "Location can not be blank.")
    private String location;
    @AssertTrue(message = "Registration is required.")
    private Boolean isRegistrationRequired = true;
    @Positive(message = "Must be 1 or more attendees.")
    private Integer attendees;

    public Event(String name, String description, String contactEmail, Boolean isRegistrationRequired, Integer attendees) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.isRegistrationRequired = isRegistrationRequired;
        this.attendees = attendees;

    }
    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegistrationRequired() {
        return isRegistrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        isRegistrationRequired = registrationRequired;
    }

    public Integer getAttendees() {
        return attendees;
    }

    public void setAttendees(Integer attendees) {
        this.attendees = attendees;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
