package ru.sinp.msu.davydovai.cdfe.vaadinview;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class MainNavBar extends VerticalLayout {
    public MainNavBar() {
        Image image = new Image("images/cdfe_logo.gif", "simple text");
        image.addClickListener(event -> {
            UI.getCurrent().navigate("/");
        });
        Div div = new Div(image);
        add(div);

    }
}
