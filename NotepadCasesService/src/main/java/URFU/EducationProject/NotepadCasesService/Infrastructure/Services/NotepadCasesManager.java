package URFU.EducationProject.NotepadCasesService.Infrastructure.Services;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;

public interface NotepadCasesManager {
    void saveNotepadCases(NotepadCases notepadCases);
    NotepadCases[] getNotepadsCases() throws Exception;
}
