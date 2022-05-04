package URFU.EducationProject.NotepadCasesService.DataAccess;

import URFU.EducationProject.NotepadCasesService.DomainCore.NotepadCases;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;


@Repository
public class RepositoryImpl implements RepositoryBase {
    private MongoDatabase db;

    public void connectDB(String host, int port, String dbName) {
        var client = new MongoClient(host, port);

        db = client.getDatabase(dbName);
    }

    public boolean isConnectionDB() {
        return db == null;
    }

    public void saveNotepadCases(NotepadCases notepadCases) {
        var collection = db.getCollection("notepadeCases");

        var document = new Document("_id", new ObjectId());
        document.append("name", notepadCases.getName())
                .append("events", Arrays.stream(notepadCases.getEvents()).toList());

        collection.insertOne(document);
    }

    public NotepadCases[] getCollection() throws Exception {
        var collection = db.getCollection("notepadeCases");
        var result = new ArrayList<NotepadCases>();
        for (var document : collection.find()) {
            var notepadCases = deserializeNotepadCase(document);
            if (notepadCases == null)
                continue;
            result.add(deserializeNotepadCase(document));
        }
        return result.toArray(new NotepadCases[result.size()]);
    }

    private NotepadCases deserializeNotepadCase(Document document) throws Exception {
        if (document == null) return null;

        var name = document.get("name").toString();
        var events = new ArrayList<String>();
        for (var event : document.getList("events", Object.class)) {
            events.add(event.toString());
        }
        return new NotepadCases(name, events.toArray(new String[events.size()]));
    }
}
