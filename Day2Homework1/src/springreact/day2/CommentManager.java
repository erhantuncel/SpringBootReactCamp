package springreact.day2;
public class CommentManager {
    public void add(Comment comment) {
        System.out.println("Yorum eklendi No: " + comment.getId());
    }

    public void delete(Comment comment) {
        System.out.println("Yorum silindi No: " + comment.getId());
    }
}
