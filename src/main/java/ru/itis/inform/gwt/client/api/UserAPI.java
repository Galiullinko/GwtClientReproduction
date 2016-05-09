package ru.itis.inform.gwt.client.api;

import com.google.gwt.editor.client.Editor;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;
import ru.itis.inform.gwt.models.User;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by Galiullin_ko on 04/05/16.
 */
@Path("/user")
public interface UserAPI extends RestService {
    @GET
    void getUsers(MethodCallback<List<User>> callback);
    @POST
    void addNewUser(MethodCallback<String> callback);
}
