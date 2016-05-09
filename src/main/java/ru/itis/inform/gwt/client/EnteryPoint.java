package ru.itis.inform.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
import ru.itis.inform.gwt.client.api.UserAPI;

/**
 * Created by Galiullin_ko on 09/05/16.
 */
public class EnteryPoint implements EntryPoint, ValueChangeHandler {
    private static final String SERVICE_ROOT_URL = "localhost:8080";
    VerticalPanel verticalPanel = new VerticalPanel();
    Label label = new Label();


    public void onModuleLoad(){
        Defaults.setServiceRoot(SERVICE_ROOT_URL);

        Hyperlink hLinkToDocuments = new Hyperlink("Documents", "getDocuments");
        Hyperlink hLinkToDocument = new Hyperlink("Document", "getDocumentById");
        Hyperlink hLinkToAddNewDocument = new Hyperlink("New document", "addNewDocument");

        verticalPanel.getElement().getStyle().setProperty("marginLeft", "auto");

        verticalPanel.add(hLinkToAddNewDocument);
        verticalPanel.add(hLinkToDocument);
        verticalPanel.add(hLinkToDocuments);


        RootPanel.get().add(verticalPanel);
        History.addValueChangeHandler(this);

        changePage(History.getToken());
        addRegistredForm();

    }

    public void onValueChange(ValueChangeEvent valueChangeEvent) {
        changePage(History.getToken());

    }
    public void changePage(String token) {
        if (History.getToken().equals("browse")) {
            label.setText("Here would be some books");
        } else if (History.getToken().equals("details")) {
            label.setText("Here would be the user details");
        } else {
            label.setText("Welcome page");
        }
    }

    public void addRegistredForm(){
        final FormPanel form = new FormPanel();
        form.setAction("/signup");
        form.setEncoding(FormPanel.ENCODING_MULTIPART);
        form.setMethod(FormPanel.METHOD_POST);
        form.setHeight("10");

        VerticalPanel panel = new VerticalPanel();
        panel.setSpacing(10);
        panel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        form.setWidget(panel);

        final TextBox emailTB = new TextBox();
        final Label emailLabel = new Label("Email");
        emailTB.setWidth("220");
        emailTB.setName("Email");

        final TextBox nameTB = new TextBox();
        final Label nameLabel = new Label("Name");
        nameTB.setWidth("220");
        nameTB.setName("Name");

        final TextBox passwordTB = new TextBox();
        final Label paswordLabel = new Label("Password");
        passwordTB.setWidth("220");
        passwordTB.setName("Password");

        final TextBox confPassTB = new TextBox();
        final Label confPassLabel = new Label("Сonfirmation password");
        confPassTB.setWidth("220");
        confPassTB.setName("Сonfirmation");

        final Label registrationLabel = new Label("Sign up");

        panel.add(registrationLabel);
        panel.add(emailLabel);
        panel.add(emailTB);
        panel.add(nameLabel);
        panel.add(nameTB);
        panel.add(paswordLabel);
        panel.add(passwordTB);
        panel.add(confPassLabel);
        panel.add(confPassTB);


        panel.add(new Button("Sign up", new ClickHandler() {
            public void onClick(ClickEvent event) {
                form.submit();
            }
        }));

        form.addSubmitHandler(new FormPanel.SubmitHandler() {
            public void onSubmit(FormPanel.SubmitEvent event) {
                String message="";
                if (emailTB.getText().length() == 0 || nameTB.getText().length() == 0 ||
                        passwordTB.getText().length() == 0 || confPassTB.getText().length() == 0) {

                    if (emailTB.getText().length() == 0 ){
                        message += emailTB.getName() + " ";
                    }
                    if (nameTB.getText().length() == 0){
                        message += nameTB.getName() + " ";
                    }
                    if (passwordTB.getText().length() == 0){
                        message += passwordTB.getName() + " ";
                    }
                    if (confPassTB.getText().length() == 0){
                        message += confPassTB.getName() + " ";
                    }

                    Window.alert("The "+ message +" text box must not be empty");
                    event.cancel();
                }

                if (! passwordTB.getText().equals(confPassTB.getText())){
                    Window.alert("Passwords are different");
                }

                if (emailTB.getText().length() < 3 || nameTB.getText().length() < 3 || passwordTB.getText().length() < 3 ){
                    Window.alert("Email, name and password must be more than 2 ");

                }

                UserAPI client = GWT.create(UserAPI.class);



                client.addNewUser(new MethodCallback<String>() {

                    public void onFailure(Method method, Throwable throwable) {
                        VerticalPanel panel =  new VerticalPanel();
                        Label label = new Label("Error "+ throwable.getMessage());
                        panel.add(label);
                        RootPanel.get().add(panel);
                    }

                    public void onSuccess(Method method, String s) {
                        VerticalPanel panel = new VerticalPanel();
                        Label label = new Label("Ok" + s);
                        panel.add(label);
                        RootLayoutPanel.get().add(panel);

                    }

                });
            }
        });

        DecoratorPanel decoratorPanel = new DecoratorPanel();
        decoratorPanel.getStylePrimaryName();
        decoratorPanel.add(form);
        RootPanel.get().add(decoratorPanel);

    }

}
