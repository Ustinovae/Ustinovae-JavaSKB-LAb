package URFU.EducationProject.NotepadCasesService.Infrastructure.Services;

import URFU.EducationProject.NotepadCasesService.DataAccess.NotepadCasesRepository;
import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotepadCasesManagerImpl implements NotepadCasesManager {

    @Autowired
    private NotepadCasesRepository repository;

    @Override
    public void saveNotepadCases(NotepadCases notepadCases) {
        repository.save(notepadCases);
    }

    @Override
    public List<NotepadCases> getNotepadsCases() throws Exception {
        return repository.findAll();
    }
}
