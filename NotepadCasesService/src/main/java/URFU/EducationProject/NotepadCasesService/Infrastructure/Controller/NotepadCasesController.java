package URFU.EducationProject.NotepadCasesService.Infrastructure.Controller;


import URFU.EducationProject.NotepadCasesService.Contracts.NotepadCasesDto;
import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import URFU.EducationProject.NotepadCasesService.Infrastructure.Services.NotepadCasesManagerImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/notepad-cases")
@AllArgsConstructor
@Validated
public class NotepadCasesController {
    private NotepadCasesManagerImpl notepadCasesManager;

    @PostMapping("/save-notepad-cases")
    public ResponseEntity saveNotepadCases(@Valid @RequestBody NotepadCasesDto requestDto){
        try {
            notepadCasesManager.saveNotepadCases(new NotepadCases(requestDto.getName(), requestDto.getEvents()));
            return ResponseEntity.ok("Данные сохранены");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/get-notepad-cases")
    public ResponseEntity getCollection(){
        try {
            return ResponseEntity.ok(notepadCasesManager.getNotepadsCases());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
