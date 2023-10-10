package mediatheque;

public class VisitorImpressionCD extends VisitorImpression{
    
    public void visit(CD cd) {
        System.out.println("CD: " + cd.getTitle());
    }
    
    public void visit(Book book) {
        System.out.println("");
    }
}
