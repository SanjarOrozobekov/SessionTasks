package Interface_session.task2.models;

import Interface_session.task2.serviceimpl.MessegeFormatter;

public class UpperCaseFormatter implements MessegeFormatter {
    @Override
    public void formatMassege(String massege) {
        System.out.println(massege.toUpperCase());

    }
}
