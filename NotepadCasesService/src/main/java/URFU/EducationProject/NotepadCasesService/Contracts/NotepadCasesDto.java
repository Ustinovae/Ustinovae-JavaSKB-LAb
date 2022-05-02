package URFU.EducationProject.NotepadCasesService.Contracts;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NotepadCasesDto {
    @NotEmpty
    private String name;
    @NotNull
    @Size(max = 10)
    private String[] events;

    public String getName() {
        return name;
    }

    public String[] getEvents() {
        return events;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEvents(String[] events) {
        this.events = events;
    }
}
