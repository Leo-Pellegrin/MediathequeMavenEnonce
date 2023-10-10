package mediatheque;

public class VisitorImpressionBook extends VisitorImpression{
    public void visit(CD cd) {
        System.out.println("");
    }
    
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle());
    }
}
