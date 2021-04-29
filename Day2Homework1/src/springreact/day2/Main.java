package springreact.day2;
public class Main {
    public static void main(String[] args) throws Exception {

        LectureManager lectureManager = new LectureManager();
        Lecture lecture1 = new Lecture(1, "1.Gün", "Java Temelleri-1");
        lectureManager.add(lecture1);
        Lecture lecture2 = new Lecture(2, "2.Gün", "Java Temelleri-2");
        lectureManager.add(lecture2);
        Lecture lecture3 = new Lecture(3, "3.Gün", "Java İle Nesne Yönelimli Programlamaya Giriş");
        lectureManager.add(lecture3);
        lectureManager.delete(lecture1);
        Lecture[] javaCourse = new Lecture[] { lecture2, lecture3 };
        System.out.println("-------------- DERSLER --------------");
        System.out.printf("%-10s%-15s%n", "Ad", "Konu");
        for (Lecture lecture : javaCourse) {
            System.out.printf("%-10s%-15s%n", lecture.getName(), lecture.getSubject());
        }

        System.out.println("\n");
        CommentManager commentManager = new CommentManager();
        Comment comment1 = new Comment(1, "Ahmet", "Yorum1");
        commentManager.add(comment1);
        Comment comment2 = new Comment(2, "Mehmet", "Yorum2");
        commentManager.add(comment2);
        Comment comment3 = new Comment(3, "Veli", "Yorum3");
        commentManager.add(comment3);
        commentManager.delete(comment2);
        Comment[] comments = new Comment[] { comment1, comment3 };
        System.out.println("-------------- YORUMLAR --------------");
        System.out.printf("%-5s%-15s%-15s%n", "No", "Yorum", "Profil");
        for (Comment comment : comments) {
            System.out.printf("%-5s%-15s%-15s%n", comment.getId(), comment.getText(), comment.getProfile());
        }
    }
}
