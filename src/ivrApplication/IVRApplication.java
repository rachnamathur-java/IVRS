package ivrApplication;

import ivrApplication.services.Services;

import java.util.Scanner;

public class IVRApplication {
    public static void main(String[] args) {

        Services services = new Services();

        Scanner scanner = new Scanner(System.in);
        int languageChoice = services.executeLangaugeMenu(scanner);

        if (languageChoice == 1) {
            System.out.println("English Language Selected...");
            services.executeServicesMenu(scanner);
        } else
            System.out.println("French Language Selected...");
    }
}
