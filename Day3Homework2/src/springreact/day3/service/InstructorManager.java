package springreact.day3.service;

import springreact.day3.model.User;

public class InstructorManager extends UserManager {

    @Override
    public void add(User user) {
        System.out.println("Ad Soyad: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Eğitmen eklendi.");
    }

    @Override
    public void delete(User user) {
        System.out.println("Ad Soyad: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Eğitmen silindi.");
    }

}
