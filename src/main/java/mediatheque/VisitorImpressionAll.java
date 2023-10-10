package mediatheque;

public class VisitorImpressionAll extends VisitorImpression{
    
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle());
    }
    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle());
    }
}
