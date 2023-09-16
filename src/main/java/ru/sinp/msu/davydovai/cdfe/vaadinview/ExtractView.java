package ru.sinp.msu.davydovai.cdfe.vaadinview;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Receiver;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.router.Route;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@Route("/extract")
public class ExtractView extends VerticalLayout {
    public ExtractView() {
        add(new MainNavBar());
        add(new Text("Welcome to ExtractView"));

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(new Upload(new Receiver() {
            @Override
            public OutputStream receiveUpload(String fileName, String mimeType) {
                return new OutputStream() {
                    @Override
                    public void write(int b) throws IOException {
                        fileName.getBytes(StandardCharsets.UTF_8);
                    }
                };
            }
        }));
        horizontalLayout.add(new Button("Extract"));

        add(horizontalLayout);
    }
}
