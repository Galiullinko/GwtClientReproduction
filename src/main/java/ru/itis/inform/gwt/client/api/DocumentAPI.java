package ru.itis.inform.gwt.client.api;

import org.fusesource.restygwt.client.MethodCallback;
import ru.itis.inform.gwt.models.Document;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by Galiullin_ko on 04/05/16.
 */
@Path("/document")
public interface DocumentAPI {
    @GET
    void getDocument(MethodCallback<Document> callback);
    void getListOfUserDocuments (MethodCallback<List<Document>> callback);
    void  addDocument();
}
