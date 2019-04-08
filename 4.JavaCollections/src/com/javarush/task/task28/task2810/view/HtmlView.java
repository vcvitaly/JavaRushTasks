package com.javarush.task.task28.task2810.view;

import com.javarush.task.task28.task2810.Controller;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.List;

public class HtmlView implements View {
    private Controller controller;
    private final String filePath = "./4.JavaCollections/src/" + this.getClass().getPackage().getName().replace(".", "/") + "/vacancies.html";

    public static void main(String[] args) {
        HtmlView htmlView = new HtmlView();
        System.out.println(htmlView.filePath);
    }

    @Override
    public void update(List<Vacancy> vacancies) {
        try {
            String updatedFileContent = getUpdatedFileContent(vacancies);
            updateFile(updatedFileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }

    private String getUpdatedFileContent(List<Vacancy> list) {

        return null;
    }

    private void updateFile(String fileContent) {

    }
}
