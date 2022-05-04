package URFU.EducationProject.NotepadCasesService.DataAccess;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryBase {
    void saveNotepadCases(NotepadCases notepadCases);
    NotepadCases[] getCollection() throws Exception;
    boolean isConnectionDB();
    void connectDB(String host, int port, String dbName);
}
