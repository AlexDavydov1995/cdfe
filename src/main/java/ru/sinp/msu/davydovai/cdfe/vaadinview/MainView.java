package ru.sinp.msu.davydovai.cdfe.vaadinview;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
    public MainView() {
        add(new MainNavBar());

        add(new Text("Welcome to MainView."));

        HorizontalLayout horizontalLayout = new HorizontalLayout();

        horizontalLayout.add(new Button("Calculate", event -> {
            UI.getCurrent().navigate("/calculate");
        }));
        horizontalLayout.add(new Button("Extract Orlin Data", event -> {
            UI.getCurrent().navigate("/extract");
        }));

        add(horizontalLayout);
    }


}
