package ru.sinp.msu.davydovai.cdfe.vaadinview;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/extract")
public class ExtractView extends VerticalLayout {
    public ExtractView() {
        add(new MainNavBar());
        add(new Text("Welcome to ExtractView"));
    }
}
