package URFU.EducationProject.NotepadCasesService.Infrastructure.Services;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;

public interface NotepadCasesManager {
    public void saveNotepadCases(NotepadCases notepadCases);
    public NotepadCases[] getNotepadsCases() throws Exception;
}
