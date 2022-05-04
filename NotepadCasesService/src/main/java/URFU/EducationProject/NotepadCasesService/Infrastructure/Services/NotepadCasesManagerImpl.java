package URFU.EducationProject.NotepadCasesService.Infrastructure.Services;

import URFU.EducationProject.NotepadCasesService.DataAccess.RepositoryBase;
import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotepadCasesManagerImpl implements NotepadCasesManager {

    @Autowired
    private RepositoryBase repository;

    @Override
    public void saveNotepadCases(NotepadCases notepadCases) {
        if (repository.isConnectionDB())
                repository.connectDB("localhost", 27017, "Notepade");
        repository.saveNotepadCases(notepadCases);
    }

    @Override
    public NotepadCases[] getNotepadsCases() throws Exception {
        if (repository.isConnectionDB())
            repository.connectDB("localhost", 27017, "Notepade");
        return repository.getCollection();
    }
}
