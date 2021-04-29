package springreact.day2;
public class LectureManager {
    public void add(Lecture lecture) {
        System.out.println("Ders eklendi: " + lecture.getName() + "(" + lecture.getSubject() + ")");
    }

    public void delete(Lecture lecture) {
        System.out.println("Ders silindi: " + lecture.getName() + "(" + lecture.getSubject() + ")");
    }
}
