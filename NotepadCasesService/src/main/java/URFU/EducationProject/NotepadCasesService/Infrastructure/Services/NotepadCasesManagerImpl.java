package URFU.EducationProject.NotepadCasesService.Infrastructure.Services;

import URFU.EducationProject.NotepadCasesService.DataAccess.RepositoryImpl;
import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class NotepadCasesManagerImpl implements NotepadCasesManager {
    private RepositoryImpl repository;

    public NotepadCasesManagerImpl(){
        repository = new RepositoryImpl();
    }

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
