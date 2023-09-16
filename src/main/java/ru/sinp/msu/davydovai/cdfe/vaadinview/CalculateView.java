package ru.sinp.msu.davydovai.cdfe.vaadinview;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/calculate")
public class CalculateView extends VerticalLayout {
    public CalculateView() {
        add(new MainNavBar());
        add(new Text("Welcome to CalculateView."));
    }
}
