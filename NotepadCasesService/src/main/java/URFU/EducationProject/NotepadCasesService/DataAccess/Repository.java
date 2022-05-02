package URFU.EducationProject.NotepadCasesService.DataAccess;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;

@org.springframework.stereotype.Repository
public interface Repository {
    public void saveNotepadCases(NotepadCases notepadCases);
    public NotepadCases[] getCollection() throws Exception;
}
