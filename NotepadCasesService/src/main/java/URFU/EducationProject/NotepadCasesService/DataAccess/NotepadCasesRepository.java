package URFU.EducationProject.NotepadCasesService.DataAccess;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface NotepadCasesRepository extends MongoRepository<NotepadCases, Integer> {
}
