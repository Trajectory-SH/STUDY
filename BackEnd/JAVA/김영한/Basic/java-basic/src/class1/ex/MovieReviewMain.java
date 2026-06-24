package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview review = new MovieReview();
        review.title = "어바웃타임";
        review.review = "인생은 무한루프";
        printReview(review);
        
    }

    public static void printReview(MovieReview review) {
        System.out.println("영화제목 : " + review.title + ", 리뷰 : " + review.review);
    }
}
