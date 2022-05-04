package URFU.EducationProject.NotepadCasesService.DomainCore;

import URFU.EducationProject.NotepadCasesService.Infrastructure.Exception.ValueEmptyException;

public class NotepadCases {
    private String name;
    private String[] events;

    public NotepadCases(String name, String[] events) throws Exception {
        this.name = name;
        this.events = events;

        EnsureIsValid();
    }

    public String getName() {
        return name;
    }

    public String[] getEvents() {
        return events;
    }

    private void EnsureIsValid() throws Exception {
        if (name == null)
            throw new NullPointerException("Переменая name не может быть null");
        if (name.equals(""))
            throw new ValueEmptyException("Переменная name не может быть пустой");
        if (events == null)
            throw new NullPointerException("Переменая events не может быть null");
        if (events.length > 10)
            throw new Exception("Количество дел должно быть не больше 10");
    }
}
