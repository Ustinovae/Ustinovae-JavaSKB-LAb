package URFU.EducationProject.NotepadCasesService.Infrastructure.Services;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;

import java.util.List;

public interface NotepadCasesManager {
    void saveNotepadCases(NotepadCases notepadCases);
    List<NotepadCases> getNotepadsCases() throws Exception;
}
