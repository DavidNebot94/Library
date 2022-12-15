public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Pablo", "pablo@email.com");
        System.out.println(anAuthor);
        anAuthor.setEmail("pablo@email.com");
        System.out.println(anAuthor);
    }
}
